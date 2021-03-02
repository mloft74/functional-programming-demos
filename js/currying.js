"use strict";

// Q: What is currying?
// A: Currying is the process of converting a function with n arguments into n functions of 1 argument. Named after Haskell Curry.

function curryingDemo(name) {
	notCurried(name, 24, { greeting: "howdy" })
	const func = curried(name);
	nextPiece(func);
}

function nextPiece(func) {
	const resultOfMeaningfulCalculation = 24;
	const nextFunc = func(resultOfMeaningfulCalculation);
	lastPiece(nextFunc);
}

function lastPiece(func) {
	const classMember = { greeting: "howdy" };
	func(classMember);
}

function notCurried(a, b, c) {
	console.log(`in "notCurried": a = ${a}`);
	console.log(`in "notCurried": b = ${b}`);
	console.log(`in "notCurried": c = ${c}`);
}

const curried = (a) => (b) => (c) => {
	console.log(`in "curried": a = ${a}`);
	console.log(`in "curried": b = ${b}`);
	console.log(`in "curried": c = ${c}`);
};

console.log("currying.js loaded");
