// In Java, lambda syntax doesn't make a function. Lambda syntax makes an object.

// Functional interface AKA single abstract method (SAM)
interface MyFunction {
	int apply(int number);
}

public class JavaWeirdness {
	public static void main(String[] args) {
		printer(new MyFunction() {
			@Override
			public int apply(int number) {
				return number + 16;
			}
		});

		printer(num -> num + 16);
	}

	private static void printer(MyFunction func) {
		System.out.println(func.apply(12));
	}
}
