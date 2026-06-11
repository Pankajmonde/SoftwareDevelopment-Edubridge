package Task;

abstract class A1{
	abstract void a1();
	static String name="Abstract class";
	final int a=10;
}
abstract class B1 extends A1{
	abstract void b1();
}
abstract class C1 extends B1{
	abstract void c1();
}

class Test1 extends C1{

	@Override
	void c1() {
		System.out.println("=====Method c ========");
		
	}

	@Override
	void b1() {
		
		System.out.println("=====Method b ========");
	}

	@Override
	void a1() {
		System.out.println("=====Method a ========");
		
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		Test1 t=new Test1();
		
		t.a1();
		t.b1();
		t.c1();
		System.out.println(" Name:"+ A1.name+" "+" Value:"+t.a);

	}

}
