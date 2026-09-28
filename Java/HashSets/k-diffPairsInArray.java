class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
         HashSet<Integer> ans = new HashSet<>();
         for(int ele: nums){
            if(set.contains(ele-k)) ans.add(ele);
            if(set.contains(ele+k)) ans.add(ele+k);
             set.add(ele);
         }
        return ans.size();
    }
}
