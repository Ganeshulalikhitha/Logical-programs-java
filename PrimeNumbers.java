/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
public class PrimeNumbers {
//Add main method here
  public static void main(String[]args){
   //Declare variables num1, num2, i, count and initialize count as zero
   int i ,count;
   //Use the scanner class to provide input at execution time using scanner object
   Scanner sc= new Scanner(System.in);
   System.out.println("enter starting value:");
   int k=sc.nextInt();
   System.out.print("enter  n value:");
   int n=sc.nextInt();
   System.out.println("prime number between  1 to "+n+" are ");
   for(int j=k;j<=n;j++) {
    count=0;
    for (i=1;i<=j;i++) {
        if (j%i==0) {
            count++;
        }
    }
    if (count==2)
       System.out.print(j+ " ");
     }
   }
 }

// Good Job done!

     
