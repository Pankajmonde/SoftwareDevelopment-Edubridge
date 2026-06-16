package java8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*interface Messanger{
	void msg(String m);
}*/
public class App4 {

	public static void main(String[] args) {
		
		/*Messanger m=(msg)->System.out.println(msg);
		m.msg("Hello,H r u??");*/
		
		Consumer<String>message=m1->System.out.println(m1);
	message.accept("Hey Buddy");
	
	BiConsumer<Integer,Integer>add=(x,y)->System.out.println("Sum:"+(x+y));
	
	add.accept(10, 5);
	BiConsumer<Integer,Integer>sub=(x,y)->System.out.println("Sub:"+(x-y));
	
	sub.accept(10, 5);
	}

}