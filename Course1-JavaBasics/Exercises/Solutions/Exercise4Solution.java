/**
 * Exercise4Solution.java
 * Solution: Simple Interest Calculator
 */

public class Exercise4Solution {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.0;
        double time = 2.0;
        
        // Formula: SI = (P × R × T) / 100
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest Calculator:");
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: $" + simpleInterest);
        System.out.println("Total Amount: $" + (principal + simpleInterest));
    }
}
