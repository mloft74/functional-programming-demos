"use strict";

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
