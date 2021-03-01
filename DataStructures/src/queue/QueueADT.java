package queue;

public interface QueueADT {
  
  public void enqueue(int data);
  
  public void dequeue();
  
  public void frontValue();
  
  public boolean isEmpty(); 
  
  public int capacity();
  
  public boolean isFull();
  
  
  

}
