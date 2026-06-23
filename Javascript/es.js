//old js
var name="sam";
var name="Anjana";

console.log(name)

//ES6

let fname="Vishal"

 fname="vijaya";
console.log(fname)

const a=10;

console.log(a)

//a=20;- not possible to redeclare because variable is constatnt

let email="sam@gmail.com"

console.log(email)

console.log(`Email is ${email}`)
//old way
function sum(a,b){
 console.log(a+b)
}

sum(10,6)

//Arrow function

let x=(a,b)=>{
    return "Sum is:"+ (a+b)
}
console.log(x(10,5))

//old -Default parameter

function show(name){
    console.log(name)
}
show("Aditya Patil")

//ES6 Default parameter

function greet(name="Anjali"){
    console.log(name)
}

greet()

//Rest Parameter-(...)-collect multiple value

function disp(...numbers){
    console.log(numbers)
}

disp(100,200,300)

function total(...marks){
    let sum=0;

    for(let i of marks){
        sum=sum+i

    }
    console.log(sum)
}

total(89,87,86)


//Spread opearor-(...)-copies one array to another

let a1=[3,4,5,6,7];

let a2=[...a1];

console.log(a2)

let i=[1,2]

let j=[10,20]

let k=[...i,...j]

console.log(k)

//Destructing-Extract exact values

let fruit=["apple","banana","cherry"]

let [z1,z2,z3]=fruit;

console.log(z3)

//object destructing

let p={
    pname:'jhon',
    age: 30
}
let {pname,age}=p
console.log(p)
console.log(typeof(p))