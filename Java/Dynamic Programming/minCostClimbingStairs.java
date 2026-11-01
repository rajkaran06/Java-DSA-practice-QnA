class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int [cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(0,cost),minCost(1,cost));
    }
    private static int minCost(int i,int[]cost){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int ans = cost[i] + Math.min(minCost(i+1,cost),minCost(i+2,cost));
        dp[i] = ans;
        return ans;
    }
}
