package queue;

public class Queue implements QueueADT {

  int[] queue; // array to store the elements
  private int capacity; // maximum capacity of the queue
  private int rear; // rear points to the last element of the array
  private int front; // front points to the first element of the array
  private int count; // Get the current size of the array

  // constructor to initialize the queue
  public Queue(int size) {
    this.queue = new int[size];
    this.capacity = size;
    this.front = 0;
    this.rear = -1;
    this.count = 0;
  }

  // utility function to enqueue or add an item to queue
  @Override
  public void enqueue(int item) {
    // check for queue overflow and either use conditional statement or throw
    // an exception
    if (isFull()) {
      System.out.println("Queue is full");
      System.exit(1); // optional
    }
    System.out.println("Inserting element: " + item);
    rear = (rear + 1) % capacity;
    queue[rear] = item;
    count++;
  }

  // utility function to dequeue or remove the first element
  @Override
  public void dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      System.exit(1); //optional
    }
    System.out.println("Deleting element: " + queue[front]);
    front = (front + 1) % capacity;
    count--;
  }

  @Override
  public int frontValue() {
    if(isEmpty()) {
      System.out.println("Queue is empty");
      System.exit(1);
    }
    return queue[front];   
    
  }

  @Override
  public boolean isEmpty() {
    return (size() == 0);
  }
    
  @Override
  public boolean isFull() {    
    return (size() == capacity);
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return count;
  }

}
