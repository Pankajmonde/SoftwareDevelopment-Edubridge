"use strict";
let p1 = {
    postId: 101,
    postName: "Java is secure",
    postpublished: true
};
console.log(p1);
function disp() {
    console.log("This is Typescript function");
}
disp();
function add(a, b) {
    return (a + b);
}
console.log(add(10, 5));
//optional function
function greet(name, age, weight) {
    console.log(name + " " + age + " " + weight);
}
greet("sam", 24);
const num = (x) => {
    return x * x;
};
console.log(10);
const info = (name) => {
    return "Name:" + name;
};
console.log(info("sam Dao"));
let result = (i) => {
    return i;
};
console.log(result(100));
