package com.genericos;


public class Principal1 {

	public static void main(String[] args) {

		Bolsa1<Chocolatina> bolsa = new Bolsa1<Chocolatina>(2);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("ferrero");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);

		for (Chocolatina chocolatina : bolsa) {

			System.out.println(chocolatina.getMarca());
		}

	}

}
