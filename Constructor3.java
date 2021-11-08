// Create a Main class
public class Constructor3 {
  int x;  // Create a class attribute
  int yy;
  String st1;
  // Create a class constructor for the Main class
  public Constructor3(int y, String st) {
    x = 5;  // Set the initial value for the class attribute x
    yy = y;
    st1 = st;
  }
  public static void main(String[] args) {
    Constructor3 myObj = new Constructor3(6, "hello world"); // Create an object of class Main (This will call the constructor)
    System.out.println("The value of x in myObj is: " + myObj.x); // Print the value of x
    System.out.println("The value of yy in myObj is: " + myObj.yy);
    System.out.println("The value of st1 in myObj is: " + myObj.st1);
  }
}

// Outputs 5
