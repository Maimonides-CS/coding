package mypack;
public class Main {
    public static void main(String[] args) {
      Person myObj = new Person();
      //myObj.name = "John";  // error
      //System.out.println(myObj.name); // error 
      myObj.setName("John");
     System.out.println(myObj.getName()); // error 
    }
  }