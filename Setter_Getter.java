public class Setter_Getter {
    public static void main(String[] args) {
      Person myObj = new Person();
      //myObj.name = "John";  // error
      //System.out.println(myObj.name); // error 
      myObj.setName("John");
     System.out.println(myObj.getName()); // error 
    }
  }
  
class Person {
    private String name; // private = restricted access
  
    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }
  }
