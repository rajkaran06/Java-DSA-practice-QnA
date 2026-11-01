/*
//memoization
class Solution {
    static int []dp;
    public int rob(int[] nums) {
        dp = new int [nums.length];
        Arrays.fill(dp,-1);
        return loot(0,nums);
    }
    private int loot(int i,int[] nums){
        if(i>=nums.length) return 0;//base case
        if(dp[i]!=-1) return dp[i];//base case 
        int pick = nums[i] + loot(i+2,nums);
        int skip = loot(i+1,nums);
        int ans = Math.max(pick,skip);
        dp[i] = ans;
        return ans;
    }
}
*/
//tabulation approach lec - DP01 timespan - 2:16:24 ke arround
class Solution{
     public int rob(int[] arr){
        int [] dp = new int [arr.length];
        dp[0] = arr[0];
        if(arr.length>1) dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[arr.length-1];
     }
}
