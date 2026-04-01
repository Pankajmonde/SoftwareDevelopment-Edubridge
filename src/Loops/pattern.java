package Loops;

public class pattern {

	public static void main(String[] args) {
		System.out.println("---Inverted---");
	  for(int row=n; row>=1;row--) {
		  for(int space=1;space<=n-row;space++) {
			  System.out.print("");
		  }
		  for(int col=1;col<=row;col++) {
			  System.out.print("*");
		  }
	  System.out.println();
	}

}
