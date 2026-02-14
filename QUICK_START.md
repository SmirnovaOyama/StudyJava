# Quick Start Guide

Welcome to the StudyJava repository! This guide will help you get started with your Java learning journey.

## 📦 What You'll Find Here

This repository contains **8 comprehensive Java courses** that will take you from beginner to advanced level:

1. **Course 1: Java Basics** - Start here if you're new to Java
2. **Course 2: Control Flow** - Learn decision-making and loops
3. **Course 3: Object-Oriented Programming** - Master OOP concepts
4. **Course 4: Java Collections Framework** - Work with data structures
5. **Course 5: Exception Handling** - Handle errors gracefully
6. **Course 6: File I/O and Streams** - Read and write files
7. **Course 7: Multithreading** - Write concurrent programs
8. **Course 8: Advanced Topics** - Modern Java features

## 🚀 Getting Started

### Prerequisites
1. Install Java JDK (version 11 or higher)
   - Download from: https://www.oracle.com/java/technologies/downloads/
   - Or use OpenJDK: https://adoptium.net/

2. Choose a text editor or IDE:
   - **VS Code** (lightweight, beginner-friendly)
   - **IntelliJ IDEA** (powerful, feature-rich)
   - **Eclipse** (popular, free)
   - **NetBeans** (Java-focused)

### Verify Java Installation

Open a terminal/command prompt and run:
```bash
java -version
javac -version
```

You should see version information for both commands.

## 📖 How to Use This Repository

### 1. Clone or Download
```bash
git clone https://github.com/SmirnovaOyama/StudyJava.git
cd StudyJava
```

### 2. Start with Course 1
```bash
cd Course1-JavaBasics
```

### 3. Read the Course README
Each course has a `README.md` file with:
- Learning objectives
- Concepts explained
- Code examples
- Exercises
- Mini projects

### 4. Study the Examples
Go to the `Examples/` folder in each course:
```bash
cd Examples
```

### 5. Compile and Run Programs

**To compile:**
```bash
javac ProgramName.java
```

**To run:**
```bash
java ProgramName
```

**Example:**
```bash
cd Course1-JavaBasics/Examples
javac HelloWorld.java
java HelloWorld
```

### 6. Complete Exercises
Each course has exercises in the `Exercises/` folder. Try solving them yourself before checking the solutions!

### 7. Build Mini Projects
Apply what you learned by building the mini project in the `Projects/` folder.

## 📋 Recommended Learning Path

### Week 1-2: Foundations
- **Course 1**: Java Basics
- **Course 2**: Control Flow

**Goals:**
- Write your first Java programs
- Understand variables and data types
- Use if-else and loops
- Complete all exercises

### Week 3-4: Object-Oriented Programming
- **Course 3**: OOP

**Goals:**
- Create classes and objects
- Understand inheritance and polymorphism
- Build an employee management system

### Week 5-6: Working with Data
- **Course 4**: Collections Framework
- **Course 5**: Exception Handling

**Goals:**
- Use ArrayList, HashMap, etc.
- Handle errors properly
- Build a to-do list manager

### Week 7-8: Advanced Topics
- **Course 6**: File I/O
- **Course 7**: Multithreading
- **Course 8**: Advanced Features

**Goals:**
- Read and write files
- Create multi-threaded programs
- Use Streams and Lambda expressions

## 💡 Learning Tips

1. **Type the code yourself** - Don't copy-paste. Typing helps you remember.

2. **Experiment** - Modify the examples and see what happens.

3. **Read error messages** - They tell you what went wrong.

4. **Practice daily** - Even 30 minutes a day is better than cramming.

5. **Build projects** - Apply what you learn by building real applications.

6. **Ask questions** - Use Stack Overflow, Java forums, or Discord communities.

## 🔍 Course Details

### Course 1: Java Basics (Start Here!)
**Files:** 5 examples, 6 exercises, 1 project
**Topics:** Variables, operators, input/output
**Time:** 1-2 weeks

### Course 2: Control Flow
**Files:** 7 examples, 6 exercises, 1 project
**Topics:** If-else, switch, loops, patterns
**Time:** 1-2 weeks

### Course 3: Object-Oriented Programming
**Files:** Multiple examples covering all OOP concepts
**Topics:** Classes, inheritance, polymorphism, interfaces
**Time:** 2-3 weeks

### Course 4: Collections Framework
**Files:** Multiple collection examples
**Topics:** ArrayList, HashMap, Set, iterators
**Time:** 1-2 weeks

### Course 5: Exception Handling
**Files:** Exception handling examples
**Topics:** Try-catch, custom exceptions, best practices
**Time:** 1 week

### Course 6: File I/O
**Files:** File operation examples
**Topics:** Reading/writing files, serialization, NIO
**Time:** 1-2 weeks

### Course 7: Multithreading
**Files:** Thread examples
**Topics:** Creating threads, synchronization, thread pools
**Time:** 2 weeks

### Course 8: Advanced Topics
**Files:** Modern Java feature examples
**Topics:** Generics, lambdas, streams, Optional
**Time:** 2-3 weeks

## 🎯 Quick Examples

### Hello World (Course 1)
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### For Loop (Course 2)
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### Class and Object (Course 3)
```java
class Car {
    String brand;
    void drive() {
        System.out.println("Driving...");
    }
}

Car myCar = new Car();
myCar.brand = "Toyota";
myCar.drive();
```

### ArrayList (Course 4)
```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
System.out.println(names);
```

## 🆘 Getting Help

### Common Issues

**Problem: "javac is not recognized"**
- Solution: Add Java to your PATH environment variable

**Problem: "Cannot find symbol"**
- Solution: Check for typos in variable/class names

**Problem: "Exception in thread main"**
- Solution: Read the error message carefully - it tells you the line number

### Resources
- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials by Oracle](https://docs.oracle.com/javase/tutorial/)
- [Stack Overflow](https://stackoverflow.com/questions/tagged/java)

## 📊 Track Your Progress

Use the checklist in the main README.md to track your progress:
- [ ] Course 1: Java Basics
- [ ] Course 2: Control Flow
- [ ] Course 3: Object-Oriented Programming
- [ ] Course 4: Java Collections Framework
- [ ] Course 5: Exception Handling
- [ ] Course 6: File I/O and Streams
- [ ] Course 7: Multithreading and Concurrency
- [ ] Course 8: Advanced Topics

## 🎓 After Completing All Courses

Congratulations! You'll have learned:
- Core Java programming
- Object-oriented design
- Data structures
- Error handling
- File operations
- Concurrent programming
- Modern Java features

### Next Steps:
1. Build a complete project (e.g., student management system, library system)
2. Learn a Java framework (Spring, JavaFX)
3. Contribute to open-source Java projects
4. Prepare for Java certifications

## 🤝 Contributing

Found an error? Have a suggestion? Feel free to:
- Open an issue
- Submit a pull request
- Improve documentation

---

**Ready to start?** Head to [Course 1: Java Basics](./Course1-JavaBasics/) and begin your journey!

Happy Learning! 🎉
