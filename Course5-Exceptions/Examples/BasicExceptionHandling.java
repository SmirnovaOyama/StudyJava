/**
 * BasicExceptionHandling.java
 * Demonstrates basic exception handling concepts
 */

public class BasicExceptionHandling {
    public static void main(String[] args) {
        System.out.println("=== Basic Exception Handling Demo ===");
        System.out.println();
        
        // Example 1: ArithmeticException
        System.out.println("Example 1: Division by zero");
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Exception message: " + e.getMessage());
        }
        System.out.println("Program continues...");
        System.out.println();
        
        // Example 2: ArrayIndexOutOfBoundsException
        System.out.println("Example 2: Array index out of bounds");
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Accessing index 10...");
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
            System.out.println("Exception message: " + e.getMessage());
        }
        System.out.println("Program continues...");
        System.out.println();
        
        // Example 3: NullPointerException
        System.out.println("Example 3: Null pointer");
        try {
            String text = null;
            System.out.println("String length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Trying to use a null object!");
            System.out.println("Exception message: " + e.getMessage());
        }
        System.out.println("Program continues...");
        System.out.println();
        
        // Example 4: Multiple exceptions
        System.out.println("Example 4: Multiple possible exceptions");
        try {
            String numStr = "abc";
            int num = Integer.parseInt(numStr);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
            System.out.println("Exception message: " + e.getMessage());
        }
        System.out.println("Program continues...");
        System.out.println();
        
        // Example 5: Finally block
        System.out.println("Example 5: Finally block");
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Finally block always executes!");
        }
        System.out.println();
        
        // Example 6: Nested try-catch
        System.out.println("Example 6: Nested try-catch");
        try {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array error");
            }
            
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Arithmetic error");
        }
        
        System.out.println();
        System.out.println("Program ended successfully!");
    }
}
