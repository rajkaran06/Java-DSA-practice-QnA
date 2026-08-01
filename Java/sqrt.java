class Solution {
    int floorSqrt(int n) {
        // code here
         if (n==0)return 0;
        int left = 1;
        int right = n;
        while(left<=right){
            int mid = (left+right)/2;
            if(mid==n/mid){
                return mid;
            }else if(mid>n/mid){
                right= mid-1;
            }else{
                left = mid+1;
            }


        }
        return right;
    }
}
