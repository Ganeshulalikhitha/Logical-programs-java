
import java.util.Scanner;
public class hig{

public static void main(String [] args)
{
    int x,y,z;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first number:");
    x=s.nextInt();
    System.out.println("Enter second number:");
    y=s.nextInt();
    System.out.println("Enter third number:");
    z=s.nextInt();
if(x>y && x>z)
{
    System.out.println( x +" is highest number");

}
else if(y>x && y>z)
{
    System.out.println(y +" is highest number");
}
else
System.out.println(z +" is highest number");

 
}
    
    
}