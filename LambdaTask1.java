@FunctionalInterface
interface Arithmetic {
    int operate(int a, int b);
}

public class LambdaTask1 {
    public static void main(String[] args) {
        // Addition operation
        Arithmetic addition = (a, b) -> a + b;
        System.out.println("Addition => " + addition.operate(5, 18)); // Use operate for addition

        // Subtraction operation
        Arithmetic subtraction = (a, b) -> a - b;
        System.out.println("Subtraction => " + subtraction.operate(18, 5)); // Use operate for subtraction

        // Multiplication
        Arithmetic multiplication = (a, b) -> a * b;
        System.out.println("Multiplication => " + multiplication.operate(5, 18));

        Arithmetic division = (a, b) -> a / b;
        System.out.println("Division => " + division.operate(18, 2));
    }
}
