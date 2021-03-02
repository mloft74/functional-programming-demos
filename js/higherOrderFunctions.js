"use strict";

// Q: What is a higher order function?
// A: A higher order function is a function that can take a function as an argument or return a function.

function higherOrderFunctionsDemo() {
	const func = givesFunc();
	takesFunc(func);
}

function givesFunc() {
	return function(a) {
		return 2 * a;
	};
}

function takesFunc(func) {
	const foo = func(42);
	console.log(foo);
}

console.log("higherOrderFunctions.js loaded");
