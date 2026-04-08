package Array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int ja[][]=new int[3][];
		
		ja[0]=new int[3];
		ja[1]=new int[2];
		ja[2]=new int[4];
		
		
		System.out.println("............");
		for(int i=0; i<ja.length;i++) {
			for(int j=0;j<ja[i].length;i++) {
				ja[i][j]=sc.nextInt();
			}
		}
		System.out.println("/----------print---------");
		for(int i=0;i<ja.length;i++) {
			
		}

	}

}
