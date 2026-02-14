/**
 * PatternPrinting.java
 * Advanced pattern printing using nested loops
 */

public class PatternPrinting {
    public static void main(String[] args) {
        System.out.println("=== Pattern Printing ===");
        System.out.println();
        
        // Pattern 1: Square
        System.out.println("Pattern 1: Square (5x5)");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Pattern 2: Hollow square
        System.out.println("Pattern 2: Hollow square");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        // Pattern 3: Pyramid
        System.out.println("Pattern 3: Pyramid");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Pattern 4: Diamond
        System.out.println("Pattern 4: Diamond");
        n = 5;
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // Pattern 5: Number triangle
        System.out.println("Pattern 5: Number triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Pattern 6: Floyd's triangle
        System.out.println("Pattern 6: Floyd's triangle");
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2d ", num++);
            }
            System.out.println();
        }
    }
}
