//javascript json
let person={
    name:"Anjana",
    course:"Ai Development"
}
console.log(person)

console.log(person.name)

let cn={
    "course" :["Java","python","C++"]

    
}
console.log(cn)

let user={
    uname:"jhon smith",
    age:34
};
console.log(user)

let data=JSON.stringify(user);

console.log(data)

let udata=JSON.parse(data);

console.log(udata)