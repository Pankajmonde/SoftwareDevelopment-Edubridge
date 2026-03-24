package Constructor;
class Product {

	int pId;
	String pName;
	int price;
	
	Product() { 
     String app="Myntra";
     System.out.println("Default constructor"+"Shopping app name"+app);
	}
	Product (int pId,String pName,int price){ 
	this.pId=pId;
	this.pName=pName;
	this.price=price;
	}
	
	void info() { 
		
		System.out.println("Product Id :"+pId+"\nProduct Name:"+pName+"\nProduct price"+price);
		
	}
	Product(Product name,Product pp) {  
		pName=name.pName;
		price=pp.price;
		System.out.println(pName+" "+price);
		
		
	}
	}

public class HybridConstructor {

	public static void main(String[] args) {
		
		Product p1=new Product();
		Product p2=new Product(101,"speaker",2000);
		Product p4=new Product(102,"saree",5000);
		p2.info();
		Product p3=new Product(p2,p4);
		// TODO Auto-generated method stub

	}

}
