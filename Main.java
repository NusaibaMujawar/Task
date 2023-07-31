//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class CurrencyConverter {
    public CurrencyConverter() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdToEur = 0.85;
        double usdToGbp = 0.73;
        double usdToJpy = 110.28;
        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter the amount in USD: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the currency code (EUR, GBP, JPY): ");
        double convertedAmount;
        String currencySymbol;
        switch (scanner.next().toUpperCase()) {
            case "EUR":
                convertedAmount = amount * usdToEur;
                currencySymbol = "€";
                break;
            case "GBP":
                convertedAmount = amount * usdToGbp;
                currencySymbol = "£";
                break;
            case "JPY":
                convertedAmount = amount * usdToJpy;
                currencySymbol = "¥";
                break;
            default:
                System.out.println("Invalid currency code.");
                return;
        }

        System.out.printf("Converted amount: %.2f %s%n", convertedAmount, currencySymbol);
    }
}
