public class Static_method {
  int x = 5;
  final int y = 4;
  static void myMethod() {
    System.out.println("Hello World!!!");
  }

   void myMethod1() {
    System.out.println("Hello World!");
  }
  public static void main(String[] args) {
        Static_method myObj1 = new Static_method();
        myObj1.x = 40;
        myObj1.myMethod1();
        myMethod();
        System.out.println(myObj1.x);
      }
}
    
 
