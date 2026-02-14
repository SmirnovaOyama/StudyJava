/**
 * NestedLoopsDemo.java
 * Demonstrates nested loops and their applications
 */

public class NestedLoopsDemo {
    public static void main(String[] args) {
        System.out.println("=== Nested Loops Demo ===");
        System.out.println();
        
        // Example 1: Basic nested loop
        System.out.println("Example 1: Basic nested loop");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Example 2: Multiplication table
        System.out.println("Example 2: Multiplication table (1-5)");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        System.out.println();
        
        // Example 3: Rectangle pattern
        System.out.println("Example 3: Rectangle pattern");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Example 4: Right triangle pattern
        System.out.println("Example 4: Right triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Example 5: Inverted right triangle
        System.out.println("Example 5: Inverted right triangle");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Example 6: Number pyramid
        System.out.println("Example 6: Number pyramid");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
