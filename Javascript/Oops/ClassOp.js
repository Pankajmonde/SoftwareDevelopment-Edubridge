class Employee{
    disp(){
        console.log("Employee Grading system")
    }
}

let e1=new Employee();

e1.disp()

class Menu{
   show(){
    console.log("Menu Name:"+this.mname)
    console.log("Menu prise:"+this.prise)
   }
   run(rname,address){
    console.log("Menu Name:"+rname)
    console.log("Menu prise:"+address)
   }

}

let m=new Menu();

m.mname="veg biryani";
m.prise=200;
m.show();
m.run("veggis","Thane")