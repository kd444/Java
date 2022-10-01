
interface Calculator {
    // abstract method
    void switchOn();
}

// traditional way public class CalculatorImpl implements Calculator
public class CalculatorImpl {
    // lambda function
    // (param) -> (body)

    public static void main(String[] args) {
        // traditinal way
        // @Override
        // public void switchOn() {
        // System.out.println("switch on ");
        // }
        Calculator calculator = () -> {
            System.out.println("switch on ");
        };
        // anonymous functions works as only one asbtract method
        calculator.switchOn();

    }
}
