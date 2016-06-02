package com.java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ForEachTest {



	public static void main(String... args) {

		// EJEMPLO1
		// print ten random numbers
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);

		//EJEMPLO2: MAP + STREAM
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		//Normal way to loop a map
		System.out.println("-----------Normal way to iterate------------");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		System.out.println("-----------Java 8 foreach MAP------------");
		//Java 8 with foreach + lambda
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		

		System.out.println("-----------Java 8 foreach MAP + condition------------");
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
		
		
		//EJEMPLO 3: 
		System.out.println("-----------Java 8 foreach + LIST------------");

		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		strings.forEach((E)->System.out.println("Item : " + E));

		System.out.println("-----------Java 8 foreach pure------------");
		strings.forEach(System.out::println);

		System.out.println("-----------Java 8 foreach + LIST + condition------------");
		strings.forEach(item->{
			if("bc".equals(item)){
				System.out.println(item);
			}
		});
		
	}

}
