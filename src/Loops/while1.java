package Loops;


import java.util.Scanner;

public class while1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =1;
		
		while(i<=10) {
			System.out.println(i);
			//i=i+1
			i++;
		}
		System.out.println("----10 to 1------");
		int j=10;
		
		while(j>=1) {
			
			System.out.println(j);
             // j=j-1
			j--;
			}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range how many numbers you want to add:");
		
		int n= sc.nextInt();
		int count=1;
		int sum=0;
		while(count<=n) {
			sum= sum+count;
			count++;
			
		}
		System.out.println("sum is:"+sum);
		

	}

}