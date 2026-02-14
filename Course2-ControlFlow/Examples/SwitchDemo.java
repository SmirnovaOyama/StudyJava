/**
 * SwitchDemo.java
 * Demonstrates switch statements for handling multiple conditions
 */

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Switch Statement Demo ===");
        System.out.println();
        
        // Example 1: Day of the week
        System.out.println("Example 1: Day of the week");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println();
        
        // Example 2: Month days
        System.out.println("Example 2: Days in month");
        int month = 2;
        int year = 2024;
        int daysInMonth;
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = 0;
        }
        System.out.println("Month " + month + " has " + daysInMonth + " days");
        System.out.println();
        
        // Example 3: Simple calculator
        System.out.println("Example 3: Simple calculator");
        int num1 = 10;
        int num2 = 5;
        char operator = '+';
        int result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                result = 0;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        System.out.println();
        
        // Interactive example
        System.out.println("=== Interactive Menu ===");
        System.out.println("1. Print Hello");
        System.out.println("2. Print Goodbye");
        System.out.println("3. Print Java is Fun");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Goodbye!");
                break;
            case 3:
                System.out.println("Java is Fun!");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}
