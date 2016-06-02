package com.java8.mx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface ICalculator {
	public int operation(int x, int y);

	public default int division(int x, int y) {
		return x / y;
	}

}

class Calculator implements ICalculator {

	@Override
	public int operation(int x, int y) {
		return 0;
	}

	/*
	 * @Override public int division(int x, int y){ return x%y; }
	 */
}

public class MyLambdas {

	public static void main(String[] args) {
		// first behavior
		ICalculator iSuma = (x, y) -> x + y;
		System.out.println(iSuma.operation(4, 5));

		// Second behavior
		ICalculator iMultiplicacion = (x, y) -> x * y;
		System.out.println(iMultiplicacion.operation(4, 5));

		// Using default method
		Calculator m = new Calculator();
		System.out.println(m.division(6, 3));

		// Thread using lambdas
		Runnable r = () -> System.out.println("my lambda !");
		r.run();


		
		// Lambdas with Collections
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, (a, b) -> a.compareTo(b));
		// Lambdas to iterate
		System.out.println("FOREACH");
		names.forEach(dato -> System.out.println(dato)); // magic

		
		

		// Lambdas with Collections of Objects
		Persona p1 = new Persona(10,"fredy");
		Persona p2 = new Persona(1,"cesar");
		Persona p3 = new Persona(3,"daysy");
		List<Persona> people = Arrays.asList(p1,p2,p3);
		Collections.sort(people, (a, b) -> a.getNombre().compareTo(b.getNombre()));
		people.forEach(System.out::println);
		
		// Other example of Lambdas WOW WOW WOW WOW WOW WOW
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from); // behavior
		Integer converted = converter.convert("123");
		System.out.println(converted); // 123

		
		

	}

	@FunctionalInterface
	interface Converter<F, T> {
		T convert(F from);
	}

}





class Persona {
	int id;
	String nombre;

	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}

}
