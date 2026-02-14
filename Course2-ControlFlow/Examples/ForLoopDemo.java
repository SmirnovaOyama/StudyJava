/**
 * ForLoopDemo.java
 * Demonstrates for loop with various examples
 */

public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("=== For Loop Demo ===");
        System.out.println();
        
        // Example 1: Basic for loop
        System.out.println("Example 1: Count from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();
        
        // Example 2: Count backwards
        System.out.println("Example 2: Countdown from 5 to 1");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Blast off!");
        System.out.println();
        
        // Example 3: Skip numbers
        System.out.println("Example 3: Even numbers from 2 to 10");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // Example 4: Multiplication table
        System.out.println("Example 4: Multiplication table of 5");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 × " + i + " = " + (5 * i));
        }
        System.out.println();
        
        // Example 5: Sum of numbers
        System.out.println("Example 5: Sum of numbers 1 to 10");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        System.out.println();
        
        // Example 6: Factorial
        System.out.println("Example 6: Factorial of 5");
        int factorial = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        System.out.println();
        
        // Example 7: For loop with strings
        System.out.println("Example 7: Print each character");
        String word = "Java";
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Character at index " + i + ": " + word.charAt(i));
        }
    }
}
