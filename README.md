# Abstract and Concrete Method and class

This repository contains Java code that illustrates the concepts of abstract classes, abstract methods, concrete classes, and inheritance. 
It showcases how these features work together to create a structured hierarchy of classes with shared and specialized behaviors.


## Overview

Java supports abstraction through abstract classes and methods. Abstract classes cannot be instantiated directly and serve as blueprints for other classes to inherit from. 
They can contain both abstract methods (methods without a body) that must be implemented by subclasses, and concrete methods (methods with a body) that provide default behavior.

## Code Explanation

### Abstract class Animal

```java
abstract class Animal {
    abstract public void TypeOfNoise();
    abstract public void ColorOfFur();

    public void NumberOfLegs() {
        System.out.println("Four");
    }
}
```

- **`abstract class Animal { ... }`**: Defines an abstract class `Animal` with two abstract methods `TypeOfNoise()` and `ColorOfFur()` that must be implemented by subclasses.
- It also includes a concrete method `NumberOfLegs()` that prints "Four", which subclasses inherit.

### Abstract subclass Dog

```java
abstract class Dog extends Animal {
    public void TypeOfNoise() {
        System.out.println("Bark");
    }
}
```

- **`abstract class Dog extends Animal { ... }`**: Extends `Animal` to create an abstract class `Dog`. It provides a concrete implementation of `TypeOfNoise()` by printing "Bark".
- Since `Dog` is still abstract, it doesn't need to implement all methods from `Animal`.

### Concrete subclass Tiger

```java
class Tiger extends Dog {
    public void ColorOfFur() {
        System.out.println("Black and Orange");
    }
}
```

- **`class Tiger extends Dog { ... }`**: Represents a concrete subclass `Tiger` that extends `Dog`. It must implement any remaining abstract methods inherited from `Animal`.
- Here, it provides a specific implementation for `ColorOfFur()` by printing "Black and Orange".

### Main class abstrac

```java
public class abstrac {
    public static void main(String[] args) {
        Animal A = new Tiger();
        A.TypeOfNoise();   // Output: "Bark"
        A.ColorOfFur();    // Output: "Black and Orange"
        A.NumberOfLegs();  // Output: "Four"
    }
}
```

- **`public class abstrac { ... }`**: Contains the `main` method where the program starts execution. It creates an `Animal` reference `A` that is instantiated with a `Tiger` object, demonstrating polymorphism.

- **`A.TypeOfNoise();`**: Calls `TypeOfNoise()` on `A`, which invokes `Tiger`'s implementation to print "Bark".

- **`A.ColorOfFur();`**: Calls `ColorOfFur()` on `A`, which invokes `Tiger`'s implementation to print "Black and Orange".

- **`A.NumberOfLegs();`**: Calls `NumberOfLegs()` on `A`, which prints "Four" as inherited from `Animal`.

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/JavaAbstractConcreteDemo.git
   ```

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Run the `abstrac.java` file to see the demonstration of abstract and concrete classes in action.

## Summary

This repository serves as a practical example of using abstract and concrete classes in Java to create hierarchical structures of classes with shared and specialized behaviors. 
It demonstrates how abstract methods enforce method implementation in subclasses while allowing polymorphic behavior through inheritance.

Feel free to explore and modify the code to deepen your understanding of Java's object-oriented features!

