let name="sam dao";

console.log(name);

// Template literal

console.log("Name:"+name)

console.log(`Hello, My name is : ${name} `)

console.log(`Length of string:${name.length}`);

//access string

let city="Hydrabad";

console.log(city[0])

console.log(city[6])
//slice- returning string parts 
//slice(startindex,endindex)
console.log(city.slice(0,5));

console.log(city.substring(2,6))

let cname="Java Full Stack"

console.log(cname)
//replace-(search value,replace value)
console.log(cname.replace("Java","python"))

//split- divide the string
let language="c, c++, java, python";
console.log(language.split(","))

let fullname="Sam Dao"

console.log(fullname);

console.log(fullname.split(" "))

console.log(fullname.indexOf("Dao"))

console.log(fullname.includes("dao",4))

let fName="Jhon"
let lname="smith"

console.log(fName+lname)
//String is immutable-we cant update string value
fName[0]="s"

console.log(fName)

//1.Reverse string

let str="JavaScript"

console.log("String is:"+str)
//["J","a","v","a","S"]
//"t","p","i","C"
//split convert string into specific array character
let reverse=str.split("").reverse().join("")
console.log("Reverse String is:"+reverse)


//2.palindrome

let word="Madam"

let x=word.split("").reverse().join()

if(word===x){
    console.log("String is Plaindrome")
}

else{
    console.log("string is not palindrome")
}




//3. Count vowels

let s1="JavaScript";

let count=0;

for(let i of s1){
    if("aeiou".includes(i))
    {
        count++;
    }
}

console.log(count)

//4.count words

let msg="Ran in Mumbai"

let cw=msg.split(" ")

console.log(`Total word are: ${cw.length}`)

let msg1="   Javascript is scripting language    "

console.log("Main String:"+msg1)

console.log("After remove space:"+msg1.trim())
//capitalize first caharcter
let email="sam@gmail.com";

console.log(email)

let result=email.charAt(0).toUpperCase()+ email.slice(1);

console.log(result)