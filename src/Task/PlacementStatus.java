package Task;
import java.util.Scanner;
public class PlacementStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String students[]= {"kavya","amit","Pankaj","Manohar","bob"};
		boolean status[]= {false, false, true, true, false};
		
		System.out.println("Enter student name which u want to check");
		
		String sname=sc.next();
		boolean found=false;
		
		for(int i=0;i<students.length;i++) {
			if(students[i].equalsIgnoreCase(sname)) {
				found=true;
				if(status[i]) { 
					System.out.println("Student is placed");
				}else {
					System.out.println("X student is not placed");
				}
			}
		}

	}

}
