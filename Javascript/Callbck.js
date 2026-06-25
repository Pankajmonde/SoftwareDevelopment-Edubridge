function disp(){
    console.log("Disp Method")
}

function show(callback){
    callback();
}
show(disp)

function info(){
    let name="Anjana "
    console.log("Name is:"+name)
}
function greet(name){
    name();
}
greet(info)


function dispResult(marks){
    console.log("Marks :"+marks)
}

function result(total){
    let marks=78;
    total(marks);
}
result(dispResult)

function ordercomplete(){
    console.log("Order completed!!")
}

function prepareOrder(orders){
    console.log("Accept order and preparing food")
    orders();
}
prepareOrder(ordercomplete)