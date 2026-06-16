package java8;
interface Add{
	void add(int a,int b);
}
interface Sub{
	void sub(int a,int b);
}
interface Mul{
	void mul(int a,int b);
}
interface Div{
	void div(int a,int b);
}
interface Message{
	void hi();
}
public class InterfaceDe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=(x,y)->System.out.println("Sum:"+(x+y));
		Sub s=(x,y)->System.out.println("Substraction:"+(x-y));
		Mul m=(x,y)->System.out.println("Multiplication:"+(x*y));
		Div d=(x,y)->System.out.println("Division:"+(x/y));
		
		a.add(10, 20);
		s.sub(20, 10);
		m.mul(20, 10);
		d.div(20, 10);
		Message msg=()->System.out.println("Hello");
		msg.hi();

	}

}
