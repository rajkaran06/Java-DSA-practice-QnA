class Solution {
    public int countSegments(String s) {
        int count = 0;
        if(s.equals("")) return 0;
        String [] a = s.split(" ");
        for(int i =0;i<a.length;i++){
            if(a[i]!="")count++;
        }
        return count;
    }
}
