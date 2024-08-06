import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaTask3 {
    public static void main(String[] args) {
        // Predicate example
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5));

        // Function example
        Function<Integer, String> convertToString = x -> "Number: " + x;
        System.out.println(convertToString.apply(123));

        // Consumer example
        Consumer<String> print = x -> System.out.println(x);
        print.accept("Hello, World!");

        // Supplier example
        Supplier<Double> getRandom = () -> Math.random();
        System.out.println("Random value: " + getRandom.get());
    }
}
