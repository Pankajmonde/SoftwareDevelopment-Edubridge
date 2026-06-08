package LIst;


import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		
		ArrayList<Integer>a1=new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
		a1.add(null);
		a1.add(null);
		a1.add(100);
		System.out.println(a1);
		a1.add(500);
		a1.add(600);
		System.out.println(a1);
		a1.addFirst(700);
		a1.addLast(800);
		System.out.println(a1);
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2.add(1000);
		a2.add(2000);
		a2.add(3000);
		
		a1.addAll(a2);
		System.out.println(a1);
		a1.set(3, 5000);
		System.out.println(a1);
		if(a1.isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			System.out.println(a1);
			a1.remove(3);
		}
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		
		if(a1.isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			System.out.println(a1);
			a1.remove(3);
		}

	}

}
