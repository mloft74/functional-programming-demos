import java.util.function.Function;

public class HigherOrderFunctionDemo {
	public static void main(String[] args) {
		final var func = givesFunc();
		takesFunc(func);
	}

	private static Function<Integer, Integer> givesFunc() {
		return a -> 2 * a;
	}

	private static void takesFunc(Function<Integer, Integer> func) {
		final var foo = func.apply(42);
		System.out.println(foo);
	}
}
