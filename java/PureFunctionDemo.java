public class PureFunctionDemo {
	private static int state = 1700;
	private static final int resetValue = 1700;

	public static void main(String[] args) {
		final var addValue = 17;
		final var num = impureFunc(addValue);
		System.out.println("num: " + num);
		printState();

		state = resetValue;

		final var num2 = pureFunc(addValue);
		System.out.println("num2: " + num2);
		printState();
	}

	private static int impureFunc(int addValue) {
		state += addValue;
		return state;
	}

	private static int pureFunc(int addValue) {
		return state + addValue;
	}

	private static void printState() {
		System.out.println("state before: " + resetValue + ", state after: " + state);
	}
}
