public class Method2 { //class definition ,"public" means other classes have access to this class
      static int myMethod(String name, int age) {
        System.out.println("Hello: " + name + "! " + "Your age is: " + age);
         return 1;
      }

public static void main(String[] args) { //method definition
          int status1 =myMethod("Jack", 12);
          int status2 =myMethod("Jerry", 13);

          if (status1==1) {
            System.out.println("myMethod has been executed correctly");
          }
        }
     }



