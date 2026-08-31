package LinkedList;
class ListNode{
  int val;
  ListNode next;
  ListNode prev;
  ListNode(int val){
    this.val = val;
  }
}
class DLL{
  ListNode head;
  ListNode tail;
  int size;
  void insertAtHead(int val){
    ListNode temp = new ListNode(val){
      ListNode temp = new ListNode(val);
      if(head==null) head = tail = temp;
    else{
      temp.next = head;
      head.prev = temp;
      head = temp;
    }
    size++;
  }
}
public class DoublyLinkedListClass {
  public static void main (String [] args){
    DLL list = new DLL();
  }
}
