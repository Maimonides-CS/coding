// Create a Main class
public class Constructor3 {
  int x = 1 ;  // Create a class attribute
  int y;
  String st1;
  // Create a class constructor for the Main class
  public Constructor3(int y, String st) {
    //x = 5;  // Set the initial value for the class attribute x
    this.y = y;
    st1 = st;
  }
  public static void main(String[] args) {
    Constructor3 myObj = new Constructor3(6, "hello world"); // Create an object of class Main (This will call the constructor)
    Constructor3 myObj1 = new Constructor3(5, "hello world"); 

    System.out.println("The value of x in myObj is: " + myObj.x); // Print the value of x
    System.out.println("The value of yy in myObj is: " + myObj.y);
    System.out.println("The value of st1 in myObj is: " + myObj.st1);

    System.out.println("The value of x in myObj1 is: " + myObj1.x); // Print the value of x
    System.out.println("The value of yy in myObj1 is: " + myObj1.y);
    System.out.println("The value of st1 in myObj1 is: " + myObj1.st1);

  }
}

