# Course 6: File I/O and Streams

## 📋 Course Overview

Learn how to read from and write to files, and work with streams in Java.

## 🎯 Learning Objectives

- Read and write text files
- Work with binary files
- Use BufferedReader and BufferedWriter
- Understand File class operations
- Learn about serialization
- Introduction to Java NIO

## 📚 Course Content

### 1. File Class

```java
import java.io.File;

File file = new File("example.txt");
if (file.exists()) {
    System.out.println("File size: " + file.length());
    System.out.println("Is file: " + file.isFile());
    System.out.println("Is directory: " + file.isDirectory());
}

// Create directory
File dir = new File("myFolder");
dir.mkdir();
```

### 2. Writing to Files

**Using FileWriter:**
```java
import java.io.FileWriter;
import java.io.IOException;

try (FileWriter writer = new FileWriter("output.txt")) {
    writer.write("Hello, World!\n");
    writer.write("Writing to file in Java");
} catch (IOException e) {
    e.printStackTrace();
}
```

**Using BufferedWriter:**
```java
import java.io.BufferedWriter;
import java.io.FileWriter;

try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
    bw.write("Line 1");
    bw.newLine();
    bw.write("Line 2");
} catch (IOException e) {
    e.printStackTrace();
}
```

### 3. Reading from Files

**Using FileReader:**
```java
import java.io.FileReader;

try (FileReader reader = new FileReader("input.txt")) {
    int character;
    while ((character = reader.read()) != -1) {
        System.out.print((char) character);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

**Using BufferedReader:**
```java
import java.io.BufferedReader;
import java.io.FileReader;

try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### 4. Scanner for File Reading

```java
import java.io.File;
import java.util.Scanner;

try (Scanner scanner = new Scanner(new File("data.txt"))) {
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
```

### 5. Serialization

Save and restore objects.

```java
import java.io.*;

// Serializable class
class Person implements Serializable {
    String name;
    int age;
}

// Writing object
try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("person.ser"))) {
    Person p = new Person();
    p.name = "Alice";
    p.age = 25;
    oos.writeObject(p);
}

// Reading object
try (ObjectInputStream ois = new ObjectInputStream(
        new FileInputStream("person.ser"))) {
    Person p = (Person) ois.readObject();
    System.out.println(p.name + ", " + p.age);
}
```

### 6. Java NIO (New I/O)

```java
import java.nio.file.*;

// Read all lines
List<String> lines = Files.readAllLines(Paths.get("file.txt"));

// Write lines
List<String> content = Arrays.asList("Line 1", "Line 2");
Files.write(Paths.get("output.txt"), content);

// Copy file
Files.copy(Paths.get("source.txt"), Paths.get("dest.txt"));

// Delete file
Files.delete(Paths.get("temp.txt"));
```

## 💻 Practice Files

1. `FileWriteDemo.java`
2. `FileReadDemo.java`
3. `BufferedIODemo.java`
4. `FileOperationsDemo.java`
5. `SerializationDemo.java`
6. `NIODemo.java`

## 📝 Exercises

1. Copy a text file
2. Count words in a file
3. Read and parse CSV file
4. Create a simple logger
5. Serialize and deserialize objects

## 🚀 Mini Project

**Student Records System** with file persistence

## ✅ Next Steps

Move on to **Course 7: Multithreading and Concurrency**
