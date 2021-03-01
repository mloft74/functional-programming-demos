"use strict";

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
