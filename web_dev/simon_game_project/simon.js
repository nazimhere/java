let gameseq=[];
let userseq=[];

let btn_c=["red","green","navy","grey"];

let started=false;
let level=0;

let h2=document.querySelector("h2");

document.addEventListener("keypress",function(){
    if(started==false){
    started=true;    
    levelup();
    }
});

function levelup(){
    level++;
    h2.innerText=`level ${level}`;
    
let ranid=Math.floor(Math.random()*4);
let rancol=btn_c[ranid];
let randbtn=document.querySelector(`.${rancol}`);

gameseq.push(rancol);
flash(randbtn);
console.log(gameseq);
}

function flash(btn){
    btn.classList.add("flash");
    setTimeout(function(){
        btn.classList.remove("flash")
    },150);
}

function flashuser(btn){
    btn.classList.add("flashuser");
    setTimeout(function(){
        btn.classList.remove("flashuser")
    },250);

}
function btnp(){
    let btn= this;
    flashuser(btn);

    usercolor=btn.getAttribute("id");
    console.log(usercolor); 
    userseq.push(usercolor); 

    check(userseq.length-1);

}

let allbtn_c=document.querySelectorAll(".btn");
for(b of allbtn_c){
    b.addEventListener("click",btnp)
}

function check(){
    let idx=level-1;

    if(userseq[idx]==gameseq[idx]){
       if(userseq.length==gameseq.length){
       setTimeout( levelup,1000);
       }
    }
    else{
        h2.innerHTML=`game over!  your score is <b>${level}  </b> press any key to restart`; 
        document.querySelector("body").style.backgroundColor="red" ;
        setTimeout(function()   {document.querySelector("body").style.backgroundColor="white";},250);
        reset();
    }

}
function reset(){
    started=false;
    gameseq=[];   
    userseq=[];
    level=0;
}

