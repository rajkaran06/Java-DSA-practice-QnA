class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        int steps=0;
        while(left<right){
            steps+=(nums[right]-nums[left]);
            left++;
            right--;
        }
        return steps;

    }
}