/**
 * Exercise5Solution.java
 * Solution: Swap Two Numbers (without using a third variable)
 */

public class Exercise5Solution {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swap without using a third variable
        a = a + b;  // a becomes 30
        b = a - b;  // b becomes 10
        a = a - b;  // a becomes 20
        
        System.out.println("\nAfter swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
