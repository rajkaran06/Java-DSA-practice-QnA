class Solution {
    int MOD = 1000000007;
    int[][] comb = new int[1001][1001];

    public int numOfWays(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            comb[i][0] = 1;
            comb[i][i] = 1;

            for (int j = 1; j < i; j++) {
                comb[i][j] = (comb[i - 1][j] 
                            + comb[i - 1][j - 1]) % MOD;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int x : nums) {
            list.add(x);
        }

        return (int) ((ways(list) - 1L + MOD) % MOD);
    }

    public long ways(List<Integer> nums) {
        if (nums.size() < 3) {
            return 1;
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int root = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < root) {
                left.add(nums.get(i));
            } else {
                right.add(nums.get(i));
            }
        }

        long l = ways(left);
        long r = ways(right);

        long result = comb[nums.size() - 1][left.size()];
        result = result * l % MOD;
        result = result * r % MOD;

        return result;
    }
}
