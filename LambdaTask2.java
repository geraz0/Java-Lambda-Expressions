@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

@FunctionalInterface
interface Farewell {
    void sayGoodbye(String name);
}

@FunctionalInterface
interface Printer {
    void print(String message);
}

public class LambdaTask2 {
    public static void main(String[] args) {
        // Create an instance of Greeting using a lambda expression
        Greeting greeting = name -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("Gabbi");

        // Create an instance of Farewell using a lambda expression
        Farewell farewell = name -> System.out.println("Goodbye, " + name + "!");
        farewell.sayGoodbye("Alex");

        // Create an instance of Printer using a lambda expression
        Printer printer = message -> System.out.println("Printing: " + message);
        printer.print("Here is a message! Du Du Doooo.");

        // Example using a lambda expression that includes a block of code
        Greeting formalGreeting = name -> {
            String title = "Mr."; // Adding a title in a formal greeting
            System.out.println("Hello, " + title + " " + name);
        };
        formalGreeting.sayHello("Mochi" + ".");
    }
}
