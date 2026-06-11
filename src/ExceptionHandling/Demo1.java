package ExceptionHandling;



public class Demo1 {

	public static void main(String[] args) {
		try {
			
			String name=null;
			
			int result=10/0;
			System.out.println(name.length());
			System.out.println(result);
		}
		catch(ArithmeticException e) {
		e.printStackTrace();	
		}
		catch(NullPointerException  e) {
			System.out.println(e.getMessage());
		}

	}

}