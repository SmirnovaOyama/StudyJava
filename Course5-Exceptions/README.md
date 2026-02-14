# Course 5: Exception Handling

## 📋 Course Overview

Learn how to handle errors and exceptions gracefully in your Java programs.

## 🎯 Learning Objectives

- Understand what exceptions are
- Use try-catch blocks
- Handle multiple exceptions
- Use finally block
- Create custom exceptions
- Understand checked vs unchecked exceptions

## 📚 Course Content

### 1. What are Exceptions?

Exceptions are events that disrupt normal program flow. Java uses exception objects to handle errors.

**Exception Hierarchy:**
```
Throwable
├── Error (serious problems, not usually caught)
└── Exception
    ├── RuntimeException (unchecked)
    │   ├── NullPointerException
    │   ├── ArrayIndexOutOfBoundsException
    │   └── ArithmeticException
    └── IOException (checked)
        ├── FileNotFoundException
        └── EOFException
```

### 2. Try-Catch Block

```java
try {
    int result = 10 / 0; // May throw exception
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```

### 3. Multiple Catch Blocks

```java
try {
    int[] arr = new int[5];
    arr[10] = 50; // ArrayIndexOutOfBoundsException
    int x = 10 / 0; // ArithmeticException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index error: " + e.getMessage());
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Generic error: " + e.getMessage());
}
```

### 4. Finally Block

Always executes, regardless of exception.

```java
try {
    // Code that may throw exception
} catch (Exception e) {
    // Handle exception
} finally {
    // Always executes (cleanup code)
    System.out.println("Finally block executed");
}
```

### 5. Throw and Throws

**throw:** Explicitly throw an exception
```java
public void checkAge(int age) {
    if (age < 18) {
        throw new IllegalArgumentException("Age must be 18+");
    }
}
```

**throws:** Declare that a method may throw an exception
```java
public void readFile() throws IOException {
    FileReader file = new FileReader("test.txt");
}
```

### 6. Custom Exceptions

```java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public void withdraw(double amount) throws InsufficientFundsException {
    if (amount > balance) {
        throw new InsufficientFundsException("Insufficient funds");
    }
    balance -= amount;
}
```

### 7. Try-with-Resources (Java 7+)

Automatically closes resources.

```java
try (FileReader fr = new FileReader("file.txt")) {
    // Use file reader
} catch (IOException e) {
    e.printStackTrace();
}
// FileReader automatically closed
```

### 8. Best Practices

1. Catch specific exceptions first
2. Don't catch Exception unless necessary
3. Always log exceptions
4. Don't use exceptions for control flow
5. Clean up resources in finally or use try-with-resources

## 💻 Practice Files

1. `BasicExceptionHandling.java`
2. `MultipleCatchDemo.java`
3. `FinallyBlockDemo.java`
4. `ThrowThrowsDemo.java`
5. `CustomExceptionDemo.java`
6. `TryWithResourcesDemo.java`

## 📝 Exercises

1. Handle division by zero
2. Array bounds checking
3. File reading with exception handling
4. Custom exception for bank account
5. Input validation with exceptions

## 🚀 Mini Project

**Robust Calculator** with comprehensive exception handling

## ✅ Next Steps

Move on to **Course 6: File I/O and Streams**
