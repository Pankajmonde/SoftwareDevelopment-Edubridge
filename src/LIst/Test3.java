package LIst;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Person>pp=new ArrayList<Person>();
		
		pp.add(new Person("sam",20));

		pp.add(new Person("jhon",23));

		pp.add(new Person("Anjali",25));

		pp.add(new Person("aarti",20));
		
	     for(int i=0;i<pp.size();i++) {
	    	 pp.get(i).disp();
	     }
	}

}
