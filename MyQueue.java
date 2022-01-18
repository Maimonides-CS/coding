import java.io.*;
import java.util.*;

public class MyQueue {
  public static void main(String[] args) {
    MyQueue1<String> queue1 = new MyQueue1<String>();
    queue1.enQueue("test1");
    queue1.enQueue("test2");
    System.out.println(queue1.deQueue());

    queue1.enQueue("test3");
    System.out.println(queue1.deQueue());

    queue1.enQueue("test4");
    System.out.println(queue1.deQueue());
   }
}

 class MyQueue1<String> {
    Stack<String> inbox = new Stack<String>();
    Stack<String> outbox = new Stack<String>();

  public void enQueue(String item) {
      inbox.push(item);
   }

  public String deQueue() {
      if (outbox.isEmpty()) {
          while (!inbox.isEmpty()) {
             outbox.push(inbox.pop());
          }
      }
      return outbox.pop();
  }
}
