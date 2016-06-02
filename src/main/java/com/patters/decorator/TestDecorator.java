package com.patters.decorator;

public class TestDecorator {

	/**
	 * http://java-white-box.blogspot.com.ar/2014/10/patrones-de-diseno-patron.html
	 * 
	 * El Patrón Decorator  es un patrón que permite agregar funcionalidades y
	 * responsabilidades a objetos de forma dinámica y transparente para el usuario, 
	 *  proporcionando una alternativa flexible a la herencia para extender funcionalidad.
	 * 
	 */
	public static void main(String[] args) {

		GuerroAbstracto infanteria = new Infanteria();
		infanteria = new Madera(infanteria);
		infanteria = new Fuego(infanteria);

		System.out.println(infanteria.getArmas());
		System.out.println(infanteria.getDaño());
	}

}