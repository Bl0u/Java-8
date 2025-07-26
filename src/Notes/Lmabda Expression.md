## What is a lambda expression?

A lambda expression is a function written inline in place of a delegate. It is often used in contexts like LINQ, where a delegate (function pointer) is expected. A lambda expression is an anonymous function (no name) that can be used instead of an anonymous class. It is mainly used for implementing a functional interface.

---

## What is the difference between an anonymous class and a lambda expression regarding 'this' keyword?

In an anonymous (inner) class, the `this` keyword refers to the inner class itself. In a lambda expression, `this` refers to the enclosing (outer) scope.

---

## What are some common functional interfaces in Java 8?

- `Predicate<T>`
- `Consumer<T>`
- `Supplier<T>`
- `Function<T, R>`
- `BiFunction<T, U, R>`

---

## Useful Links

- [Medium: Java Lambda Expressions Interview Questions](https://medium.com/@DilipItAcademy/interview-questions-of-java-lambda-expressions-e7c0ff1c618c)
- [JavaGuides: Java Lambda Expressions Interview Q&A](https://www.javaguides.net/2021/11/ava-lambda-expressions-interview-questions-and-answers.html)
- [InterviewBit: Java 8 Interview Questions](https://www.interviewbit.com/java-8-interview-questions/)
- [InterviewGrid: Java Lambda Expressions Interview Questions](https://www.interviewgrid.com/interview_questions/java/java_lambda_expressions)
- [NetJsTech: Java Lambda Expressions Interview Questions](https://www.netjstech.com/2017/08/java-lambda-expressions-interview-questions.html)
- [GeeksforGeeks: Java 8 Interview Questions and Answers](https://www.geeksforgeeks.org/java/java-8-interview-questions-and-answers/)
- [DZone: Top 40 Java 8 Interview Questions with Answers](https://dzone.com/articles/top-40-java-8-interview-questions-with-answers)
- [Hirist: Top 30 Java 8 Interview Questions with Answers](https://www.hirist.tech/blog/top-30-java-8-interview-questions-with-answers/#Java_8_Interview_Questions_for_Freshers)

---

## Why is `Comparator` considered a functional interface if it has many methods?

**Adding Methods from Object Class:**  
The `Object` class in Java defines several methods (`equals(Object obj)`, `hashCode()`, `toString()`, `clone()`, `notify()`, `notifyAll()`, `wait()`, etc.) that are inherited by all classes and interfaces.

Even if a functional interface (like `Comparator`) has other methods inherited from `Object`, it can still be a valid functional interface. This is because these methods are implicitly implemented by the JVM and do not count as abstract methods that would violate the "single abstract method" rule.
