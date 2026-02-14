/**
 * StreamAPIDemo.java
 * Demonstrates the powerful Stream API in Java 8+
 */

import java.util.*;
import java.util.stream.*;

public class StreamAPIDemo {
    public static void main(String[] args) {
        System.out.println("=== Stream API Demo ===");
        System.out.println();
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // 1. Filter - select elements
        System.out.println("1. Filter - Get even numbers:");
        List<Integer> evens = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
        System.out.println();
        
        // 2. Map - transform elements
        System.out.println("2. Map - Square each number:");
        List<Integer> squares = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("Squares: " + squares);
        System.out.println();
        
        // 3. Reduce - combine elements
        System.out.println("3. Reduce - Sum all numbers:");
        int sum = numbers.stream()
            .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
        System.out.println();
        
        // 4. Count
        System.out.println("4. Count - Numbers greater than 5:");
        long count = numbers.stream()
            .filter(n -> n > 5)
            .count();
        System.out.println("Count: " + count);
        System.out.println();
        
        // 5. Sorted
        System.out.println("5. Sorted - Descending order:");
        List<Integer> sorted = numbers.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        System.out.println("Sorted: " + sorted);
        System.out.println();
        
        // 6. Distinct
        System.out.println("6. Distinct - Remove duplicates:");
        List<Integer> withDupes = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);
        List<Integer> distinct = withDupes.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Original: " + withDupes);
        System.out.println("Distinct: " + distinct);
        System.out.println();
        
        // 7. Limit and Skip
        System.out.println("7. Limit and Skip:");
        List<Integer> limited = numbers.stream()
            .limit(5)
            .collect(Collectors.toList());
        System.out.println("First 5: " + limited);
        
        List<Integer> skipped = numbers.stream()
            .skip(5)
            .collect(Collectors.toList());
        System.out.println("Skip first 5: " + skipped);
        System.out.println();
        
        // 8. Working with Strings
        System.out.println("8. Working with Strings:");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        
        List<String> filtered = names.stream()
            .filter(name -> name.length() > 3)
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Names (length > 3, uppercase, sorted): " + filtered);
        System.out.println();
        
        // 9. Find operations
        System.out.println("9. Find operations:");
        Optional<Integer> first = numbers.stream()
            .filter(n -> n > 5)
            .findFirst();
        System.out.println("First number > 5: " + first.orElse(-1));
        
        Optional<Integer> any = numbers.stream()
            .filter(n -> n > 5)
            .findAny();
        System.out.println("Any number > 5: " + any.orElse(-1));
        System.out.println();
        
        // 10. Match operations
        System.out.println("10. Match operations:");
        boolean allPositive = numbers.stream()
            .allMatch(n -> n > 0);
        System.out.println("All positive? " + allPositive);
        
        boolean anyEven = numbers.stream()
            .anyMatch(n -> n % 2 == 0);
        System.out.println("Any even? " + anyEven);
        
        boolean noneNegative = numbers.stream()
            .noneMatch(n -> n < 0);
        System.out.println("None negative? " + noneNegative);
        System.out.println();
        
        // 11. Statistics
        System.out.println("11. Statistics:");
        IntSummaryStatistics stats = numbers.stream()
            .mapToInt(Integer::intValue)
            .summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }
}
