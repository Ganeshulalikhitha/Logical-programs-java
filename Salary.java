
    import java.util.Scanner;
public class Salary
{
    public static void main(String[] args)
    {
     
            Scanner sc=new Scanner(System.in);
            
System.out.println("enter salary");
int salary=sc.nextInt();
System.out.println("enter shopping amount");
int s1=sc.nextInt();
int s2=sc.nextInt();
int s3=sc.nextInt();

int total=s1+s2+s3;
double percentage=total*100/salary;

System.out.println("The total shopping amount " +total );
System.out.println("percentage spent " +percentage );

}
}
