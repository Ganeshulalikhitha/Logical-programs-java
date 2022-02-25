
//WAP to check given number is perfect numebr or not.


/*6  -->   1+2+3 ==>  6
28 -->   1+2+4+7+14  ==> 28
15  -->  1+3+5  ==> 9
*/

import java.util.Scanner;
class LoopExample{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
         System.out.println("Enter n value");
         int n=s.nextInt();
          int sum=0;
          
          for(int i=1;i<=n/2;i++){   
              if(n%i==0){
                 sum=sum+i;    
              }
          }
          if(sum==n){
              System.out.println("Perfect number");
          }
          else{
              System.out.println("Not a perfect number");
          }
    }
}