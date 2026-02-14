/**
 * IfElseDemo.java
 * Demonstrates if-else statements and conditional logic
 */

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== If-Else Statement Demo ===");
        System.out.println();
        
        // Example 1: Simple if statement
        System.out.println("Example 1: Simple if");
        int temperature = 25;
        if (temperature > 30) {
            System.out.println("It's hot outside!");
        }
        System.out.println("Current temperature: " + temperature + "°C");
        System.out.println();
        
        // Example 2: If-else statement
        System.out.println("Example 2: If-else");
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
        System.out.println();
        
        // Example 3: If-else-if ladder
        System.out.println("Example 3: If-else-if ladder");
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        System.out.println();
        
        // Example 4: Nested if statements
        System.out.println("Example 4: Nested if");
        int number = 15;
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is positive and even");
            } else {
                System.out.println(number + " is positive and odd");
            }
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println("Number is zero");
        }
        System.out.println();
        
        // Example 5: Ternary operator
        System.out.println("Example 5: Ternary operator");
        int x = 10;
        String result = (x % 2 == 0) ? "Even" : "Odd";
        System.out.println(x + " is " + result);
        
        // Interactive example
        System.out.println();
        System.out.println("=== Interactive Example ===");
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        
        if (userAge < 13) {
            System.out.println("You are a child");
        } else if (userAge < 20) {
            System.out.println("You are a teenager");
        } else if (userAge < 60) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior");
        }
        
        scanner.close();
    }
}
