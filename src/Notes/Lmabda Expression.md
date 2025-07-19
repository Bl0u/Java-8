what is lambda expression: it's a function that is written inline in a place of delegate, it's used in the same context as LINQ where each waits a delegate (function pointers), it's anonymous function with no name, that can be used instead of anonymous class, it's mainly used for the implementation of functional interface

what is the difference between anonmyous class and lmabda expression: we can use 'this' in inner class and it will point to the inner class also, yet in lambda expresison it will point out to enclosing scope

What are some common functional interface in java 8: Predicate, consumer, supplier, funciton<t,r>, BiFunction<T, U, R>

https://medium.com/@DilipItAcademy/interview-questions-of-java-lambda-expressions-e7c0ff1c618c
https://www.javaguides.net/2021/11/ava-lambda-expressions-interview-questions-and-answers.html
https://www.javaguides.net/2021/11/ava-lambda-expressions-interview-questions-and-answers.html
https://www.interviewbit.com/java-8-interview-questions/
https://www.interviewgrid.com/interview_questions/java/java_lambda_expressions
https://www.netjstech.com/2017/08/java-lambda-expressions-interview-questions.html
https://www.geeksforgeeks.org/java/java-8-interview-questions-and-answers/

Comparator method is a functional interface but I see a lot of other methods in Comparator method then how is it a Single Abstract method interface?
Adding Methods from Object Class:
The Object class in Java defines several methods that are inherited by all classes and interfaces. These methods include:

equals(Object obj)

hashCode()

toString()

clone()

notify(), notifyAll(), wait(), etc.
Even if a functional interface has other methods that come from the Object class (such as equals, hashCode, toString, etc.), the interface can still be a valid functional interface.

This is because these methods are implicitly implemented by the JVM, and they do not count as abstract methods that would violate the "one abstract method" rule.


https://dzone.com/articles/top-40-java-8-interview-questions-with-answers
https://www.hirist.tech/blog/top-30-java-8-interview-questions-with-answers/#Java_8_Interview_Questions_for_Freshers








