package MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class testClass {
public interface Parser{
    public String parse(String str) ;
};
public class StringParser{
    public static String convert(String str){
        if (str.length() >= 5) return str.toLowerCase() ;
        return str.toUpperCase() ;
    }
};
public static class MyPrinter {
    public void print(String str, Parser p){
        str = p.parse(str) ;
        System.out.println(str);
    }
};
public static void main(String[] args) {
    MyPrinter mp = new MyPrinter() ;
    mp.print("haasdasds", (StringParser::convert)) ;

}
}


/*
so basically here, by doing
    mp.print("haasdasds", (StringParser::convert)) ;
    we successfully passed method convert from StringParser to be the implementation of the abstract method in Interface
    Parser, so when
        str = p.parse(str) ;
    is called, the function parse evaluated to the passed function which is the implementation of 'convert' form earlier

    in other words, by accpeting Parse p object in the print function, this means that we need the user to define the proper logic/implementation that the only abstract method of the interface Parse will apply when its called

 */