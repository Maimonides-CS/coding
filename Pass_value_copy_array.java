public class Pass_value_copy_array {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4};
    int[] aa= new int[a.length];
    int j=99;
    for (int m=0; m<a.length; m++) {
       aa[m]=a[m];
    }  
    print(aa, j);
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
 
