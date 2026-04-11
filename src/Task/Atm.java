package Task;

import java.util.Scanner;

public class Atm {
	
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		int cp=1234;
		
		for(int attempt=1;attempt<=3;attempt++) {
			System.out.println("Enter pin");
			int pin=sc.nextInt();
			if(pin==cp) {
				System.out.println("login succesful");
			}else {
System.out.println("Wrong Pin Attempt X");
		}
		}
		System.out.println("Thank you");
		
		
		sc.close();
		
			
		
		
	}

}
