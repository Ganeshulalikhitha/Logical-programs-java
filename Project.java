
/*WAP to accept project marks, internal marks, external marks. find total marks.

totalmarks:
1. 70% on project
2. 20% on external
3. 10% on internal*/




import java.util.Scanner;
public class Project
{
    public static void main(String args[])
    {
        int marks=0,pr=0,in=0,ex=0,total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        marks=sc.nextInt();
        pr=(marks/100)*70;
        in=(marks/100)*10;
        ex=(marks/100)*20;
        total=pr+in+ex;
        System.out.println("total marks"+total);
        System.out.println("project-marks is"+pr);
        System.out.println("internal-marks is"+in);
        System.out.println("external-marks is"+ex);
    }
}