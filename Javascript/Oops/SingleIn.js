class Person {
    show(){
        console.log("this is show method");
    }
}
class Info extends Person{
disp(){
    console.log("this is disp method");
}
}

let i1=new Info();
i1.disp();
i1.show();