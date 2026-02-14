# Course 2: Control Flow

## 📋 Course Overview

Welcome to Course 2! In this course, you'll learn how to control the flow of your programs using conditional statements and loops. These are essential tools that allow your programs to make decisions and repeat actions.

## 🎯 Learning Objectives

By the end of this course, you will be able to:
- Use if-else statements to make decisions in your code
- Implement switch statements for multiple conditions
- Write for loops to repeat actions a specific number of times
- Use while and do-while loops for conditional repetition
- Control loop execution with break and continue statements
- Nest control structures for complex logic

## 📚 Course Content

### 1. If-Else Statements

The if-else statement allows your program to make decisions based on conditions.

```java
// Simple if statement
if (condition) {
    // code to execute if condition is true
}

// If-else statement
if (condition) {
    // code if true
} else {
    // code if false
}

// If-else-if ladder
if (condition1) {
    // code for condition1
} else if (condition2) {
    // code for condition2
} else {
    // code if all conditions are false
}
```

**Example:**
```java
int age = 18;
if (age >= 18) {
    System.out.println("You are an adult");
} else {
    System.out.println("You are a minor");
}
```

### 2. Ternary Operator

A shorthand way to write simple if-else statements.

```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

**Example:**
```java
int age = 20;
String status = (age >= 18) ? "Adult" : "Minor";
```

### 3. Switch Statement

The switch statement is useful when you have multiple conditions to check against a single variable.

```java
switch (variable) {
    case value1:
        // code for value1
        break;
    case value2:
        // code for value2
        break;
    default:
        // code if no case matches
}
```

**Example:**
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
}
```

### 4. For Loop

The for loop is used when you know how many times you want to repeat something.

```java
for (initialization; condition; update) {
    // code to repeat
}
```

**Example:**
```java
// Print numbers 1 to 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### 5. While Loop

The while loop repeats as long as a condition is true.

```java
while (condition) {
    // code to repeat
}
```

**Example:**
```java
int count = 1;
while (count <= 5) {
    System.out.println(count);
    count++;
}
```

### 6. Do-While Loop

Similar to while, but guarantees at least one execution.

```java
do {
    // code to repeat
} while (condition);
```

**Example:**
```java
int count = 1;
do {
    System.out.println(count);
    count++;
} while (count <= 5);
```

### 7. Break and Continue

- **break**: Exits the loop completely
- **continue**: Skips the current iteration and continues with the next

```java
// Break example
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Stop when i equals 5
    }
    System.out.println(i);
}

// Continue example
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Skip even numbers
    }
    System.out.println(i);
}
```

### 8. Nested Loops

Loops can be placed inside other loops.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println(i + ", " + j);
    }
}
```

## 💻 Practice Files

Check out these example files in the `Examples/` folder:
1. `IfElseDemo.java` - Conditional statements
2. `SwitchDemo.java` - Switch statements
3. `ForLoopDemo.java` - For loops
4. `WhileLoopDemo.java` - While and do-while loops
5. `BreakContinueDemo.java` - Break and continue
6. `NestedLoopsDemo.java` - Nested loops
7. `PatternPrinting.java` - Pattern printing using loops

## 📝 Exercises

Complete the exercises in the `Exercises/` folder:
1. **Exercise 1**: Grade evaluator (if-else)
2. **Exercise 2**: Day of the week (switch)
3. **Exercise 3**: Multiplication table (for loop)
4. **Exercise 4**: Number guessing game (while loop)
5. **Exercise 5**: Prime number checker

Solutions are provided in `Exercises/Solutions/`

## 🚀 Mini Project

Create a **Simple Menu-Driven Calculator** that:
- Displays a menu of operations
- Accepts user choice using switch statement
- Performs calculations in a loop
- Allows the user to exit

See `Projects/MenuCalculator.java` for starter code.

## 📖 Common Patterns

### Pattern 1: Input Validation
```java
Scanner scanner = new Scanner(System.in);
int age;
do {
    System.out.print("Enter age (1-120): ");
    age = scanner.nextInt();
} while (age < 1 || age > 120);
```

### Pattern 2: Menu System
```java
int choice;
do {
    System.out.println("1. Option 1");
    System.out.println("2. Option 2");
    System.out.println("0. Exit");
    choice = scanner.nextInt();
    // Handle choice
} while (choice != 0);
```

## ✅ Next Steps

Once you've completed this course:
1. Review all example programs
2. Complete all exercises
3. Finish the mini project
4. Move on to **Course 3: Object-Oriented Programming**

Happy Coding! 🎉
