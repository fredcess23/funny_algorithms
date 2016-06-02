package com.patters.decorator;

/**
 * <p>
 * Guerrero de infanteria con los métodos ya implementados
 * </p>
 * 
 */
public class Infanteria extends GuerroAbstracto {

	@Override
	public int getDaño() {
		return 10;
	}

	@Override
	public String getArmas() {
		return "Espada";
	}
}