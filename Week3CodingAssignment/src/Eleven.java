
public class Eleven {

  public static void main(String[] args) {
    // 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    
    double[] array1 = {6,12,524};
    double[] array2 = {9,13,197};
    
    //System.out.println("The average Of Array 1 is " + (averageOfArray1/array1.length));
    //System.out.println("The average Of Array 2 is " + (averageOfArray2/array2.length));
    System.out.println(compareAverages(array1,array2));
    

  }
  
  public static boolean compareAverages(double[] array1,double[] array2) {
    double averageOfArray1 = 0;
    double averageOfArray2 = 0;
    for (int f = 0; f < array1.length; f++) {
      averageOfArray1 += array1[f];
    }
    
    for (int g = 0; g < array2.length; g++) {
      averageOfArray2 += array2[g];
    }
   if(averageOfArray1 > averageOfArray2) {
     return true;
   } else {
     return false;
   }
    
 }
}
