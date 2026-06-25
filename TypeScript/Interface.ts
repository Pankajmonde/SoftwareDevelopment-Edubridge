interface Post{

    postId:number;
    postName:string;
    postpublished:boolean;

}

let p1:Post={

    postId:101,
    postName:"Java is secure",
    postpublished:true

}

console.log(p1);

function disp():void{

    console.log("This is Typescript function");

}

disp();

function add(a:number,b:number):number{

    return a+b;

}

console.log(add(10,5));

function greet(name:string,age:number,weight?:number):void{

    console.log(name+" "+age+" "+weight);

}

greet("sam",24);

const num=(x:number):number=>{

    return x*x;

}

console.log(num(10));

const info=(name:string):string=>{

    return "Name:"+name;

}

console.log(info("sam Dao"));

let result=(i:number):number=>{

    return i;

}

console.log(result(100));