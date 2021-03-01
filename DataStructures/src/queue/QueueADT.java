package queue;

public interface QueueADT {
  
  public void enqueue(int data);
  
  public void dequeue();
  
  public int frontValue();
  
  public boolean isEmpty(); 
  
  public boolean isFull();
  
  public int size();  

}
