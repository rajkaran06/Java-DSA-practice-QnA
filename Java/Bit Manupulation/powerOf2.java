class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0;i<31;i++){
            if((1<<i)==n) return true;
        }
        return false;
    }
}
//solution -2

/*
class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n & (n-1))==0);
    }
}
*/
