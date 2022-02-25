// WAP to print n-1 numbers using for loop
import java.util.Scanner;
class Question2{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter n value");    
        int n=s.nextInt();  
        
          int i=0;
          
          for(i=n;i>=1;i--){    
              System.out.print(i+" ");
          }                                         
        
       
    }
}