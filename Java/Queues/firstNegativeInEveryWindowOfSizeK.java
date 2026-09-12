//timeSpan - 3:51:42 ke around
class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            if(arr[i]<0) q.add(i);//store negative nos. in queue
        }
        for(int i = 0;i<n-k+1;i++){//making windows
            while(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 &&q.peek()<=i+k-1) ans.add(arr[q.peek()]);
            else ans.add(0);
    }
    return ans;
    }
}
