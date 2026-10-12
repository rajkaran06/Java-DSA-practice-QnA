class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bits = new int[30];

        for (int n : nums) {
            for (int i = 0; i < 30; i++) {
                if ((n & (1 << i)) != 0)
                    bits[i]++;
            }
        }

        long ans = 0;

        for (int j = 0; j < k; j++) {
            int num = 0;

            for (int i = 29; i >= 0; i--) {
                if (bits[i] > 0) {
                    num |= (1 << i);
                    bits[i]--;
                }
            }

            ans = (ans + (long) num * num) % 1000000007;
        }

        return (int) ans;
    }
}
