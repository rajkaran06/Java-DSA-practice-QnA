class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int maxSum = 0;
         int currSum = 0;
         for(int i = 0 ; i<k;i++){
            currSum += nums[i];
         }
         maxSum = currSum;
         for(int i=k;i<nums.length;i++){
            currSum += nums[i]- nums[i-k];
            if(currSum>maxSum){
                maxSum = currSum;
            }
         }
         return (double)maxSum/k;
    }
}
