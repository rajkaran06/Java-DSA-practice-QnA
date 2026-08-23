package linkedList;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size;
    boolean search(int val){
        if(head==null) return false;
        Node temp = head;
        while(temp !=null){
            if(temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }
    void addAtHead (int val){
         Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head==null) {
            System.out.println("list is empty");
            return ;
        }
        head = head.next;
        if(head==null) tail=null;
        size--;
    }
    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class linkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(50);
        ll.display();
        ll.addAtHead(60);
        ll.display();
        ll.addAtHead(70);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);
    }
}
 