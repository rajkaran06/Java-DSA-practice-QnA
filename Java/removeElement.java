public class removeElement {
    public static int removeElement(int[] nums, int val) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);

        System.out.print("Updated Array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}