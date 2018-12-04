public class Calculator {

    public void adding(double a, double b) {

        System.out.println(a+b);
    }

    public void subtraction(double a, double b) {

        System.out.println(a-b);
    }

    public static void main(String[ ] args) {

        Calculator calculator = new Calculator();
        calculator.adding(2, 5);
        calculator.subtraction(11.11,7.77);

    }
}

