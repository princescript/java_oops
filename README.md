# Java OOPs (Object-Oriented Programming) Cheat Sheet

## 1. Core OOP Concepts in Java

### 1.1 Encapsulation

- Wrapping data (variables) and code (methods) into a single unit (class).
- Access modifiers: private, protected, public, default.
- Example:
  ```java
  class Person {
      private String name; // Encapsulated data
      public void setName(String name) { this.name = name; }
      public String getName() { return name; }
  }
  ```

### 1.2 Inheritance

- Mechanism where a class (child) inherits fields & methods from another (parent).
- Types: Single, Multilevel, Hierarchical, Hybrid (via interfaces).
- Example:
  ```java
  class Animal {
      void makeSound() { System.out.println("Animal makes a sound"); }
  }
  class Dog extends Animal {
      void makeSound() { System.out.println("Dog barks"); }
  }
  ```

### 1.3 Polymorphism

#### 1.3.1 Compile-Time (Method Overloading)

- Multiple methods with the same name but different parameters.
  ```java
  class MathUtils {
      int add(int a, int b) { return a + b; }
      double add(double a, double b) { return a + b; }
  }
  ```

#### 1.3.2 Runtime (Method Overriding)

- Subclass provides a specific implementation of a method in the parent class.
  ```java
  class Parent {
      void show() { System.out.println("Parent method"); }
  }
  class Child extends Parent {
      @Override void show() { System.out.println("Child method"); }
  }
  ```

### 1.4 Abstraction

- Hiding implementation details using abstract classes or interfaces.

#### 1.4.1 Abstract Class

```java
abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle {
    void start() { System.out.println("Car starts with a key"); }
}
```

#### 1.4.2 Interface

```java
interface Animal {
    void makeSound();
}
class Dog implements Animal {
    public void makeSound() { System.out.println("Bark"); }
}
```

## 2. Advanced OOP Concepts

### 2.1 Composition (HAS-A Relationship)

```java
class Engine {
    void start() { System.out.println("Engine started"); }
}
class Car {
    private Engine engine = new Engine();
    void startCar() { engine.start(); }
}
```

### 2.2 Association, Aggregation & Composition

- **Association**: General relationship between objects.
- **Aggregation**: Weak association (objects exist independently).
- **Composition**: Strong association (contained object lifecycle is tied to the container object).

### 2.3 Static vs Instance Members

- `static` variables/methods belong to the **class** instead of instances.
  ```java
  class Counter {
      static int count = 0;
      Counter() { count++; }
      static void showCount() { System.out.println("Total: " + count); }
  }
  ```

### 2.4 Final Keyword

- `final class` → Cannot be extended.
- `final method` → Cannot be overridden.
- `final variable` → Constant.
  ```java
  final class A {}
  final int MAX = 100;
  ```

## 3. SOLID Principles

### 3.1 Single Responsibility Principle (SRP)

- A class should have **one reason to change**.

### 3.2 Open-Closed Principle (OCP)

- Classes should be **open for extension, but closed for modification**.

### 3.3 Liskov Substitution Principle (LSP)

- Subtypes must be substitutable for their base types.

### 3.4 Interface Segregation Principle (ISP)

- No class should be forced to implement unused methods.

### 3.5 Dependency Inversion Principle (DIP)

- Depend on **abstractions, not concretions**.

## 4. Design Patterns in Java

### 4.1 Creational Patterns

- **Singleton**: Only one instance.
  ```java
  class Singleton {
      private static Singleton instance;
      private Singleton() {}
      public static Singleton getInstance() {
          if (instance == null) instance = new Singleton();
          return instance;
      }
  }
  ```
- **Factory Method**: Creates objects based on input.
- **Builder Pattern**: Used for complex object creation.

### 4.2 Structural Patterns

- **Adapter**: Bridges two incompatible interfaces.
- **Decorator**: Enhances behavior without modifying original class.

### 4.3 Behavioral Patterns

- **Strategy**: Select an algorithm at runtime.
- **Observer**: Notifies subscribers when an event occurs.

## 5. Exception Handling (OOP Perspective)

- `try-catch-finally` for runtime exceptions.
- `throws` to declare exceptions in method signatures.
  ```java
  void readFile() throws IOException {
      throw new IOException("File not found");
  }
  ```

## 6. Best Practices in Java OOP

✅ Follow naming conventions (`PascalCase` for classes, `camelCase` for methods & variables).  
✅ Use `private` for encapsulation, expose only through getters/setters.  
✅ Favor **composition over inheritance**.  
✅ Minimize **use of static methods** (except utility functions).  
✅ Follow **SOLID principles** and **design patterns** where applicable.

---

📌 This cheat sheet covers **everything from basics to advanced Java OOP**.
