package Task;


import java.util.Scanner;

class BankApp{
	
	int accNo;
	
	int balance;
	
	String accHolderName;
	BankApp(){}
	BankApp(int accNo,int balance,String accHolderName){
		this.accNo=accNo;
		this.balance=balance;
		this.accHolderName=accHolderName;
	}
	
	void deposite(int amount) throws InvalidAmount {
		if(amount<=0) {
			throw new InvalidAmount("Please enter correct Amount for Deposite.");
			
		}
		balance+=amount;
		System.out.println("Amount is deposited successfully :"+balance);
	}
	
	void withdraw(int amount) throws InvalidAmount, InsufficientBalance {
		if(amount<=0) {
			throw new InvalidAmount("Please enter correct Amount for Withdraw.");
			
		}
		if(amount>balance) {
			throw new InsufficientBalance("Please enter correct amount");
		}
		balance-=amount;
		System.out.println("Amount withdraw successfully:"+balance);
	}
	
	void display() {
		System.out.println("Account Number:"+accNo+"\nAccount Holder Name:"+accHolderName+"\nBalance is:"+balance);
	}
}
public class BankingSystem {

	public static void main(String[] args) throws InvalidAmount, InsufficientBalance {
		Scanner sc=new Scanner(System.in);
		int ch;
		BankApp b=new BankApp();
		do {
			System.out.println("=======Welcome to Banking App========");
			System.out.println("pree 1: Add Details:");
			System.out.println("Press 2: Deposite Money");
			System.out.println("Press 3:Withdraw Money");
			System.out.println("Press 4: Display Details");
			System.out.println("Press 5:Exit");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			try {
			switch(ch) {
			case 1:
				System.out.println("Enter Account number: ");
				b.accNo=sc.nextInt();
				System.out.println("Enter Account Holder Name:");
				b.accHolderName=sc.next();
				System.out.println("Enter Current balance:");
				b.balance=sc.nextInt();
				BankApp b1=new BankApp(b.accNo,	b.balance,b.accHolderName);
				b.display();
				break;
			case 2:
				System.out.println("Enter How much amount u want deposite:");
				int damount=sc.nextInt();
				b.deposite(damount);
				break;
			case 3:
				System.out.println("Enter How much amount u want Withdraw:");
				int wamount=sc.nextInt();
				b.withdraw(wamount);
				break;
			case 4:
				b.display();
			break;
			case 5:
				System.out.println("Bye Bye..");
			break;
			default:
				System.out.println("Wrong choice:");
			}
			}
			catch(InvalidAmount e) {
				System.out.println(e.getMessage());
			}
			catch(InsufficientBalance i) {
				System.out.println(i.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				}
		}
			while(ch!=5);
			}
	}
