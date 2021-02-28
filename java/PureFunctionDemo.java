public class PureFunctionDemo {
    private static int state = 1700;
    private static final int resetValue = 1700;

    public static void main(String[] args) {
        final var addValue = 17;
        final var num = impureFunc(addValue);
        System.out.println("num2: " + num);
        System.out.println("state before: " + resetValue + ", state after: " + state);

        state = resetValue;

        final var num2 = pureFunc(addValue);
        System.out.println("num2: " + num2);
        System.out.println("state before: " + resetValue + ", state after: " + state);
    }

    private static int impureFunc(int addValue) {
        state += addValue;
        return state;
    }

    private static int pureFunc(int addValue) {
        return state + addValue;
    }
}
