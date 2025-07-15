package FunctionalInterface;

public class testClass {
    public static void main (String[] args){
        String x = "peter" ; // you must explicity provide final keyword or never change it in the program
        // if changed anytime will raise compile time error
        test test = () -> {

            System.out.println(x);
//            x = "hope" ; doing this won't make the x effectively final nor final

        } ;

//            x = "hope" ; still violates the " must be final or effectively final" rule for lambda expressions
        test.test();
    }
}
