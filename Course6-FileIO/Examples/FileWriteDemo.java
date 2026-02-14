/**
 * FileWriteDemo.java
 * Demonstrates writing to files in Java
 */

import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) {
        System.out.println("=== File Write Demo ===");
        System.out.println();
        
        // Example 1: Write using FileWriter
        System.out.println("1. Writing with FileWriter:");
        try (FileWriter writer = new FileWriter("example1.txt")) {
            writer.write("Hello, World!\n");
            writer.write("This is a test file.\n");
            writer.write("Writing to files in Java is easy!");
            System.out.println("File 'example1.txt' created successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        System.out.println();
        
        // Example 2: Write using BufferedWriter (more efficient)
        System.out.println("2. Writing with BufferedWriter:");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example2.txt"))) {
            bw.write("Line 1: BufferedWriter is more efficient");
            bw.newLine();
            bw.write("Line 2: For writing multiple lines");
            bw.newLine();
            bw.write("Line 3: It buffers the output");
            System.out.println("File 'example2.txt' created successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        System.out.println();
        
        // Example 3: Append to existing file
        System.out.println("3. Appending to file:");
        try (FileWriter writer = new FileWriter("example1.txt", true)) {
            writer.write("\nThis line is appended!");
            System.out.println("Text appended to 'example1.txt'!");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
        System.out.println();
        
        // Example 4: Write multiple lines
        System.out.println("4. Writing multiple lines:");
        String[] lines = {
            "Java File I/O",
            "==============",
            "1. FileWriter",
            "2. BufferedWriter",
            "3. FileReader",
            "4. BufferedReader"
        };
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("topics.txt"))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File 'topics.txt' created with multiple lines!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        
        System.out.println("All file write operations completed!");
        System.out.println("Check the created files in your directory.");
    }
}
