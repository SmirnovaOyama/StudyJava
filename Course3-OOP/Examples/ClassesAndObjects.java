/**
 * ClassesAndObjects.java
 * Demonstrates creating and using classes and objects in Java
 */

// Define a Car class
class Car {
    // Fields (attributes/properties)
    String brand;
    String model;
    int year;
    String color;
    
    // Method to display car information
    void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }
    
    // Method to start the car
    void start() {
        System.out.println("The " + brand + " " + model + " is starting...");
    }
    
    // Method to drive
    void drive(int speed) {
        System.out.println("Driving at " + speed + " km/h");
    }
}

// Define a Person class
class Person {
    String name;
    int age;
    String occupation;
    
    void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old.");
        System.out.println("I work as a " + occupation);
    }
    
    void haveBirthday() {
        age++;
        System.out.println("Happy Birthday! Now I'm " + age + " years old.");
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        System.out.println("=== Classes and Objects Demo ===");
        System.out.println();
        
        // Creating Car objects
        System.out.println("--- Car Objects ---");
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2023;
        car1.color = "Blue";
        
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2022;
        car2.color = "Red";
        
        // Using car objects
        car1.displayInfo();
        car1.start();
        car1.drive(60);
        System.out.println();
        
        car2.displayInfo();
        car2.start();
        car2.drive(80);
        System.out.println();
        
        // Creating Person objects
        System.out.println("--- Person Objects ---");
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 25;
        person1.occupation = "Software Developer";
        
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 30;
        person2.occupation = "Teacher";
        
        // Using person objects
        person1.introduce();
        System.out.println();
        
        person2.introduce();
        person2.haveBirthday();
        System.out.println();
        
        // Objects are independent
        System.out.println("--- Object Independence ---");
        System.out.println("Person 1 age: " + person1.age);
        System.out.println("Person 2 age: " + person2.age);
    }
}
