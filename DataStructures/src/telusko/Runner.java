package telusko;

public class Runner {

  public static void main(String[] args) {
    
    RunnerClass r1 = new RunnerClass();
    r1.push(15);
    r1.push(5);
        
    
    System.out.println();
    
    System.out.println(r1.pop());
    r1.show();
    System.out.println();
    r1.push(6);
    r1.push(20);
    r1.show();
    System.out.println();
    System.out.println(r1.pop());
    System.out.println(r1.pop());
    r1.show();
    System.out.println();
    System.out.println(r1.peek());
    r1.push(6);
    r1.push(20);
    r1.push(6);
    r1.push(20);
    System.out.println("continue");

  }

}
