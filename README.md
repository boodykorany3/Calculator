# Java Console Calculator

A simple Java console application that performs basic arithmetic operations using a clean OOP structure.

## Features

- Addition
- Subtraction
- Multiplication
- Division
- User input for:
  - First number
  - Second number
  - Operation (`+`, `-`, `*`, `/`)

## Edge Case Handling

- Prevents division by zero.
- Handles non-numeric input.
- Handles invalid operators.

## Project Structure

- `src/Main.java`: Reads user input, validates data, and prints results.
- `src/Calculator.java`: Contains arithmetic methods.

## Requirements

- Java 8 or newer

## How to Run (Command Line)

```bash
javac -d out src/Main.java src/Calculator.java
java -cp out Main
```

## Example

```text
Enter first number: 12
Enter second number: 3
Enter operation (+, -, *, /): /
Result: 4.0
```

## Notes

- The app is intentionally simple and focused on fundamentals.
- Code is organized in a way that makes it easy to extend with more operations later.
