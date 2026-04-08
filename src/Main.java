import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            // read numbers
            System.out.print("Enter first number: ");
            double firstNumber = input.nextDouble();

            System.out.print("Enter second number: ");
            double secondNumber = input.nextDouble();

            // read operation
            System.out.print("Enter operation (+, -, *, /): ");
            char operation = input.next().charAt(0);

            double result;

            if (operation == '+') {
                result = calculator.add(firstNumber, secondNumber);
            } else if (operation == '-') {
                result = calculator.subtract(firstNumber, secondNumber);
            } else if (operation == '*') {
                result = calculator.multiply(firstNumber, secondNumber);
            } else if (operation == '/') {
                result = calculator.divide(firstNumber, secondNumber);
            } else {
                throw new IllegalArgumentException("Invalid operator.");
            }

            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only.");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
