class Solution {
    public int rob(int[] nums) {
        int [] dp = new int [nums.length - 1];
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        //0Th index to n-2 index
        for(int i =2;i<nums.length-1;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        //1st index to n-1 index
        int []dp1 = new int [nums.length];
        dp1[1] = nums[1];
        dp1[2] = Math.max(nums[1],nums[2]);
        for(int i =3;i<nums.length;i++){
            dp1[i] = Math.max(dp1[i-2]+nums[i],dp1[i-1]);
        }
        return Math.max(dp[dp.length-1],dp1[dp1.length-1]);
    }
}
