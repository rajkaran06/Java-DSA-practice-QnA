class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // First positive number
        int low = 0, high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= 0)
                low = mid + 1;
            else
                high = mid;
        }
        int positive = n - low;

        // First non-negative number
        low = 0;
        high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < 0)
                low = mid + 1;
            else
                high = mid;
        }
        int negative = low;

        return Math.max(positive, negative);
    }
}