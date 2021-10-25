public class Two_ways_sum2 { //class definition ,"public" means other classes have access to this class
        public static int sum(int k) {
           if (k<=0) return 0;
           //if (k==3) return 6;

          //if (k > 0) {
            return k + sum(k - 2);
          //} else {
          //  return 0;
          //}
        }
public static void main(String[] args) { //method definition
          int sum_interation = 0;
          for (int i=1; i<=5; i=i+2) {
              sum_interation= sum_interation + i;
          }
          
          System.out.println("Sum from for loop: " + sum_interation);
           
          int result = sum(5);
          System.out.println("Sum from recursive call: " + result);
        }
     }



