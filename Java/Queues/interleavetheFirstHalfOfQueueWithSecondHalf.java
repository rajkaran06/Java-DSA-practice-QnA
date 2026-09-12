/*
approach-2 :-
lec-Queues   TimeSpan - 3:24:03 ke around
step-1 - put n/2 elements from q to st
step-2 - put elements from st to q 
step-3 - put n/2 elements form q to st
step-4 - st se q mein and q se q mein (imp step)
step-5 - reverse the q using stack
*/
class Solution {
    //approach-2 :-
    public void rearrangeQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        int n= q.size();
        for(int i =1;i<=n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
         for(int i =1;i<=n/2;i++){
            st.push(q.remove());
        }
        //re-arrangement
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
            //reverse the queue
            while(q.size()>0){
                st.push(q.remove());
                
            }
            while(st.size()>0){
                q.add(st.pop());
            }
    }
}

/*class Solution {
    //approach-1 :-
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
         Queue<Integer> q2 = new LinkedList<>();
         int n = q.size();
         for(int i =1;i<=n/2;i++){
             q2.add(q.remove());
         }
         while(q2.size()>0){
             q.add(q2.remove());
             q.add(q.remove());
         }
         
    }
}*/
