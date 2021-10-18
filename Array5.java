public class Array5 { //class definition ,"public" means other classes have access to this class
  public static void main(String[] args) { //method definition
    //String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    //int[] myNum = {10, 20, 30, 40};
   // for (int i=0; i< myNum.length ; i++) {
     // System.out.println(myNum[i]);
    //}
    int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
     for (int i=0; i< myNumbers.length; i++) {
        for (int j=0; j< myNumbers[0].length; j++) {
          //if (((i==0)&&(j==2))||((i==1)&&(j==2))) {
          //  continue;
          //}

          if (((i==0)||(i==1))&&((j==2))) {
            continue;
          }
          //if ((i==1)&&(j==2)) {
          //  continue;
          //}
          System.out.println(myNumbers[i][j]);
        }
     }



  }
}
