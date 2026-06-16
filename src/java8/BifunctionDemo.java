package java8;

import java.util.function.BiFunction;

public class BifunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String>add=(x,y) 
				-> "Add:"+ (x+y);
				System.out.println(add.apply(25, 23));
	
		BiFunction<String, Integer, String>info=
				(name,age) -> "Name :"+ name + "Age :"+age;
				System.out.println(info.apply("Raj", 45));
				
	}

}