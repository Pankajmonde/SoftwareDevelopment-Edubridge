package LIst;


import java.util.Vector;

public class Vectorr {

	public static void main(String[] args) {
		Vector v=new Vector();
  
		
		v.add("sam");
		v.add(32);
		v.add(56.70);
		v.add(5.6);
		System.out.println(v);
		v.addElement("c");
		System.out.println(v);
		System.out.println(v.size());
	}

}
