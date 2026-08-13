import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {

        int[] ans = new int[heights.length];

        // Copy heights into ans
        for (int i = 0; i < heights.length; i++) {
            ans[i] = heights[i];
        }

        // Sort the copied array
        Arrays.sort(ans);

        int count = 0;

        // Compare original and sorted arrays
        for (int i = 0; i < heights.length; i++) {
            if (ans[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
}