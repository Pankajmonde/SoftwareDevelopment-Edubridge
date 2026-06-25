let a=10;
let b=0;

try {
    if(b==0){
        throw "Divide by zero error"
    }
    let result =a/b;
    console.log(result)
}
catch(error){
    console.log(error)
}

let balance=1000;
let wa=5000

try{
    if(wa>balance){
        throw "Insufficient balance"
    }
    balance-=wa;
    console.log("Remaining balance: "+balance)

}catch(error){
    console.log(error)
}

//array index

let students=["Anjana","Jhon","Smith"]

let index=6;

try{
    if(index>=students.length){
        throw "index out of range value not available"
    }
    console.log(students[index])
}catch(error){
    console.log(error)
}

//multiple catch does not support in javascript but we can use if else to handle multiple error

let cb=10000;

let amount=12000;


try{
    if(amount<0){
        throw  " invalid amount"
    }
    if(amount>cb){
        throw "Insufficent balance"
    }
    cb-=amount;
    console.log("after transaction balance is :"+cb)
}catch(error){
    console.log(error)
}