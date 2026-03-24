package Scanner;

import java.util.Scanner;

class Menu{
	int MenuId;
	String Menuname;
	String MenuType;
	int price;
	int qty;
	Scanner sc=new Scanner(System.in);
	

void display() {
	System.out.println("Enter your Id");
	MenuId=sc.nextInt();
	
	System.out.println("Enter Menu Name");
	Menuname=sc.next();
	
	System.out.println("Enter Menu TYPE");
	MenuType=sc.next();
	
	System.out.println("eNTER NEW PPRICE");
	price=sc.nextInt();
	
	
	System.out.println("Enter menu Quantity");
	qty=sc.nextInt();
	
	System.out.println(MenuId+" "+Menuname+" "+price+" "+qty);
	
	
	
	
	
	
	
	
}
void bill() {  
	
	int totalBill=qty*price;
	System.out.println("Bill is "+totalBill);

	}

}


	

public class ScannerInput {

	public static void main(String[] args) {
		Menu m=new Menu();
		m.display();
		m.bill();

	}

}
