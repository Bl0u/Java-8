package MethodReference;

import java.util.function.Consumer;
import java.util.function.Function;

public class Test2 {
public int length2(String s){
    return s.length();
}

    public void run() {
        Function<String, Integer> fi = String::length;

        int result = fi.apply("hello world");
        System.out.println("Length: " + result); // Output: Length: 11
    }

    public static void main(String[] args) {
        new Test2().run();

    }
}
