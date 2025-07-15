Functional Interface: it's an iterface that has 1 abstract method only
note it can have multiple default implemented method inside the interface, but must has only 1 abstract method, a method that has no implementation and it must has only one
what is final ?
final int x = 5;  // You had to literally mark it final to use it in an inner class


what is effectively final
int x = 5;  // You don't need to write "final" if you don't change it — it's *effectively final*
Runnable r = () -> System.out.println(x);

what does it mean by not effectively final
int num = 5;
Runnable r = () -> System.out.println(num); // Fine

num = 6; // ❌ Now `num` is no longer "effectively final"
which gives compile time errors
This will fail to compile, because the lambda captured num, and you changed it after — which breaks the "effectively final" rule.


what is the deal with variable that aren't mentioned in lambda expression itself?
    must be final or effectively final, meaning, the lambda enclosing pracets, can't and must not adjust these non mentioned variables -> compile time error


https://www.geeksforgeeks.org/java/java-lambda-expression-with-collections/
https://www.geeksforgeeks.org/java/java-lambda-expression-variable-capturing-with-examples/
