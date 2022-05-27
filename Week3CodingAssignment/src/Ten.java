
public class Ten {

  public static void main(String[] args) {
  //  10. Write a method that takes an array of double and returns the average of all the elements in the array.
 
    double average = 0;       
    double[] inches = {3.2, 9.1, 23.0, 64.9, 2.8, 8.7, 28.6, 93.5, 100.3}; 
    for (int e = 0; e < inches.length; e++) {
      average += inches[e]; 
    }  
          System.out.println("The average is " + (average/inches.length));
  }
}