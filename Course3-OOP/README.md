# Course 3: Object-Oriented Programming (OOP)

## 📋 Course Overview

Welcome to Course 3! This course introduces you to Object-Oriented Programming (OOP), one of the most important programming paradigms. You'll learn how to design and build applications using classes and objects.

## 🎯 Learning Objectives

By the end of this course, you will understand:
- What is Object-Oriented Programming
- How to create classes and objects
- Constructors and their types
- The four pillars of OOP: Encapsulation, Inheritance, Polymorphism, and Abstraction
- Abstract classes and interfaces
- The `this` and `super` keywords

## 📚 Course Content

### 1. Classes and Objects

A **class** is a blueprint for creating objects. An **object** is an instance of a class.

```java
// Define a class
public class Car {
    // Fields (attributes)
    String brand;
    String model;
    int year;
    
    // Method
    void displayInfo() {
        System.out.println(year + " " + brand + " " + model);
    }
}

// Create objects
Car car1 = new Car();
car1.brand = "Toyota";
car1.model = "Camry";
car1.year = 2023;
car1.displayInfo();
```

### 2. Constructors

Constructors initialize objects when they are created.

```java
public class Car {
    String brand;
    String model;
    int year;
    
    // Default constructor
    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }
    
    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
```

### 3. Encapsulation

Encapsulation is hiding internal details and providing access through public methods (getters and setters).

```java
public class BankAccount {
    private double balance; // Private field
    
    // Getter
    public double getBalance() {
        return balance;
    }
    
    // Setter
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### 4. Inheritance

Inheritance allows a class to inherit properties and methods from another class.

```java
// Parent class
public class Animal {
    String name;
    
    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class
public class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}
```

**Types of Inheritance:**
- Single Inheritance: Class B extends Class A
- Multilevel Inheritance: Class C extends Class B extends Class A
- Hierarchical Inheritance: Multiple classes extend the same parent

### 5. Polymorphism

Polymorphism means "many forms". It allows methods to do different things based on the object.

**Method Overloading (Compile-time):**
```java
public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

**Method Overriding (Runtime):**
```java
public class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

### 6. Abstraction

Abstraction hides implementation details and shows only essential features.

**Abstract Class:**
```java
public abstract class Shape {
    abstract double area(); // Abstract method
    
    void display() { // Concrete method
        System.out.println("This is a shape");
    }
}

public class Circle extends Shape {
    double radius;
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
```

**Interface:**
```java
public interface Drawable {
    void draw(); // All methods are abstract by default
}

public class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
```

### 7. Important Keywords

**this keyword:** Refers to the current object
```java
public class Person {
    String name;
    
    public Person(String name) {
        this.name = name; // Distinguish field from parameter
    }
}
```

**super keyword:** Refers to the parent class
```java
public class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call parent constructor
    }
    
    void eat() {
        super.eat(); // Call parent method
    }
}
```

## 💻 Practice Files

Check the `Examples/` folder:
1. `ClassesAndObjects.java` - Basic classes and objects
2. `ConstructorsDemo.java` - Constructor types
3. `EncapsulationDemo.java` - Getters and setters
4. `InheritanceDemo.java` - Inheritance examples
5. `PolymorphismDemo.java` - Overloading and overriding
6. `AbstractionDemo.java` - Abstract classes and interfaces
7. `BankAccountSystem.java` - Complete OOP example

## 📝 Exercises

1. Create a Student class with encapsulation
2. Implement inheritance with Vehicle hierarchy
3. Demonstrate polymorphism with Shape classes
4. Create an interface for different payment methods
5. Build a library management system

## 🚀 Mini Project

**Employee Management System** - Create a system with:
- Employee base class
- Manager and Developer subclasses
- Encapsulation for sensitive data
- Interface for displayable objects

## ✅ Next Steps

Move on to **Course 4: Java Collections Framework**
