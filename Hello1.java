public class Hello1 { //class definition ,"public" means other classes have access to this class
  public static void main(String[] args) { //method definition
    System.out.println("Hello world!");
    int j = 1;
    /*
    for (int i=0; i < 5; i++) {
        
         System.out.println("i:" + i);
         System.out.println("j:" + j++);
         
    }
    */
    

    String st = "hello world!";
    //char ca[] = st.toCharArray();
    for (int i=0; i < st.length(); i++) {
      if ((i%2)!=0) {
      char c=st.charAt(i);
      System.out.println(c);
      //System.out.println(ca[i]);
      }
    }
    //double ft = 0.1;
   // char[] ch = st.toCharArray();
   
   // System.out.println(ft);

  }
}
