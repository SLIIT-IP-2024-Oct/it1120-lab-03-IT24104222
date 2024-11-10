import java.util.Scanner;
public class IT24104222Lab3Q2{
  public static void main(String args []){
Scanner scanner= new Scanner(System.in);
System.out.println("Enter the monthly salary");
 double salary = scanner.nextDouble();
System.out.println("Enter the  number of OT hours");
 double otHours = scanner.nextDouble();
System.out.println("Enter the  OT hourly rate");
 double otHourlyRate = scanner.nextDouble();
  double otAmount = otHours * otHourlyRate;
  double totalSalary = salary + otAmount;
System.out.println("The total monthly salary including oT" + totalSalary);
}
    }
