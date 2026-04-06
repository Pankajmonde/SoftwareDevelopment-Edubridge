package Array;


public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud[]= new Student[3];
		
		stud[0]= new Student(101, "sam",20,"A");
		stud[1]= new Student(98, "John",15,"B");
		stud[2]= new Student(100, "adi",10,"A");
		
		for (Student i:stud) {
			System.out.println(i.toString());
		}

	}

}
