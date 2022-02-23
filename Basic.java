import java.util.Scanner;
class Basic
{
 public static void main(String args[]) 
 {
  float ba,DA,HRA,da1,hra1,GrossPayment;
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter Basic Salary Of Employee: ");
  ba=scan.nextFloat();
  System.out.println("Enter Basic DA Of Employee: "); 
  da1=scan.nextFloat();
  System.out.println("Enter Basic HRA Of Employee: ");
  hra1=scan.nextFloat();
  if(ba<=10000){
  DA=(da1*ba)/100;
  HRA=(hra1*ba)/100;
  GrossPayment=ba+DA+HRA;
  
  }
  else if(ba<=10000 && ba>20000)
  {
      DA=(da1*ba)/100;
      HRA=(hra1*ba)/100;
      GrossPayment=ba+DA+HRA;
  }
  else
  {
      DA=(da1*ba)/100;
      HRA=(hra1*ba)/100;
    GrossPayment=ba+DA+HRA;
}
  System.out.println("Gross Salary Of Employee: "+GrossPayment);
  }
}