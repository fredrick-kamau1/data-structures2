package stacks;

public class RunnerClass implements StackADT{

  private int size; 
  private int[] stack;
  private int top; 
  
  public RunnerClass()
  {    
    this.top = -1; 
    this.size = 5; 
    this.stack = new int[this.size]; 
  }
  
  
  
  @Override
  public void push(int data) {
    if(isFull()) {
      throw new RuntimeException("Stack is full"); 
      }else {    
     stack[++top] = data; 
      }
     
     
  }

  @Override
  public int peek() {
    // TODO Auto-generated method stub   
    return stack[top]; 
  }

  @Override
  public int pop() {
    // TODO Auto-generated method stub
    return stack[top--];
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isFull() {
    // TODO Auto-generated method stub
    
    return (size == 5);
  }

public void show() {
  for(int output : this.stack) 
  System.out.print(output + " ");  
}
}
