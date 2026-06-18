package java8;

import java.util.Optional;

public class OptionalD {
	public static void main(String args[]) {
		
		Optional<String>names=Optional.ofNullable(null);
		System.out.println(names.isPresent());
		
	}

	}
