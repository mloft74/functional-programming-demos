// Q: What is mutability? What is immutability?
// A: Mutability is the ability to mutate or change/be mutated or changed. Immutability is the opposite of mutability, where something cannot change.

public class ImmutabilityDemo {
	public static void main(String[] args) {
		var bar = "yes";
		bar = "no";
		System.out.println(bar);

		final var baz = "howdy";
		// baz = "later";
		System.out.println(baz);

		final var thing = new Foo();
		thing.member = 17;
		System.out.println(thing.member);

		final var other = new Zap();
		// other.member = 19;
		System.out.println(other.member);
	}
}

class Foo {
	public int member = 12;
}

class Zap {
	public final int member = 12;
}
