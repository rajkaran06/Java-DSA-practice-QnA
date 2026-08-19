class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int idx=nums[i]-1;
            if(nums[i]!=nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;


            }else{
                if(i!=idx){
                    return nums[i];
                }
                i++;
            }
        }
        return -1;
    }
}