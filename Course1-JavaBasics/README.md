# Course 1: Java Basics

## 📋 Course Overview

Welcome to your first Java course! In this course, you'll learn the fundamental building blocks of Java programming. By the end of this course, you'll be able to write simple Java programs that use variables, perform calculations, and interact with users.

## 🎯 Learning Objectives

By the end of this course, you will:
- Understand what Java is and how it works
- Set up your Java development environment
- Write and run your first Java program
- Work with variables and different data types
- Use operators to perform calculations and comparisons
- Handle basic input and output operations

## 📚 Course Content

### 1. Introduction to Java
- What is Java?
- Java features (Platform-independent, Object-oriented, Secure, etc.)
- JDK, JRE, and JVM
- Setting up your development environment

### 2. Your First Java Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Understanding the code:**
- `public class HelloWorld`: Declares a public class named HelloWorld
- `public static void main(String[] args)`: The main method - entry point of the program
- `System.out.println()`: Prints text to the console

### 3. Variables and Data Types

#### Primitive Data Types
Java has 8 primitive data types:

| Type | Size | Description | Example |
|------|------|-------------|---------|
| byte | 1 byte | Stores whole numbers from -128 to 127 | `byte age = 25;` |
| short | 2 bytes | Stores whole numbers from -32,768 to 32,767 | `short year = 2024;` |
| int | 4 bytes | Stores whole numbers from -2^31 to 2^31-1 | `int population = 1000000;` |
| long | 8 bytes | Stores very large whole numbers | `long bigNumber = 9999999999L;` |
| float | 4 bytes | Stores decimal numbers (6-7 digits) | `float price = 19.99f;` |
| double | 8 bytes | Stores decimal numbers (15 digits) | `double pi = 3.14159265359;` |
| boolean | 1 bit | Stores true or false | `boolean isJavaFun = true;` |
| char | 2 bytes | Stores a single character | `char grade = 'A';` |

#### Variable Declaration and Initialization
```java
// Declaration
int age;

// Initialization
age = 25;

// Declaration and Initialization together
int score = 100;
String name = "John";
```

### 4. Operators

#### Arithmetic Operators
- `+` Addition
- `-` Subtraction
- `*` Multiplication
- `/` Division
- `%` Modulus (remainder)

#### Assignment Operators
- `=` Simple assignment
- `+=` Add and assign
- `-=` Subtract and assign
- `*=` Multiply and assign
- `/=` Divide and assign

#### Comparison Operators
- `==` Equal to
- `!=` Not equal to
- `>` Greater than
- `<` Less than
- `>=` Greater than or equal to
- `<=` Less than or equal to

#### Logical Operators
- `&&` Logical AND
- `||` Logical OR
- `!` Logical NOT

#### Increment/Decrement Operators
- `++` Increment by 1
- `--` Decrement by 1

### 5. Input and Output

#### Output
```java
System.out.println("Text with new line");
System.out.print("Text without new line");
System.out.printf("Formatted: %d", number);
```

#### Input (using Scanner)
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
int age = scanner.nextInt();
double price = scanner.nextDouble();
```

## 💻 Practice Files

Check out these example files in the `Examples/` folder:
1. `HelloWorld.java` - Your first Java program
2. `VariablesDemo.java` - Working with different data types
3. `OperatorsDemo.java` - Using various operators
4. `InputOutputDemo.java` - Reading input and displaying output
5. `CalculatorBasic.java` - Simple calculator program

## 📝 Exercises

Complete the exercises in the `Exercises/` folder:
1. **Exercise 1**: Create a program that prints your name and age
2. **Exercise 2**: Calculate the area of a rectangle
3. **Exercise 3**: Temperature converter (Celsius to Fahrenheit)
4. **Exercise 4**: Simple interest calculator
5. **Exercise 5**: Swap two numbers

Solutions are provided in `Exercises/Solutions/`

## 🚀 Mini Project

Create a **Personal Information System** that:
- Asks for user's name, age, height, and weight
- Calculates and displays BMI (Body Mass Index)
- Displays a formatted summary of the information

See `Projects/PersonalInfoSystem.java` for starter code.

## 📖 Additional Resources

- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials by Oracle](https://docs.oracle.com/javase/tutorial/)

## ✅ Next Steps

Once you've completed this course and feel comfortable with the basics:
1. Review all example programs
2. Complete all exercises
3. Finish the mini project
4. Move on to **Course 2: Control Flow**

Happy Coding! 🎉
