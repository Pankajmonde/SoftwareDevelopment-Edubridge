package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App6 {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(10,20,30,40);
		
		System.out.println(list);
		
		List<Integer>dummylist=list.stream().collect(Collectors.toList());
		System.out.println(dummylist);
		
		List<Integer>square=list.stream()
				.map(x->x*x).collect(Collectors.toList());
		
		System.out.println(square);
		List<String>names=Arrays.asList("Ankita","Anand","Sam","Jhon");
		
		System.out.println(names);
		
		List<String>updatedNames=names.stream()
				.filter(x->x.startsWith("A")).collect(Collectors.toList());
		System.out.println(updatedNames);

		List<String>lower=names.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(lower);
  List<String>upper=names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upper);
		
		List<Integer>l1=Arrays.asList(20,4,3,2,1,0);
		
		System.out.println(l1);
		
		List<Integer>sortData=l1.stream().sorted()
				.collect(Collectors.toList());
		System.out.println(sortData);
		
		
	}

}