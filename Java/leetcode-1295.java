class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int numsOfDigits = 0;
            while(nums[i]!=0){
                nums[i]/=10;
                numsOfDigits++;
            }
            if(numsOfDigits%2==0){
                ans++;
            }
        }
        return ans;
    }
}
