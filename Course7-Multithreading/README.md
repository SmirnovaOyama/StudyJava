# Course 7: Multithreading and Concurrency

## 📋 Course Overview

Learn how to write programs that can perform multiple tasks simultaneously.

## 🎯 Learning Objectives

- Understand threads and multithreading
- Create threads in Java
- Understand thread lifecycle
- Handle synchronization
- Use thread pools
- Work with concurrent collections

## 📚 Course Content

### 1. What is a Thread?

A thread is a lightweight subprocess. Multithreading allows concurrent execution of two or more parts of a program.

### 2. Creating Threads

**Method 1: Extending Thread class**
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

MyThread t = new MyThread();
t.start();
```

**Method 2: Implementing Runnable interface**
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

Thread t = new Thread(new MyRunnable());
t.start();
```

**Method 3: Lambda expression (Java 8+)**
```java
Thread t = new Thread(() -> {
    System.out.println("Thread is running");
});
t.start();
```

### 3. Thread Lifecycle

1. **New:** Thread is created
2. **Runnable:** Thread is ready to run
3. **Running:** Thread is executing
4. **Blocked/Waiting:** Thread is waiting
5. **Terminated:** Thread has finished

### 4. Thread Methods

```java
Thread t = new Thread(() -> {
    // Thread code
});

t.start();           // Start the thread
t.join();            // Wait for thread to finish
t.sleep(1000);       // Sleep for 1 second
t.interrupt();       // Interrupt the thread
t.isAlive();         // Check if thread is alive
t.getName();         // Get thread name
t.setName("MyThread"); // Set thread name
```

### 5. Synchronization

Prevent multiple threads from accessing shared resources simultaneously.

```java
class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}
```

**Synchronized block:**
```java
public void increment() {
    synchronized(this) {
        count++;
    }
}
```

### 6. Thread Communication

```java
class Message {
    private String msg;
    
    public synchronized void setMessage(String msg) {
        this.msg = msg;
        notify(); // Wake up waiting thread
    }
    
    public synchronized String getMessage() {
        try {
            wait(); // Wait for message
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return msg;
    }
}
```

### 7. ExecutorService (Thread Pools)

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

ExecutorService executor = Executors.newFixedThreadPool(3);

for (int i = 0; i < 5; i++) {
    executor.submit(() -> {
        System.out.println("Task executed by " + 
            Thread.currentThread().getName());
    });
}

executor.shutdown();
```

### 8. Concurrent Collections

```java
import java.util.concurrent.*;

// Thread-safe list
CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

// Thread-safe map
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

// Thread-safe queue
BlockingQueue<String> queue = new LinkedBlockingQueue<>();
```

## 💻 Practice Files

1. `ThreadCreationDemo.java`
2. `ThreadLifecycleDemo.java`
3. `SynchronizationDemo.java`
4. `ThreadCommunicationDemo.java`
5. `ExecutorServiceDemo.java`
6. `ConcurrentCollectionsDemo.java`

## 📝 Exercises

1. Create multiple threads to count numbers
2. Implement producer-consumer problem
3. Thread-safe bank account
4. Download manager with multiple threads
5. Parallel processing with thread pools

## 🚀 Mini Project

**Multi-threaded Web Scraper** or **Parallel File Processor**

## ✅ Next Steps

Move on to **Course 8: Advanced Topics**
