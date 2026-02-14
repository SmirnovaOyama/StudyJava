/**
 * Exercise3Solution.java
 * Solution: Temperature Converter (Celsius to Fahrenheit)
 */

public class Exercise3Solution {
    public static void main(String[] args) {
        double celsius = 25.0;
        
        // Formula: F = (C × 9/5) + 32
        // Using 9.0 and 5.0 to ensure floating-point division
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        System.out.println("Temperature Conversion:");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}
