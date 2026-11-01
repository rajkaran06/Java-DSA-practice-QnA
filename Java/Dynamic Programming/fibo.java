class Solution {
    //tabulation
     public int fib(int n){
        int [] dp =new int [n+1];
        if(n>=1) dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    /*
    //memoization
    static int [] dp;
    public int fibo(int n) {
         if(n<=1) return n;//base case
         if(dp[n]!=0) return dp[n];//base case
         int ans = fibo(n-1) + fibo(n-2);
         dp[n] = ans;
         return ans;
        
    }
    public int fib(int n){
        dp = new int[n+1];
        return fibo(n);
        */
    }
}
