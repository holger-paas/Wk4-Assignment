package javaassignment1;

public class JavaAssignment1 {

   public static void main(String[] args) {

      // Question 1:
      int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 63};
      int agesLength = ages.length;
      System.out.println(ages[agesLength - 1] - ages[0]);
      double sumAge = 0;
      for (int age : ages) {
         sumAge += age;
      }
      System.out.println(sumAge / agesLength);
      
      // Question 2:
      String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
      int namesLength = names.length;
      double sumLetters = 0;
      for (String name : names) {
         sumLetters += name.length();
      }
      System.out.println(sumLetters / namesLength);
      
      String namesConcat = "";
      for (String name : names) {
         namesConcat += name + " ";
      }
      System.out.println(namesConcat);
      
      // Question 3:
      System.out.println( ages[ages.length - 1] );
      
      //Question 4:
      System.out.println( ages[0] );
      
      //Question 5:
      int[] nameLengths = new int[namesLength];
      for (int i = 0; i < namesLength; i++) {
         nameLengths[i] = names[i].length();         
      }
      
      // Question 6:
      int sumNameLengths = 0;
      for (int nameLength : nameLengths) {
         sumNameLengths += nameLength;
      }
      System.out.println(sumNameLengths);
      
      // Question 7:
      System.out.println(concatenateString("Hello", 3));
      
      // Question 8:
      System.out.println(fullName("Holger", "Paas"));
      
      // Question 9:
      System.out.println(sumGreater(ages));
      
      // Question 10:
      double[] numbers = {21.23, 38.93, 56.74, -7.32, 99.99};
      System.out.println(avgArray(numbers));
      
      // Question 11:
      double[] num1 = {21.23, 38.93, 56.74, -7.32, 99.99};
      double[] num2 = {21.23, 38.93, 56.74, -9.32, 99.99};
      System.out.println(avgComparison(num1, num2));
      
      // Question 12:
      System.out.println(willBuyDrink(true, 10.00));
      
      // Question 13:
      System.out.println(createEmail("Holger", "Paas"));
      
   }
   
   // Question 7:
   public static String concatenateString(String word, int n) {
      String concatenatedWord = "";
      for (int i = 0; i <  n; i++) {
         concatenatedWord += word;
      }
      return concatenatedWord;
   }
   
   // Question 8:
   public static String fullName(String firstName, String lastName) {
      return firstName + " " + lastName;
   }
   
   // Question 9:
   public static boolean sumGreater(int[] numbers) {
      int sumInts = 0;
      for (int number : numbers) {
         sumInts += number;
      }
      return sumInts > 100;
   }
   
   // Question 10:
   public static double avgArray(double[] numbers) {
      double sumDbls = 0;
      for (double number : numbers) {
         sumDbls += number;
      }
      return sumDbls / numbers.length;
   }
   
   // Question 11:
   public static boolean avgComparison(double[] num1, double[] num2) {
      return avgArray(num1) > avgArray(num2);
   }
   
   // Question 12:
   public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
      return isHotOutside && moneyInPocket > 10.50;
   }
   
   // Question 13:
   // The .createEmail() method takes first name and last name as input
   // and returns a Gmail email address given those inputs.
   public static String createEmail(String firstName, String lastName) {
      return firstName + "." + lastName + "@gmail.com";
   }


}
