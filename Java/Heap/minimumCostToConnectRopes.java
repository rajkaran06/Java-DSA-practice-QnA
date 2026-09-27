class Solution {
    public int minCost(int[] arr) {
        // code here
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele:arr) pq.add(ele);
        while(pq.size()>1){
            int a = pq.remove();
            int b = pq.remove();
            int sum = a+b;
            cost+=sum;
            pq.add(sum);
        }
            return cost;
        
    }
}
