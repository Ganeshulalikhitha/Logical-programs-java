//WAP to check given number is prime number or not.

 

import java.util.Scanner;
class Question8{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
         System.out.println("Enter n value");
         int n=s.nextInt();
         int count=0;
         for(int i=1;i<=n/2;i++){      
             
             if(n%i==0){
                 count++;
             }
         }
         if(count==1){
             System.out.println("Prime number");
         }
         else{
             System.out.println("Not a prime number");
         }
    }
}