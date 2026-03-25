package Scanner;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String pName=sc.next();
		
		System.out.println("Enter Age:");
		
		int age=sc.nextInt();
		
		System.out.println("Name is:"+pName+"\nAge is:"+age);
		
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("You are not eleigible for Voting");
		}
		

	}

}