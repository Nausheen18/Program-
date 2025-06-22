import java.util.Scanner;

public class FinancialForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter initial balance (P): ₹");
        double principal = sc.nextDouble();

        System.out.print("Enter monthly deposit (PMT): ₹");
        double monthlyDeposit = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        // Calculations
        double monthlyRate = annualRate / 100 / 12;
        int months = years * 12;

        // Future value formula
        double futureValue = principal * Math.pow(1 + monthlyRate, months)
                           + (monthlyDeposit * (Math.pow(1 + monthlyRate, months) - 1) / monthlyRate);

        // Output
        System.out.printf("\nProjected balance after %d years: ₹%.2f\n", years, futureValue);

        sc.close();
    }
}
