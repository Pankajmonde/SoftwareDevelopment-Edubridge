package LIst;


public class Person {

	String pname;
	int age;
	public Person(String pname, int age) {
		super();
		this.pname = pname;
		this.age = age;
	}
	
	
	public void disp() {
		System.out.println("Person Name:"+this.pname+"\nPerson Age:"+this.age);
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
