
import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Welcome to the Scientific Calculator!");

        while (true) {
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /, s for sin, c for cos, t for tan, q to quit): ");
            operator = scanner.next().charAt(0);

            if (operator == 'q') {
                System.out.println("Calculator exiting...");
                break;
            }

            if (operator == 's' || operator == 'c' || operator == 't') {
                // Handle trigonometric functions
                double result = performTrigonometricOperation(num1, operator);
                System.out.println("Result: " + result);
            } else {
                // For other operators (+, -, *, /)
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();

                double result = performOperation(num1, num2, operator);
                System.out.println("Result: " + result);
            }
        }

        scanner.close();
    }

    private static double performOperation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Error: Invalid operator.");
                return Double.NaN;
        }
    }

    private static double performTrigonometricOperation(double num, char operator) {
        switch (operator) {
            case 's':
                return Math.sin(num);
            case 'c':
                return Math.cos(num);
            case 't':
                return Math.tan(num);
            default:
                System.out.println("Error: Invalid operator for trigonometric operation.");
                return Double.NaN;
        }
    }
}
