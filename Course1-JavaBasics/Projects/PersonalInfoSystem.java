/**
 * PersonalInfoSystem.java
 * Mini Project: Personal Information System
 * 
 * This program collects personal information from the user and
 * calculates their BMI (Body Mass Index).
 */

import java.util.Scanner;

public class PersonalInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║  Personal Information System      ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        
        // NOTE: This example demonstrates basic input/output operations.
        // For simplicity, it assumes valid input. Advanced error handling
        // and input validation will be covered in Course 5 (Exception Handling).
        
        // Collect personal information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        
        // Calculate ideal weight range (approximate)
        double minIdealWeight = 18.5 * height * height;
        double maxIdealWeight = 24.9 * height * height;
        
        // Display results
        System.out.println();
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║         Personal Summary           ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.printf("Height: %.2f meters%n", height);
        System.out.printf("Weight: %.2f kg%n", weight);
        System.out.println();
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║          BMI Analysis              ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Category: " + category);
        System.out.printf("Ideal Weight Range: %.2f - %.2f kg%n", minIdealWeight, maxIdealWeight);
        
        // Additional calculations
        System.out.println();
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║       Additional Information       ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        
        int currentYear = 2024;
        int birthYear = currentYear - age;
        System.out.println("Approximate Birth Year: " + birthYear);
        
        // Height in feet and inches
        double totalInches = height * 39.3701; // 1 meter = 39.3701 inches
        int feet = (int) (totalInches / 12);
        int inches = (int) (totalInches % 12);
        System.out.printf("Height in feet: %d'%d\"%n", feet, inches);
        
        // Weight in pounds
        double pounds = weight * 2.20462; // 1 kg = 2.20462 pounds
        System.out.printf("Weight in pounds: %.2f lbs%n", pounds);
        
        scanner.close();
        
        System.out.println();
        System.out.println("Thank you for using Personal Information System!");
    }
}
