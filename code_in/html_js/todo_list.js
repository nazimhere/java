let todo=[];
let a=prompt("enter enter your choice");
console.log(a);

while(true){
 if(a=="quit"){
    console.log("quitting the app");
    break;
 }
 else if(a=="add"){
    let c=prompt("enter the task you want to enter ");{
        todo.push(c);
console.log("task added")
    }
 }
 else if(a=="list"){
    for(ad of todo){
        console.log(ad);
    }
 }
 else if(a=="delete"){
    let g = prompt("enter delete elements index");
    todo.splice(g,1);
 }
 else{
    console.log("wrong request ")
 }
}
