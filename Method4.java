public class Method4 { //class definition ,"public" means other classes have access to this class
        public static int sum(int k) {
          if (k > 0) {
            return k + sum(k - 1);
          } else {
            return 0;
          }
        }


public static void main(String[] args) { //method definition
          int result = sum(10);
          System.out.println(result);
        }
     }



