function Post(pname){
    this.pname=pname;
}

// add method prototype

Post.prototype.disp=function(){
    console.log("Post Name:"+this.pname)
};

let p=new Post("Java is secure")

p.disp()