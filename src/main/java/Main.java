public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Calculator calculator = new Calculator();

        greeter.greet("Monkey");
        System.out.println(calculator.add(4, 5));
        System.out.println(calculator.subtract(4, 5));

    }
}

