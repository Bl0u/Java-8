package FunctionalInterface;

public interface test {

    void test() ;
    default void first(){
        System.out.println("first");
    }

    default void second(){
        System.out.println("second");
    }
    default void third(){
        System.out.println("third");
    }

}
