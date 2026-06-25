"use strict";
var colors;
(function (colors) {
    colors[colors["White"] = 0] = "White";
    colors[colors["Green"] = 1] = "Green";
    colors[colors["Blue"] = 2] = "Blue";
})(colors || (colors = {}));
let c = colors.Green;
console.log("Color value:", c);
let arr = [1, 2, 3, 4, 5];
console.log("Array values:", arr);
