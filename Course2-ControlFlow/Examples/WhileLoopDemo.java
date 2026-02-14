/**
 * WhileLoopDemo.java
 * Demonstrates while and do-while loops
 */

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        System.out.println("=== While Loop Demo ===");
        System.out.println();
        
        // Example 1: Basic while loop
        System.out.println("Example 1: Count from 1 to 5");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }
        System.out.println();
        
        // Example 2: Sum until limit
        System.out.println("Example 2: Sum numbers until reaching 20");
        int sum = 0;
        int num = 1;
        while (sum < 20) {
            sum += num;
            System.out.println("Added " + num + ", sum = " + sum);
            num++;
        }
        System.out.println();
        
        // Example 3: Do-while loop (executes at least once)
        System.out.println("Example 3: Do-while loop");
        int x = 10;
        do {
            System.out.println("x = " + x);
            x--;
        } while (x > 0 && x < 5); // Condition is false, but executes once
        System.out.println();
        
        // Example 4: Input validation with do-while
        System.out.println("Example 4: Input validation");
        Scanner scanner = new Scanner(System.in);
        int age;
        do {
            System.out.print("Enter your age (1-120): ");
            age = scanner.nextInt();
            if (age < 1 || age > 120) {
                System.out.println("Invalid age! Please try again.");
            }
        } while (age < 1 || age > 120);
        System.out.println("Valid age entered: " + age);
        System.out.println();
        
        // Example 5: Menu system with while
        System.out.println("Example 5: Simple menu");
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
