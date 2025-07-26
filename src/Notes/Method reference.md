## Video References

- [Java 8 Interview Questions and Answers | Java Lambda Expressions | YouTube](https://www.youtube.com/watch?v=svQKKg3aFzo)
- [Java 8 Interview Questions | YouTube](https://www.youtube.com/watch?v=xZ67TS5EZNU)
- [Java Lambda Expressions Interview Questions | YouTube](https://www.youtube.com/watch?v=KVCzKKbXfH0)
- [Java 8 Interview Questions: Method References & More | YouTube](https://www.youtube.com/watch?v=8TAp5rxQy4s)
- [Java 8 Interview Questions And Answers | YouTube](https://www.youtube.com/watch?v=JBifbNB4jg8)

## Static Methods in Interfaces

- Static methods in interfaces can be used to define utility functions or helpers.

---

## Method Hiding (Explained in Q2 of [this video](https://www.youtube.com/watch?v=8TAp5rxQy4s))

If you call a static method using an instance of an object, the compiler replaces the callee with the reference type's class.

Example:
```java
Animal ref = new Dog();
```
- `Animal` = reference type
- `Dog` = instance type

If you call a static method on `ref`, it's equivalent to calling it on `Animal`, not `Dog`.

---

## What is a Method Reference?

A method reference is a Java 8 construct that can reference a method without invoking it. It is used to treat methods as lambda expressions.

Useful resource: [Baeldung - Java 8 Interview Questions](https://www.baeldung.com/java-8-interview-questions)

---

### Example: Static vs Unbound Method Reference

- `String::valueOf` can be:
  1. Static method reference (to a static function)
  2. Unbound method reference (to a non-static function, to be bound at runtime)

Difference:
- A static method reference points to an actual static function.
- An unbound method reference refers to a non-static function, called via the class name, with the first argument being the instance.

---

### Example: Unbound Method Reference

```java
public void show(){
    System.out.println(this.name);
}
```

- `String::show` is equivalent to `s -> s.show()`
- The `Consumer` functional interface's `accept` method takes one argument and returns nothing, matching the above.

When passing a static method, it can be called via the class name without an instance.  
When passing a non-static method (e.g., `String::show`), Java knows that the first argument to the functional interface will be the caller object.

---

## What is an Unbound Method Reference?

Example:
```java
test2 fi = test2Class::length2;
```
This means:
- You are referencing a non-static method (`length2`) from `test2Class`.
- The instance will be provided later, when the functional interface is called.
- The instance is passed at runtime as the first argument of the functional interface method.

---

## Additional Resources

- [Simplilearn: Java 8 Interview Questions and Answers](https://www.simplilearn.com/java-8-interview-questions-and-answers-article)
