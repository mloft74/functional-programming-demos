"use strict";

// Q: What is a closure?
// A: Closures are an object/function where not only the function is stored, but also the function's scope access.

function closuresDemo() {
	const closure = makeClosure(12, 16);
	closure(5);

	const foo = [13, 12, 11, 10];
	foo.forEach(closure);
}

function makeClosure(a, b) {
	const foo = 2 * a;
	const bar = 3 * b;
	return c => {
		console.log(`in "makeClosure": a = ${a}`);
		console.log(`in "makeClosure": b = ${b}`);
		console.log(`in "makeClosure": foo = ${foo}`);
		console.log(`in "makeClosure": bar = ${bar}`);
		console.log(`in "makeClosure": c = ${c}`);
	}
}

console.log("closures.js loaded");
