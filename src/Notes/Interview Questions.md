## Functional Interface

A functional interface is an interface that has exactly one abstract method.  
- It can have multiple default or static methods with implementations, but only one abstract method (method with no implementation).

---

## What is `final`?

- Example:  
  ```java
  final int x = 5;  // Must be marked final to use in an inner class or lambda (prior to Java 8)
  ```

---

## What is "effectively final"?

- If you have a variable that is assigned once and not changed, you don't need to explicitly mark it as `final`. It's *effectively final*.
  ```java
  int x = 5;  // No need for "final" if you don't modify it
  Runnable r = () -> System.out.println(x);  // This is fine
  ```

---

## What does it mean by "not effectively final"?

- If you change the value of a variable after it is captured by a lambda or inner class, it's no longer "effectively final" and will cause a compile-time error.
  ```java
  int num = 5;
  Runnable r = () -> System.out.println(num); // Still fine

  num = 6; // ❌ Now `num` is no longer "effectively final", compile error if used in lambda
  ```

---

## Variables Not Mentioned in Lambda Expression

- Any variable from the enclosing scope that is used inside a lambda must be final or effectively final.
- If you try to modify such a variable after it is used in a lambda, it will cause a compile-time error.

---

## References

- [GeeksforGeeks: Java Lambda Expression with Collections](https://www.geeksforgeeks.org/java/java-lambda-expression-with-collections/)
- [GeeksforGeeks: Java Lambda Expression Variable Capturing with Examples](https://www.geeksforgeeks.org/java/java-lambda-expression-variable-capturing-with-examples/)
