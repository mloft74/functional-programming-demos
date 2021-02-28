"use strict";

function immutabilityDemo() {
}

function mutable() {

}

function immutable() {

}

function immutableReference() {
	const obj = { x: 12 };
	obj.y = 15;
	console.log(obj);
}

console.log("immutability.js loaded");
