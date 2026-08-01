class Solution {
    int single(int[] arr) {
        // code here
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1])return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int left = 0,right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            int f= mid, s=mid;
            if(arr[mid-1] == arr[mid]){
                f=mid-1;
            }else{
                s=mid=1;
            }
            int leftCount = f-left;
            int rightCount = right - s;
            if(leftCount%2 == 0)left = s+1;
            else right = f-1;
        }
        return 0;
    }
}
