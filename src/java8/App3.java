package java8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class App3 {

	public static void main(String[] args) {
		Consumer <String>m=(msg)->System.out.println(msg);
	      m.accept("Hello");
	    BiConsumer<String,Integer>info=
	  (name,age)->System.out.println("Person Name:"+name+"\tPerson Age:"+age);
	   info.accept("sam", 25);
	}

}