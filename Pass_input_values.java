public class Pass_input_values {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4};
    int j=99;    
    print(a, j);
    for (int i=0; i<a.length; i++) {
      System.out.println(a[i]);
    }
    System.out.println("j: "+ j);
  }

   public static void print(int [] b, int j) {
     b[0] = 3;
     j = 90;
   }
}
