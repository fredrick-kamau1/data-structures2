package queue;

public class Queue implements QueueADT {

  // private int size;
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
    System.out.println("Inserting element" + item);
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
    System.out.println("Deleting element " + queue[front]);
    front = (front + 1) % capacity;
    count--;
  }

  @Override
  public void frontValue() {

  }

  @Override
  public boolean isEmpty() {

    return false;
  }

  @Override
  public int capacity() {

    return 0;
  }

  public void show() {
    for (int i = 0; i < capacity; i++)
      System.out.print(queue[(front + i) % 5] + " ");
  }

  @Override
  public boolean isFull() {
    // TODO Auto-generated method stub
    return false;
  }

}
