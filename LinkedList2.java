// Import the LinkedList class
import java.util.LinkedList;

public class LinkedList2 {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.offer("GM");
    String st = cars.poll();
    System.out.println(st);
    System.out.println(cars);
  }
}
