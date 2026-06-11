package ExceptionHandling;


public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			try {
				
				int result=10/0;
				
				System.out.println(result);
			}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
			try {
				String name=null;
				System.out.println( name.length());
				
			}
			catch(NullPointerException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
			
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
	
		
		

	}
