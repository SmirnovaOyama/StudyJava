/**
 * BreakContinueDemo.java
 * Demonstrates break and continue statements
 */

public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("=== Break and Continue Demo ===");
        System.out.println();
        
        // Example 1: Break statement
        System.out.println("Example 1: Break - Stop at 5");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exit the loop when i equals 6
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // Example 2: Continue statement
        System.out.println("Example 2: Continue - Skip even numbers");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop for even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // Example 3: Finding first divisor
        System.out.println("Example 3: Find first divisor");
        int number = 30;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("First divisor of " + number + " is: " + i);
                break; // Found the first divisor, exit loop
            }
        }
        System.out.println();
        
        // Example 4: Skip multiples of 3
        System.out.println("Example 4: Print numbers 1-20, skip multiples of 3");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // Example 5: Break in nested loop (breaking outer loop)
        System.out.println("Example 5: Break in nested loop");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking outer loop at i=" + i + ", j=" + j);
                    break outerLoop; // Break the outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        System.out.println();
        
        // Example 6: Continue in nested loop
        System.out.println("Example 6: Continue in nested loop");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue; // Skip when j equals 2
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
