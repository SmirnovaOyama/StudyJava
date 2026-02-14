/**
 * ArrayListDemo.java
 * Demonstrates ArrayList operations
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("=== ArrayList Demo ===");
        System.out.println();
        
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding elements
        System.out.println("1. Adding elements:");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("Fruits: " + fruits);
        System.out.println();
        
        // Adding at specific index
        fruits.add(1, "Avocado");
        System.out.println("After adding Avocado at index 1: " + fruits);
        System.out.println();
        
        // Accessing elements
        System.out.println("2. Accessing elements:");
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Third fruit: " + fruits.get(2));
        System.out.println();
        
        // Size of ArrayList
        System.out.println("3. Size:");
        System.out.println("Number of fruits: " + fruits.size());
        System.out.println();
        
        // Modifying elements
        System.out.println("4. Modifying elements:");
        fruits.set(2, "Blueberry");
        System.out.println("After changing index 2 to Blueberry: " + fruits);
        System.out.println();
        
        // Checking if element exists
        System.out.println("5. Checking elements:");
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println();
        
        // Finding index
        System.out.println("6. Finding index:");
        System.out.println("Index of Banana: " + fruits.indexOf("Banana"));
        System.out.println();
        
        // Removing elements
        System.out.println("7. Removing elements:");
        fruits.remove("Date");
        System.out.println("After removing Date: " + fruits);
        fruits.remove(0);
        System.out.println("After removing index 0: " + fruits);
        System.out.println();
        
        // Iterating through ArrayList
        System.out.println("8. Iterating:");
        System.out.print("Using for-each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        System.out.print("Using for loop: ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        
        // Sorting
        System.out.println("9. Sorting:");
        Collections.sort(fruits);
        System.out.println("Sorted fruits: " + fruits);
        System.out.println();
        
        // Clearing ArrayList
        System.out.println("10. Clearing:");
        ArrayList<String> temp = new ArrayList<>(fruits);
        temp.clear();
        System.out.println("After clear: " + temp);
        System.out.println("Is empty? " + temp.isEmpty());
        System.out.println();
        
        // ArrayList with numbers
        System.out.println("11. ArrayList with numbers:");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        
        System.out.println("Numbers: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));
    }
}
