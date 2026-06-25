let tasks=[];

function addTask(){

let task=document.getElementById("task").value;

if(task=="")
{
alert("Please Enter Task");
return;
}

tasks.push(
{
name:task,
completed:false
});

document.getElementById("task").value="";

displayTask();

}

function displayTask(){

let list=document.getElementById("list");

list.innerHTML="";

let completedCount=0;

tasks.forEach(function(item,index){

let li=document.createElement("li");

if(item.completed)
{
li.classList.add("completed");
completedCount++;
}

li.innerHTML=`

<span>${item.name}</span>

<div>

<button onclick="completeTask(${index})">

Complete

</button>

<button onclick="deleteTask(${index})">

Delete

</button>

</div>

`;

list.appendChild(li);

});

document.getElementById("count").innerHTML=completedCount;

}

function completeTask(index){

tasks[index].completed=true;

displayTask();

}

function deleteTask(index){

tasks.splice(index,1);

displayTask();

}