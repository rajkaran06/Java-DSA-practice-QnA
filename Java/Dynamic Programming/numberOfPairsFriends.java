class Solution {
    public int countFriendsPairings(int n) {
        // code here
        int [] dp = new int[n+1];
        return friends(n,dp);
    }
    public int friends(int n,int[] dp){
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n]  = friends(n-1,dp) + (n-1)*friends(n-2,dp);
    }
}
