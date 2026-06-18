package java8;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Cat{
	public void sound(String s) {
		System.out.println("Sound.."+s);
	}
}

class Calculator{
	public void sum(int a,int b) {
		System.out.println("Addition is: "+(a+b));
	}
}
public class MethodreferenceDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat a = new Cat();
		Calculator b = new Calculator();
		Consumer<String> sounds = a:: sound;
		sounds.accept("Meow Meow");
		BiConsumer<Integer,Integer> adder = b::sum;
		adder.accept(10, 20);
	}

}