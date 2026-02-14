# Course 4: Java Collections Framework

## 📋 Course Overview

Learn about Java's powerful Collections Framework for storing and manipulating groups of data.

## 🎯 Learning Objectives

- Understand the Collections Framework hierarchy
- Work with List, Set, and Map interfaces
- Choose the right collection for your needs
- Use iterators and enhanced for loops
- Understand ArrayList, LinkedList, HashSet, TreeSet, HashMap, and TreeMap

## 📚 Course Content

### 1. Collections Hierarchy

```
Collection (Interface)
├── List (ordered, allows duplicates)
│   ├── ArrayList
│   ├── LinkedList
│   └── Vector
├── Set (unordered, no duplicates)
│   ├── HashSet
│   ├── LinkedHashSet
│   └── TreeSet (sorted)
└── Queue
    └── PriorityQueue

Map (separate hierarchy)
├── HashMap
├── LinkedHashMap
└── TreeMap (sorted)
```

### 2. ArrayList

Dynamic array that can grow and shrink.

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");
names.remove("Bob");
System.out.println(names.get(0)); // Alice
```

### 3. LinkedList

Doubly-linked list implementation.

```java
import java.util.LinkedList;

LinkedList<Integer> numbers = new LinkedList<>();
numbers.addFirst(1);
numbers.addLast(3);
numbers.add(1, 2); // Insert at index
```

### 4. HashSet

Unordered collection with no duplicates.

```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Apple"); // Duplicate, won't be added
```

### 5. TreeSet

Sorted set implementation.

```java
import java.util.TreeSet;

TreeSet<Integer> sortedNumbers = new TreeSet<>();
sortedNumbers.add(5);
sortedNumbers.add(2);
sortedNumbers.add(8);
// Elements are automatically sorted
```

### 6. HashMap

Key-value pairs, unordered.

```java
import java.util.HashMap;

HashMap<String, Integer> ages = new HashMap<>();
ages.put("Alice", 25);
ages.put("Bob", 30);
System.out.println(ages.get("Alice")); // 25
```

### 7. TreeMap

Sorted map by keys.

```java
import java.util.TreeMap;

TreeMap<String, Integer> sortedMap = new TreeMap<>();
sortedMap.put("Charlie", 35);
sortedMap.put("Alice", 25);
// Keys are automatically sorted
```

### 8. Iterating Collections

```java
// Enhanced for loop
for (String name : names) {
    System.out.println(name);
}

// Iterator
Iterator<String> it = names.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

// forEach (Java 8+)
names.forEach(name -> System.out.println(name));
```

## 💻 Practice Files

1. `ArrayListDemo.java` - ArrayList operations
2. `LinkedListDemo.java` - LinkedList operations
3. `HashSetDemo.java` - Set operations
4. `HashMapDemo.java` - Map operations
5. `CollectionsComparison.java` - When to use which collection

## 📝 Exercises

1. Student grade management with ArrayList
2. Remove duplicates using HashSet
3. Word frequency counter with HashMap
4. Implement a phonebook
5. Sort custom objects with TreeSet

## 🚀 Mini Project

**To-Do List Manager** using appropriate collections

## ✅ Next Steps

Move on to **Course 5: Exception Handling**
