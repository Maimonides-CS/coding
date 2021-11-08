// Create a Main class
public class Constructor2 {
  int x;  // Create a class attribute
  int yy;
  // Create a class constructor for the Main class
  public Constructor2(int y) {
    x = 5;  // Set the initial value for the class attribute x
    yy = y;
  }
  public static void main(String[] args) {
    Constructor2 myObj = new Constructor2(6); // Create an object of class Main (This will call the constructor)
    System.out.println("The value of x in myObj is: " + myObj.x); // Print the value of x
    System.out.println("The value of y in myObj is: " + myObj.yy);
  }
}

// Outputs 5
