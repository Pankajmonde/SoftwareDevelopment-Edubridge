package Loops;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Line of Pyramid");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------Number Pattern------");
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			
		}
	}

}