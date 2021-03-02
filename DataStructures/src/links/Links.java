package links;

public class Links implements LinkList{
  private Node front = null;
  private Node rear = null; 
  private int size;
  

  @Override
  public void enqueue(int data) {
    //allocate a new node in the heap
    Node node = new Node(data);
    System.out.println("Inserting: " + data);
    
    //special case: queue was empty
    if(front == null) {
      //initialize both front and rear 
      front = node;
      rear = node; 
    }else {
      // update rear
      rear.next = node;
      rear = node; 
    }
    size++;
  }
    
  //delete at the beginning 
  @Override
  public int dequeue() {
    // if the node is empty
   if(front == null) {
     System.out.println("Empty!!");
     System.exit(1);     
   }
   
   Node temp = front; 
   System.out.println("Deleting: " + temp.data); 
   
   //advance from front to the net node
   front = front.next;
   
   //if the list becomes empty
   if(front == null) {
     rear = null; 
   }
   size--;   
   //deallocate the memory of the removed node and optionally return the removed item
   int item = temp.data;   
   return item;
   
  }

  @Override
  public int frontValue() {
    if(front != null) {      
      return front.data;
    }else {
      System.exit(1);
    }
    return -1;
  }

  @Override
  public boolean isEmpty() {
      return rear == null && front == null; 
  }

  }
