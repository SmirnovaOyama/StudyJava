/**
 * OperatorsDemo.java
 * Demonstrates various operators in Java including arithmetic, comparison, and logical operators.
 */

public class OperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== Operators Demo ===");
        System.out.println();
        
        // Arithmetic Operators
        System.out.println("1. Arithmetic Operators:");
        int a = 10;
        int b = 3;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));
        System.out.println();
        
        // Assignment Operators
        System.out.println("2. Assignment Operators:");
        int x = 5;
        System.out.println("Initial x: " + x);
        x += 3; // x = x + 3
        System.out.println("After x += 3: " + x);
        x -= 2; // x = x - 2
        System.out.println("After x -= 2: " + x);
        x *= 2; // x = x * 2
        System.out.println("After x *= 2: " + x);
        x /= 2; // x = x / 2
        System.out.println("After x /= 2: " + x);
        System.out.println();
        
        // Comparison Operators
        System.out.println("3. Comparison Operators:");
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        System.out.println();
        
        // Logical Operators
        System.out.println("4. Logical Operators:");
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("condition1 = " + condition1 + ", condition2 = " + condition2);
        System.out.println("condition1 && condition2 (AND): " + (condition1 && condition2));
        System.out.println("condition1 || condition2 (OR): " + (condition1 || condition2));
        System.out.println("!condition1 (NOT): " + (!condition1));
        System.out.println();
        
        // Increment and Decrement Operators
        System.out.println("5. Increment/Decrement Operators:");
        int count = 5;
        System.out.println("Initial count: " + count);
        System.out.println("count++ (post-increment): " + (count++));
        System.out.println("count after post-increment: " + count);
        System.out.println("++count (pre-increment): " + (++count));
        System.out.println("count-- (post-decrement): " + (count--));
        System.out.println("count after post-decrement: " + count);
        System.out.println("--count (pre-decrement): " + (--count));
    }
}
