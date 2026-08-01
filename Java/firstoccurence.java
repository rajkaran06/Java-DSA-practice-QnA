class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int left = 0 , right = arr.length-1, idx=-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>k) right = mid-1;
            else if(arr[mid]<k) left = mid+1;
            else{
                idx = mid;
                right = mid-1;
            }
        }
        return idx;
    }
}
