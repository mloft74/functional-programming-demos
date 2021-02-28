import java.util.function.Function;

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
			System.out.println("in innermost function: a = " + a);
			System.out.println("in innermost function: b = " + b);
			System.out.println("in innermost function: c = " + c);
			return a + b + c;
		};
	}
}
