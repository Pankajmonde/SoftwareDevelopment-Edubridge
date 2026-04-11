package Loops;


import java.util.Scanner;

class Bank{
	
	int accNo;
	
	String accHolderName;
	
	int balance;
	
	String emailId;
	int amount;

	
	Scanner sc=new Scanner(System.in);
	void disp() {
	 
		System.out.println("Enter Bank Account Number:");
		accNo=sc.nextInt();
		System.out.println("Enter Account Holder Name:");
		accHolderName=sc.next();
		System.out.println("Enter balance:");
		balance=sc.nextInt();
		System.out.println("Enter Eail Id:");
		emailId=sc.next();
		System.out.println("Account Number:"+accNo+"\nAccount Holder Name:"
+accHolderName+"\nAccount Balance:"+balance+"\nAccount Holder Email Id:"+emailId);
		
	}
	void deposite() {
		System.out.println("Enter How much amount u want deposite:");
		amount=sc.nextInt();
		//balance=balance+amount
		balance+=amount;
		System.out.println("After depositing balance is:"+balance);
	}
	void withdraw() {
		System.out.println("Enter How much amount u want withdraw:");
		amount=sc.nextInt();
		if(amount>balance) {
			System.out.println("OOPS!!!Transaction Cancelled due to insufficient amount(:(:(:(: " ); 
		}
		else {
			balance-=amount;
			System.out.println("After Withdrawing balance is:"+balance);
		}
	}
}
public class MenuDrivenApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		
		int ch;
		do {
			System.out.println("-----------Banking System----------");
			System.out.println("Press1-Display Account details");
			System.out.println("Press2-Deposite Money");
			System.out.println("Press3-Withdraw Money");
			System.out.println("Press4-Exit");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				b.disp();
			break;
			case 2:
				b.deposite();
			break;
			case 3:
				b.withdraw();
			break;
			case 4:
				System.out.println("Bye Bye....");
			break;
			default:
				System.out.println("Wrong choice!!");
			}
			
		}while(ch!=4);
	}

}