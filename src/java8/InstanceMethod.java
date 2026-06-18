
package java8;


import java.util.Arrays;
import java.util.List;

public class InstanceMethod {

	public static void main(String[] args) {
		List<String>fruits=Arrays.asList("Apple","Mango","Orange","Strawberry");
		fruits.stream().map(String::toUpperCase).forEach(System.out::println);
		
		List<String>numbers=Arrays.asList("1","9","8","5","0");
		numbers.sort(String::compareToIgnoreCase);
		System.out.println(numbers);
		
		
		List<String>num=Arrays.asList("12","14","18","90");
		num.stream().map(Integer::parseInt).forEach(System.out::println);
	}

}
