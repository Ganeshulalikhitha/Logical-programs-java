import java.util.Scanner;
class Gross
{
 public static void main(String args[]) 
 {
  float Basic_salary,DA,HRA,da1,hra1,GrossPayment;
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter Basic Salary Of Employee: ");
  Basic_salary=scan.nextFloat();
  System.out.println("Enter Basic DA Of Employee: "); 
  da1=scan.nextFloat();
  System.out.println("Enter Basic HRA Of Employee: ");
  hra1=scan.nextFloat();
  DA=(da1*Basic_salary)/100;
  HRA=(hra1*Basic_salary)/100;
  GrossPayment=Basic_salary+DA+HRA;
  System.out.println("Gross Salary Of Employee: "+GrossPayment);
  }
}