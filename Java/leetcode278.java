/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class leetcode278 extends VersionControl {
    public int firstBadVersion(int n) {
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isBadVersion(mid)){
                n=mid;
                right=mid-1;
            }else{
                left=mid+1;

            }
        }
        return n;
    }
}
