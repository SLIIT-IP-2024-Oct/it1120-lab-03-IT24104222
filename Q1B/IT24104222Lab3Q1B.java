import java.util.Scanner;
public class IT24104222Lab3Q1B{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();
        double amount = pricePerKg * quantity;
        double discount  = amount*(10.0/100.0);
        double totalAmount= amount - discount;
      System.out.println("totalAmount with 10% discount:" + totalAmount);
        
        
    }
}