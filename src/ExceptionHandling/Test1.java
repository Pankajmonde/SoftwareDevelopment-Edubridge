package ExceptionHandling;


import java.util.Scanner;

public class Test1 {

	static void checkAge() throws AgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if(age<=18) {
			throw new AgeException("Not Eligible for voting because age is below 18 ");
		}
		else {
			System.out.println("Voting done....");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			checkAge();
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}