package com.genericos;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa1<T> implements Iterable<T> {

	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public Bolsa1(int tope) {
		super();
		this.tope = tope;
		int i = 2;
		Number n = i;
	}

	public void add(T objeto) {
		if (lista.size() <= tope) {

			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}

	}

	public Iterator<T> iterator() {
		return lista.iterator();
	}

}
