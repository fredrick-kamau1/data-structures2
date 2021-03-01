package links;

//A Linked List Node
class Node
{
 protected int data;       // data each object contains
 protected Node next;      // pointer to the next node connected to previous 

 public Node(int data)
 {
     // set data in the allocated node and return it
     this.data = data;
     this.next = null;
 }
}