let btn=document.querySelector("button");
let ul=document.querySelector("ul");
let imp=document.querySelector("input");
    
btn.addEventListener("click",function(){
    let item= document.createElement("li");
    item.innerText=imp.value;
    ul.appendChild(item);
    console.log(imp.value);
    imp.value="";

    let del= document.createElement("button");
    del.innerText="delete";
    del.classList.add("delete");

    item.appendChild(del);
    ul.appendChild(item)
});

ul.addEventListener("click", function(event){
    if ( event.target.nodeName=="BUTTON"){
        let s=event.target.parentElement;
        s.remove();
        console.log("deleted")
   
 }
});
