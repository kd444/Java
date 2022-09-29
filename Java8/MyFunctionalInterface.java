
public interface MyFunctionalInterface {
    void m1();

    // we can only define one abstract class S
    // void m18();
    // for functinal interface method which is abstract for that only we can write
    // lambda expression
    default void m2() {
        System.out.println("Default method-1");
    }

    default void m3() {
        System.out.println("Default method-2");
    }

    static void mi() {
        System.out.println("static method-1");
    }

    public static void main(String[] args) {

    }
}