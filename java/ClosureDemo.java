import java.util.function.Consumer;
import java.util.stream.Stream;

public class ClosureDemo {
    public static void main(String[] args) {
        final var closure = makeClosure(12, 16);
        closure.accept(5);

        final var foo = Stream.of(13, 12, 11, 10);
        foo.forEach(closure);
    }

    private static Consumer<Integer> makeClosure(int a, int b) {
        final var foo = 2 * a;
        final var bar = 3 * b;
        return c -> {
            System.out.println("in inner function: a = " + a);
            System.out.println("in inner function: b = " + b);
            System.out.println("in inner function: foo = " + foo);
            System.out.println("in inner function: bar = " + bar);
            System.out.println("in inner function: c = " + c);
            System.out.println();
        };
    }
}
