/*
Array is object which is used to store different type elements in single variable

*/ 

let colors=["red","white","yellow","black"];

console.log(colors)
console.log(typeof(colors))

let names=new Array("sam","jhon","ajay","sujay");

console.log(names)

console.log(typeof(names))

console.log(names[0])

names[0]="sam Dao";

console.log(names)

console.log(colors[1])

//push()-Add element at end

names.push("Atharv")

console.log(names)

//unshift()-add element at first
names.unshift("sai")

console.log(names)

//pop()-bydefault  remove  last element

names.pop();
console.log(names)

names.shift();

console.log(names)

for(let i=0;i<names.length;i++){
    console.log(names[i])
}

console.log("Iterate")

for(let n of names){
    
console.log(n)
}

names.forEach(x =>
    { console.log(x)

    }
)

//map()-transform data

let numbers=[10,20,30,40];

let un=numbers.map(x=> x*x);

console.log(un)

let num=[2,3,4,5,6,8.7]

let check=num.filter(i=>i%2==0);

console.log(check)

let search=num.find(d=> d<5);

console.log(search)

let add=num.reduce((sum,a)=>sum+a,0);

console.log(add)