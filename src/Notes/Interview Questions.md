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

## Difference Between Inline Lambda Expression and Method Reference

**Question:**  
What is the difference between an inline lambda expression and a method reference in Java, both in terms of compilation and runtime behavior?

**Answer:**  
- **Inline lambda expression:**  
  - When you write a lambda expression (e.g., `(x) -> doSomething(x)`), the compiler generates a private static method in the enclosing class for the body of that lambda.
  - This synthetic method receives the lambda's arguments and executes the code inside the lambda.
  - The class file size increases because of these extra methods.
  - At runtime, the lambda is invoked by calling this generated method, which may in turn call other methods.
  - **Performance:** There is typically no measurable performance difference at runtime compared to method references, but the class file is slightly larger due to the generated method.

- **Method reference:**  
  - When you use a method reference (e.g., `SomeClass::doSomething`), the compiler directly generates bytecode that calls the referenced method.
  - No extra synthetic method is generated—the reference points straight to the target method.
  - This can make the class file slightly smaller and the code a bit simpler.
  - **Performance:** As with lambdas, there is usually no runtime performance difference.

**Bottom line:**  
- Both approaches are functionally equivalent in most cases, and the performance difference is negligible.
- The main distinction is that lambdas generate an extra synthetic method in the class file, while method references do not.

---

## References

- [GeeksforGeeks: Java Lambda Expression with Collections](https://www.geeksforgeeks.org/java/java-lambda-expression-with-collections/)
- [GeeksforGeeks: Java Lambda Expression Variable Capturing with Examples](https://www.geeksforgeeks.org/java/java-lambda-expression-variable-capturing-with-examples/)
