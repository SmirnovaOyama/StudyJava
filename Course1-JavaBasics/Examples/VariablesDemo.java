/**
 * VariablesDemo.java
 * Demonstrates the use of different data types and variables in Java.
 */

public class VariablesDemo {
    public static void main(String[] args) {
        // Integer types
        byte myByte = 100;
        short myShort = 5000;
        int myInt = 100000;
        long myLong = 15000000000L; // Note the 'L' suffix
        
        // Floating point types
        float myFloat = 5.99f; // Note the 'f' suffix
        double myDouble = 19.99;
        
        // Boolean type
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        
        // Character type
        char myGrade = 'A';
        char mySymbol = '@';
        
        // String (not primitive, but very commonly used)
        String myName = "John Doe";
        String greeting = "Hello, Java!";
        
        // Display all variables
        System.out.println("=== Variables Demo ===");
        System.out.println();
        
        System.out.println("Integer Types:");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println();
        
        System.out.println("Floating Point Types:");
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println();
        
        System.out.println("Boolean Type:");
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
        System.out.println();
        
        System.out.println("Character Type:");
        System.out.println("Grade: " + myGrade);
        System.out.println("Symbol: " + mySymbol);
        System.out.println();
        
        System.out.println("String Type:");
        System.out.println("Name: " + myName);
        System.out.println("Greeting: " + greeting);
    }
}
