/**
 * BonusExerciseSolution.java
 * Solution: BMI Calculator
 */

import java.util.Scanner;

public class BonusExerciseSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== BMI Calculator ===");
        System.out.println();
        
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        System.out.println();
        System.out.printf("Your BMI is: %.2f%n", bmi);
        
        // BMI Categories (optional enhancement)
        System.out.print("Category: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
        scanner.close();
    }
}
