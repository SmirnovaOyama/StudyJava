/**
 * InputOutputDemo.java
 * Demonstrates reading input from the user and displaying output.
 */

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Input/Output Demo ===");
        System.out.println();
        
        // Reading a String
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Reading an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Reading a double
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();
        
        // Reading a boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        // Display the information
        System.out.println();
        System.out.println("=== Your Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " meters");
        System.out.println("Student status: " + (isStudent ? "Yes" : "No"));
        
        // Using printf for formatted output
        System.out.println();
        System.out.println("=== Formatted Output ===");
        System.out.printf("Hello, %s! You are %d years old.%n", name, age);
        System.out.printf("Your height is %.2f meters.%n", height);
        
        // Calculate birth year (approximate)
        int currentYear = 2024;
        int birthYear = currentYear - age;
        System.out.printf("You were born approximately in %d.%n", birthYear);
        
        // Close the scanner
        scanner.close();
    }
}
