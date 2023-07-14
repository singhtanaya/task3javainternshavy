import java.util.Scanner;

public class currencyconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("=================");

        while (true) {
            System.out.println("\n1. INR to USD");
            System.out.println("2. USD to INR");
            System.out.println("3. Quit");
            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("\nEnter amount in INR: ");
                double inr = scanner.nextDouble();
                double usd = inr / 75.0; // Conversion rate: 1 USD = 75.0 INR
                System.out.println("Amount in USD: " + usd);
            } else if (choice == 2) {
                System.out.print("\nEnter amount in USD: ");
                double usd = scanner.nextDouble();
                double inr = usd * 75.0; // Conversion rate: 1 USD = 75.0 INR
                System.out.println("Amount in INR: " + inr);
            } else if (choice == 3) {
                System.out.println("\nThank you for using the Currency Converter!");
                break;
            } else {
                System.out.println("\nInvalid choice! Please choose a valid option.");
            }
        }

        scanner.close();
    }
}
