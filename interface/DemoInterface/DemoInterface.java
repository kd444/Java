// explanation of default method
// we cannot make an object of interface
interface Phone {
    void call();

    // void message(); if we want to add new features but we have provide this to
    // others
    // they will need to change their methods
    // so with declaration add definition
    // by default all methods in interface are public abstract
    default void message() {
        System.out.println("sent message");
    }
}

class AndroidPhone implements Phone {
    public void call() {
        System.out.println("Calling");
    }
}

public class DemoInterface {
    public static void main(String[] args) {
        // type(interface) name = new class
        Phone p = new AndroidPhone();
        p.call();
        p.message();
    }
}
