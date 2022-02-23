import java.util.Scanner;
public class Bill
{
    public static void main(String args[])
    {
        double units=0,bill=0,gst=0,finalbill=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units");
        units=sc.nextDouble();
        
        bill=units*34.50;
        gst=(bill*18)/100;
        finalbill=bill+gst;
        
        System.out.println("bill="+bill);
        
        System.out.println("gst="+gst);
        System.out.println("final bill="+finalbill);
    }
}