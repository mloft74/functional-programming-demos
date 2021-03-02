import java.util.function.Function;

// Q: What is currying?
// A: Currying is the process of converting a function with n arguments into n functions of 1 argument. Named after Haskell Curry.

public class CurryingDemo {
	public static void main(String[] args) {
		final var name = "Brayden";
		final var func = foo(name);
		nextPiece(func);
	}

	public static void nextPiece(Function<Integer, Function<Integer, String>> func) {
		final var resultOfSomeCalculation = 24;
		final var nextFunc = func.apply(resultOfSomeCalculation);
		lastPiece(nextFunc);
	}

	public static void lastPiece(Function<Integer, String> func) {
		final var anotherNum = 87;
		final var result = func.apply(anotherNum);
		System.out.println("result: " + result);
	}

	public static Function<Integer, Function<Integer, String>> foo(String a) {
		return b -> c -> {
			innerPrint("a", a);
			innerPrint("b", b);
			innerPrint("c", c);
			return a + b + c;
		};
	}

	private static <T> void innerPrint(String name, T val) {
		System.out.println("in inner function: " + name + " = " + val);
	}
}
