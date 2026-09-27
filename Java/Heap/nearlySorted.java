class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        //minheap
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) arr[idx++] = pq.remove();
        }
        // kyuki minHeap mein k largest elements abhi bhi baache h
        while(pq.size()>0) arr[idx++] = pq.remove();
    }
}
