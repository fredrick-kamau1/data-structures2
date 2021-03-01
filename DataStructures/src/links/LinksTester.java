package links;

public class LinksTester {

  public static void main(String[] args) {
    
    Links l1 = new Links();
    l1.enqueue(15);
    l1.enqueue(20);
    l1.enqueue(78);
    l1.enqueue(36);
    
    l1.dequeue();
    
    System.out.println(l1.frontValue());

  }
}
