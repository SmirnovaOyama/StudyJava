/**
 * MenuCalculator.java
 * Mini Project: Menu-Driven Calculator
 */

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("║      Menu-Driven Calculator        ║");
            System.out.println("╚════════════════════════════════════╝");
            System.out.println();
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
            
            double num1, num2, result;
            
            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                    break;
                    
                case 2: // Subtraction
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                    break;
                    
                case 3: // Multiplication
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.printf("Result: %.2f × %.2f = %.2f%n", num1, num2, result);
                    break;
                    
                case 4: // Division
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.printf("Result: %.2f ÷ %.2f = %.2f%n", num1, num2, result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                    
                case 5: // Modulus
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.printf("Result: %.2f %% %.2f = %.2f%n", num1, num2, result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                    
                case 6: // Power
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.printf("Result: %.2f ^ %.2f = %.2f%n", num1, num2, result);
                    break;
                    
                case 7: // Square Root
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.printf("Result: √%.2f = %.2f%n", num1, result);
                    } else {
                        System.out.println("Error: Cannot calculate square root of negative number!");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
        } while (choice != 0);
        
        scanner.close();
    }
}
