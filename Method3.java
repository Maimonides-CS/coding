public class Method3 { //class definition ,"public" means other classes have access to this class
        static int plusMethod(int x, int y) {
          return x + y;
        }

        static double plusMethod(double x, double y) {
          return x + y;
        }

public static void main(String[] args) { //method definition
          int myNum1 = plusMethod(8, 5);
          double myNum2 = plusMethod(4.3, 6.26);
          System.out.println("int: " + myNum1);
          System.out.println("double: " + myNum2);
        }
     }



