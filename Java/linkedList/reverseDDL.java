/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node pre = null;
        Node curr = head;
        Node fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = pre;
            curr.prev = fwd;
            pre = curr;
            curr = fwd;
        }
        return pre;
    }
}
