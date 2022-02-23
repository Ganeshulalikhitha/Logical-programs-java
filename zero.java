import java.util.Scanner;
public class zero
{
    public static void main(String args[])
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to check:");
        number=sc.nextInt();
        if(number%2==1)
            System.out.println(number+" is odd number");
        else if(number==0)
            System.out.println(number+"it's a zero");
        else
            System.out.println(number+" is even number");        
    }
}