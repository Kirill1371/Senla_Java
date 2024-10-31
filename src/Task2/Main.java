package Task2;

import java.util.Scanner;

public class Main{

    private static final double USD_TO_EUR = 0.92;
    private static final double USD_TO_GBP = 0.77;
    private static final double USD_TO_JPY = 152.74;
    private static final double USD_TO_CNY = 7.11;
    private static final double USD_TO_RUB = 97.05;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в USD: ");
        double amountInUSD = scanner.nextDouble();

        double amountInEUR = convert(amountInUSD, USD_TO_EUR);
        double amountInGBP = convert(amountInUSD, USD_TO_GBP);
        double amountInJPY = convert(amountInUSD, USD_TO_JPY);
        double amountInCNY = convert(amountInUSD, USD_TO_CNY);
        double amountInRUB = convert(amountInUSD, USD_TO_RUB);

        System.out.printf("Сумма в EUR: %.2f\n", amountInEUR);
        System.out.printf("Сумма в GBP: %.2f\n", amountInGBP);
        System.out.printf("Сумма в JPY: %.2f\n", amountInJPY);
        System.out.printf("Сумма в CNY: %.2f\n", amountInCNY);
        System.out.printf("Сумма в RUB: %.2f\n", amountInRUB);

        scanner.close();
    }

    private static double convert(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}
