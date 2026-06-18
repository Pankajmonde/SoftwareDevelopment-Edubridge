package java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodRefernceDemo {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("C","C++","Java","Python");
		System.out.println(list);
		
		list.forEach(x -> System.out.println(x));
		
		System.out.println("Method Reference");
		list.forEach(System.out::println);
	}

}