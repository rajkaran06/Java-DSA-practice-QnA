import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;

        while (i < arr.length) {

            int idx = arr[i] - 1;

            if (arr[i] == i + 1 || arr[idx] == arr[i]) {
                i++;
            } else {
                swap(arr, i, idx);
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}