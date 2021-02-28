"use strict";

// also referential transparency

let state = 1700;
const resetValue = state;

function pureFunctionDemo(addValue) {
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
