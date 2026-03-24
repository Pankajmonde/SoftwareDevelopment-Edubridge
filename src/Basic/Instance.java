package Basic;


class Student {
	
	int rollNumber;
	String name;
	
	static String collegeName="Saraswati";
	
	void result(String grade) {

		  System.out.println( name+" "+"Grade is:"+grade);
		  }
}
public class Instance {
	public static void main(String[]agrs) {
		
		Student s1=new Student();
		s1.rollNumber=101;
		s1.name="sam";
		
		System.out.println(s1.rollNumber+" "+s1.name+" "+Student.collegeName);
		s1.result("A");
		Student s2=new Student();
		s2.rollNumber=102;
		s2.name="John";
		
		
	}
	
	

}
