"use strict";

function curryingDemo(name) {
	const func = foo(name);
	nextPiece(func);
}

function nextPiece(func) {
	const resultOfMeaningfulCalculation = 24;
	const nextFunc = func(resultOfMeaningfulCalculation);
	lastPiece(nextFunc);
}

function lastPiece(func) {
	const classMember = { string: "howdy" };
	func(classMember);
}

const foo = (a) => (b) => (c) => {
	console.log(`in "foo": a = ${a}`);
	console.log(`in "foo": b = ${b}`);
	console.log(`in "foo": c = ${c}`);
};

console.log("currying.js loaded");
