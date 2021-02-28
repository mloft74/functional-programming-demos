"use strict";

function closuresDemo() {
	const closure = makeClosure(12, 16);
	closure(5);
}

function makeClosure(a, b) {
	const foo = 2 * a;
	const bar = 3 * b;
	return function(c) {
		console.log(`in "makeClosure": a = ${a}`);
		console.log(`in "makeClosure": b = ${b}`);
		console.log(`in "makeClosure": foo = ${foo}`);
		console.log(`in "makeClosure": bar = ${bar}`);
		console.log(`in "makeClosure": c = ${c}`);
	}
}

console.log("closures.js loaded");
