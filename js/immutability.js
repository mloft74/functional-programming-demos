"use strict";

// Q: What is mutability? What is immutability?
// A: Mutability is the ability to mutate or change/be mutated or changed. Immutability is the opposite of mutability, where something cannot change.

function immutabilityDemo() {
	let bar = "yes";
	bar = "no";
	console.log(bar);

	const baz = "howdy";
	// baz = "later";
	console.log(baz);

	const obj = { x: 12 };
	obj.x = 15;
	console.log(obj);

	const other = { get x() { return 12 } };
	// other.x = 17
	console.log(other);
}

console.log("immutability.js loaded");
