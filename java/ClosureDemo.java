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
			innerPrint("a", a);
			innerPrint("b", b);
			innerPrint("foo", foo);
			innerPrint("bar", bar);
			innerPrint("c", c);
			System.out.println();
		};
	}

	private static void innerPrint(String name, int val) {
		System.out.println("in inner function: " + name + " = " + val);
	}
}
