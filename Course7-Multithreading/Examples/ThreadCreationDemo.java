/**
 * ThreadCreationDemo.java
 * Demonstrates different ways to create and use threads in Java
 */

// Method 1: Extending Thread class
class MyThread extends Thread {
    private String threadName;
    
    public MyThread(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": Count " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished!");
    }
}

// Method 2: Implementing Runnable interface
class MyRunnable implements Runnable {
    private String threadName;
    
    public MyRunnable(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": Count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished!");
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {
        System.out.println("=== Thread Creation Demo ===");
        System.out.println();
        
        // Method 1: Using Thread class
        System.out.println("Creating threads by extending Thread class:");
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println();
        
        // Method 2: Using Runnable interface
        System.out.println("Creating threads using Runnable interface:");
        Thread thread3 = new Thread(new MyRunnable("Thread-3"));
        Thread thread4 = new Thread(new MyRunnable("Thread-4"));
        
        thread3.start();
        thread4.start();
        
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println();
        
        // Method 3: Using Lambda expression (Java 8+)
        System.out.println("Creating threads using Lambda:");
        Thread thread5 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda-Thread: Count " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Lambda-Thread finished!");
        });
        
        thread5.start();
        
        try {
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println();
        System.out.println("All threads completed!");
        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}
