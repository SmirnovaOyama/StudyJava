# Course 8: Advanced Topics

## 📋 Course Overview

Explore modern Java features including Generics, Lambda Expressions, Stream API, and more.

## 🎯 Learning Objectives

- Use Generics for type-safe code
- Write functional code with Lambda expressions
- Master the Stream API
- Use Optional to handle null values
- Understand method references
- Work with functional interfaces

## 📚 Course Content

### 1. Generics

Write type-safe, reusable code.

```java
// Generic class
public class Box<T> {
    private T content;
    
    public void set(T content) {
        this.content = content;
    }
    
    public T get() {
        return content;
    }
}

Box<String> stringBox = new Box<>();
stringBox.set("Hello");

Box<Integer> intBox = new Box<>();
intBox.set(123);
```

**Generic Methods:**
```java
public <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}
```

**Bounded Type Parameters:**
```java
public <T extends Number> double sum(T num1, T num2) {
    return num1.doubleValue() + num2.doubleValue();
}
```

### 2. Lambda Expressions (Java 8+)

Concise way to represent anonymous functions.

```java
// Traditional approach
Runnable r1 = new Runnable() {
    public void run() {
        System.out.println("Hello");
    }
};

// Lambda expression
Runnable r2 = () -> System.out.println("Hello");

// With parameters
Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);

// Multiple statements
Runnable r3 = () -> {
    System.out.println("Line 1");
    System.out.println("Line 2");
};
```

### 3. Functional Interfaces

Interface with a single abstract method.

**Common Functional Interfaces:**
```java
// Predicate<T> - Takes T, returns boolean
Predicate<Integer> isEven = num -> num % 2 == 0;

// Function<T, R> - Takes T, returns R
Function<String, Integer> length = str -> str.length();

// Consumer<T> - Takes T, returns void
Consumer<String> printer = str -> System.out.println(str);

// Supplier<T> - Takes nothing, returns T
Supplier<Double> random = () -> Math.random();
```

### 4. Stream API

Process collections in a functional way.

```java
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Filter even numbers
List<Integer> evens = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());

// Map - transform elements
List<Integer> squared = numbers.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());

// Reduce - combine elements
int sum = numbers.stream()
    .reduce(0, (a, b) -> a + b);

// Count elements
long count = numbers.stream()
    .filter(n -> n > 5)
    .count();

// Sorted
List<Integer> sorted = numbers.stream()
    .sorted()
    .collect(Collectors.toList());
```

**Common Stream Operations:**
- `filter()` - Select elements
- `map()` - Transform elements
- `flatMap()` - Flatten nested structures
- `distinct()` - Remove duplicates
- `sorted()` - Sort elements
- `limit()` - Limit number of elements
- `skip()` - Skip elements
- `forEach()` - Iterate
- `reduce()` - Combine elements
- `collect()` - Gather results

### 5. Optional

Handle potential null values safely.

```java
import java.util.Optional;

Optional<String> optional = Optional.of("Hello");

// Check if value exists
if (optional.isPresent()) {
    System.out.println(optional.get());
}

// Or use ifPresent
optional.ifPresent(value -> System.out.println(value));

// Provide default value
String result = optional.orElse("Default");

// Chain operations
String upper = optional
    .map(String::toUpperCase)
    .orElse("DEFAULT");
```

### 6. Method References

Shorthand for lambda expressions.

```java
// Static method reference
Function<String, Integer> parse = Integer::parseInt;

// Instance method reference
String str = "Hello";
Supplier<String> upper = str::toUpperCase;

// Constructor reference
Supplier<List<String>> listSupplier = ArrayList::new;

// Examples
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Lambda
names.forEach(name -> System.out.println(name));

// Method reference
names.forEach(System.out::println);
```

### 7. Date and Time API (Java 8+)

```java
import java.time.*;

// Current date and time
LocalDate today = LocalDate.now();
LocalTime time = LocalTime.now();
LocalDateTime dateTime = LocalDateTime.now();

// Create specific date
LocalDate date = LocalDate.of(2024, 1, 1);

// Operations
LocalDate tomorrow = today.plusDays(1);
LocalDate lastWeek = today.minusWeeks(1);

// Formatting
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String formatted = today.format(formatter);
```

### 8. Annotations

```java
@Override
public String toString() {
    return "Custom toString";
}

@Deprecated
public void oldMethod() {
    // This method is deprecated
}

@SuppressWarnings("unchecked")
public void suppressWarning() {
    // Suppress compiler warnings
}

@FunctionalInterface
public interface MyFunction {
    void apply();
}
```

## 💻 Practice Files

1. `GenericsDemo.java`
2. `LambdaExpressionsDemo.java`
3. `StreamAPIDemo.java`
4. `OptionalDemo.java`
5. `MethodReferencesDemo.java`
6. `DateTimeAPIDemo.java`
7. `FunctionalProgrammingDemo.java`

## 📝 Exercises

1. Generic Stack implementation
2. Filter and transform collections with streams
3. Custom functional interface
4. Complex stream operations
5. Optional for database queries

## 🚀 Mini Project

**Data Analysis Tool** using Stream API to:
- Read data from file
- Filter and transform data
- Calculate statistics
- Generate reports

## 🎓 Congratulations!

You've completed all 8 Java courses! You now have a solid foundation in:
- Java Basics
- Control Flow
- Object-Oriented Programming
- Collections Framework
- Exception Handling
- File I/O
- Multithreading
- Advanced Java Features

## 📚 Further Learning

Continue your journey with:
- Spring Framework
- Hibernate ORM
- JavaFX for GUI applications
- Android development
- Enterprise Java (Java EE)
- Design Patterns
- Data Structures and Algorithms

Keep practicing and building projects! Happy Coding! 🎉
