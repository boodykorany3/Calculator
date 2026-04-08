public class Calculator {

    // add
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    // subtract
    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    // multiply
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    // divide with zero check
    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return firstNumber / secondNumber;
    }
}
