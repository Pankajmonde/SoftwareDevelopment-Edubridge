package LIst;


import java.util.ArrayList;

class CollectionListDemo {

	public static void main(String[] args) {
		//Integer 
		ArrayList<Integer>a1=new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
        a1.add(30);
		a1.add(10);
		a1.add(100);
		System.out.println(a1);
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("\n Enhansed For Loop \n");
		// for(return type variable new:object/array)

		for(int i:a1) {
			System.out.println(i);
		}
	}

}