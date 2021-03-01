package queue;

public class QueueTester {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Queue q1 = new Queue(5);
    q1.enqueue(12);
    q1.enqueue(10);
    q1.enqueue(50);
    q1.enqueue(100);
    
    q1.dequeue();
    q1.dequeue();
    
    System.out.println(q1.frontValue());
    
    q1.enqueue(45);
    q1.enqueue(43);    
    q1.enqueue(60);
   
    
    System.out.println(q1.frontValue());   
  }
}
