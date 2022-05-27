
public class Application {

  public static void main(String[] args) {
   
   // 1.  Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 100} ; {
  //    System.out.println(ages[7]);
    }
   // a.  Programmatically subtract the value of the first element in the array from the value in the last element of the array 
    //(i.e. do not use ages[7] in your code). Print the result to the console.
 //   System.out.println(ages[ages.length-1]-ages[0]);
  //  b.  Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
   // Added '100' to the end and got new result.
    
  //  c.  Use a loop to iterate through the array and calculate the average age. Print the result to the console.
    float average = 0;
    for (int b = 0; b < ages.length; b++) {
      average += ages[b];
    }
  //  System.out.println("The average age is " + (average/ages.length));
    
    
  //  2.  Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    float total=0;
   // a.  Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
    for (int i =0; i < names.length; i++) {
      total += names[i].length();
  //   System.out.println(names[i]);
    }
//   System.out.println("The average name length is " + (total/names.length));
   // b.  Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
    String allNames = "";
    for (int a =0; a < names.length; a++) {
      allNames = allNames + names[a];
      if(a<(names.length-1)) {
        allNames = allNames + " ";
      }
    }
 //   System.out.println(allNames);
    
  //   3.   How do you access the last element of any array?
 //   System.out.println(ages[ages.length -1]);
    
    
  //   4.  How do you access the first element of any array?
  // System.out.println(ages[0]);
   
   
  //   5.  Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each 
    //name to the nameLengths array.
    int[] nameLengths = new int[names.length];
    for (int j =0; j < names.length; j++) {
      nameLengths[j]=names[j].length();
  //    System.out.println(nameLengths[j]);
    }
    
  //  6.  Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
    int totalLength=0;
    for (int k =0; k < nameLengths.length; k++) {
      totalLength += nameLengths[k];
    }
   // System.out.println(totalLength);
    
    
  //  7.  Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
    //(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
    
  //  System.out.println(multiplyString("Hello", 3));
  
    
    
  //  8.  Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
      String firstName = "Bob";
      String lastName = "Ross";
      String fullName = createFullName(firstName, lastName);
     
      System.out.println(fullName);
  
      //  10. Write a method that takes an array of double and returns the average of all the elements in the array.
      double average2 = 0;       
      double[] inches = {3.2, 9.1, 23.0, 64.9, 2.8, 8.7, 28.6, 93.5, 100.3}; 
      for (int e = 0; e < inches.length; e++) {
        average2 += inches[e]; 
      }  
  //    System.out.println(inches[0]);
      
 //     System.out.println("The average is " + (average2/inches.length));

   //   System.out.println(willBuyDrink(true,10.0));
      
      double averageOfArray1 = 0;
      double averageOfArray2 = 0;
      double[] array1 = {6,12,24};
      double[] array2 = {9,13,197};
      for (int f = 0; f < array1.length; f++) {
        averageOfArray1 += array1[f];
      }
      
      for (int g = 0; g < array2.length; g++) {
        averageOfArray2 += array2[g];
      }
      System.out.println("The average Of Array 1 is " + (averageOfArray1/array1.length));
      System.out.println("The average Of Array 2 is " + (averageOfArray2/array2.length));
      
      int[] intArray3 = {10,20,30,40,50};
      System.out.println(arrayOfInt(intArray3));
      
  }  /// This is the end of Main()
    public static String createFullName(String x, String y)  {
      return x + " " + y;
      
    }
    public static String multiplyString(String word, int n) {
      String result = "";
      for (int i = 0; i < n; i++) {
        result += word;
      } 
      return result;
  }
  //  9.  Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    public static boolean arrayOfInt (int[] integers) {
      int sum = 0;
      
      for (int q = 0; q < integers.length; q++) {
        sum += integers[q];
      }
      
      if(sum > 100) {
        return true;
      } else {
        return false;
      }
    }

  //  11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    public static boolean compareAverages(double[] averageOfArray1,double[] averageOfArray2) {
     if(averageOfArray1 > averageOfArray2) {
       return true;
     } else {
       return false;
     }
      
   }
    //  12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    //double moneyInPocket = 12.50;
    //boolean isHotOutside = true;
    
    public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
      if(isHotOutside && (moneyInPocket>10.50)) {
        return true;
      } else {
        return false;
      }
    }
     
}  // This is the end of Class Application
  
  


