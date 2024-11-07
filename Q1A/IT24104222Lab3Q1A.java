import java.util.Scanner;

public class IT24104222Lab3Q1A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();
        double totalAmount = pricePerKg * quantity;
        System.out.println("Total amount to pay: " + totalAmount);
        scanner.close();
    }
}
