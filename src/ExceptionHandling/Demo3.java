package ExceptionHandling;



import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		
		try {
			int a[]=new int[5];
			a[0]=100;
			a[9]=1000;
			for (int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		}catch(Exception e) {e.printStackTrace();}
			finally {
				 Scanner sc=new Scanner(System.in);
					System.out.println("Enter message:");
					String msg=sc.next();
			System.out.println("Message:"+msg);
		}
		System.out.println("Hello!!!!!!!");
		
	
	}
}