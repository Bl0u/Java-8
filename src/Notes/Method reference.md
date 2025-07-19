https://www.youtube.com/watch?v=svQKKg3aFzo
https://www.youtube.com/watch?v=xZ67TS5EZNU
https://www.youtube.com/watch?v=KVCzKKbXfH0

worht mentioning, static methods in interface can be used to define utility functions or helpers

https://www.youtube.com/watch?v=8TAp5rxQy4s
explanation of method hiding: Q2
calling a static method with an instance og an object, the compiler basically replace the callee with the reference type class
Animal ref = new Dog()
Animal = reference type
Dog = instance type


what is method reference: it's a java 8 construct that can be used to reference a method without invoking it, it's used for treating methods as lambda expression
https://www.baeldung.com/java-8-interview-questions

notice that String::valueOf and String::valueOf
might be 1- Static method reference 2- unbound method reference
the difference is the one reference in an actual static function, the other is just a function, that we're calling through the class name it self to be binded with the first argument object

public void show(){
System.out.println(this.name)
}

you may wonder how String::show === s -> s.show() ;

because the Consumer funcitonal interface, 'accept' function takes only 1 argument and returns nothing, hence a consumer

when we pass a static method, we can call it via the Class name without any need of an instance or anything else, so when we do this 'String::show' on a non static function, Java compiler knows, and he understand that the caller of the function will be the first passed argument in the function we're implementing

---
What is an unbound method reference?
This:

java
Copy code
test2 fi = test2Class::length2;
means:

"I'm referencing a non-static method, but I will provide the instance later, when the functional interface gets called."

So Java says:

You’re referencing length2(String) from test2Class

But you're not passing the instance now — so the instance must be passed at runtime by the first argument of the functional interface method.

---



https://www.simplilearn.com/java-8-interview-questions-and-answers-article

https://www.youtube.com/watch?v=JBifbNB4jg8


































