public class Print_array_element {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};    
    print(a, 0);
  }

   public static void print(int [] b, int i) {
     if (i > (b.length-1)) return; 
      
     System.out.println(b[i]);
     print(b, i+1);

   }
}
