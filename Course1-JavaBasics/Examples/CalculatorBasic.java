/**
 * CalculatorBasic.java
 * A simple calculator that performs basic arithmetic operations.
 */

import java.util.Scanner;

public class CalculatorBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===");
        System.out.println();
        
        // Get first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Get operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Get second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform calculation
        double result = 0;
        boolean validOperation = true;
        
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                validOperation = false;
            }
        } else {
            System.out.println("Error: Invalid operator!");
            validOperation = false;
        }
        
        // Display result
        if (validOperation) {
            System.out.println();
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
        }
        
        scanner.close();
    }
}
