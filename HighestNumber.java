/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
public class HighestNumber {
    //Add main method
    public static void main (String[] args){
     //Declare the three variables
    //Use the scanner class to provide input at execution time
          Scanner sc= new Scanner(System.in);
           System.out.println("Enter the first number");
           int a=sc.nextInt();
           System.out.println("Enter the second number");
           int b=sc.nextInt();
           System.out.println("Enter the third number");
           int c=sc.nextInt();
    
  //comparing numbers, a with b and a with c
  // if both conditions are true , print a
     if(a>=b && a>=c) {
          System.out.println(a+" is the 1st highest Number");
     }
     // comparing b with a and b with c
     // if both condition true , print b
      else if(b>=a && b>=c) {
             System.out.println(b+" is the highest number");
       }
    else 
      //print c if the abvoe condition are false
      System.out.println(c+" is the first highest number");
      
       }
     }  

// Good Job done!
