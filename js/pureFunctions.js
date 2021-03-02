"use strict";

// Q: What is a pure function? What are side effects?
// A: A pure function is a function that has no side effects. Side effects are anything the can change the state of a program.

let state = 1700;
const resetValue = state;

function pureFunctionDemo() {
	const addValue = 17;
	const num = impureFunc(addValue);
	console.log(`num: ${num}`);
	console.log(`state before: ${resetValue}, state after: ${state}`)

	state = resetValue;

	const num2 = pureFunc(addValue);
	console.log(`num2: ${num2}`);
	console.log(`state before: ${resetValue}, state after: ${state}`)
}

function impureFunc(addValue) {
	state += addValue;
	return state;
}

function pureFunc(addValue) {
	return state + addValue;
}

console.log("pureFunctions.js loaded");
