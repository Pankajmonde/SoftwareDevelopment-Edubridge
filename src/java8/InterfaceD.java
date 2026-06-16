package java8;

interface Shape {
	
	void area();
	
public class interfaceD {

	public static void main(String[] args) {
		Shape s=()->System.out.println("Area method");
		s.area();		}
	}

}
