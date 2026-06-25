//ReferenceError
/*
let result=a+100;
 a not defined so refrence error
console.log(result)
To handle error use try catch
try{
 code here
 }catch(error){
 }
*/ 
try{
    let result=a+100;

console.log(result)
}catch(error){
    console.log("a is not defined")
}


console.log("Hello")

try{
    let result=x+100;

  
}
catch(error){
    console.log(error)
}
finally{
    console.log("sum:"+(10+20))
}

let age=15;

try{
    if(age<=18){
        throw "not eligible for voting"
    }
}
catch(error){
console.log(error)
}

let pass="";

try{
    if(pass==""){
        throw "password required for login"
    }


}catch(error){
    console.log(error)
}