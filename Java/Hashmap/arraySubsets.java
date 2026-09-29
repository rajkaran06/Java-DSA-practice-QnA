
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap<Integer,Integer> aMap = new HashMap<>();
        for(int ele:a){
            if(aMap.containsKey(ele)){
                int freq = aMap.get(ele);
                aMap.put(ele,freq+1);
            }
            else aMap.put(ele,1);
        }
        for(int ele:b){
            if(!aMap.containsKey(ele)) return false;
            int freq = aMap.get(ele);
            if(freq==0) return false;
            aMap.put(ele,freq-1);
        }
        return true;
    }
}
