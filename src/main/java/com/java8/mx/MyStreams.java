package com.java8.mx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreams {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		// Filter with Lambdas (Add all except Mike)
		List<String> result = names.stream()
				.filter(nombre -> !nombre.contains("mike"))
				.collect(Collectors.toList());
		System.out.println("Streams -> " + result);

		
		// Filter with Lambdas (findAny or Else) use this when u need to return a simple object not List
		String result2 = names.stream()
				.filter(nombre -> nombre.contains("mike"))
				.findAny()
				.orElse(null);
			System.out.println("finAny orElse: " + result2);
		
				
		
		// Filters again
		List<String> lines = Arrays.asList("spring", "node", "mkyong");

		List<String> result1 = lines.stream() // convert list to stream
				.filter(line -> !"mkyong".equals(line)) // filters the line,
														// equals to "mkyong"
				.collect(Collectors.toList()); // collect the output and convert
												// streams to a List

		result1.forEach(System.out::println); // output : spring node

	}
}
