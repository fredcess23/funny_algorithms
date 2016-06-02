package com.patters.decorator;

/**
 * <p>
 * Atributos de un arma de Fuego
 * </p>
 */
public class Fuego extends ArmasAbstracto {

	public Fuego(GuerroAbstracto guerro) {
		this.guerrero = guerro;
	}

	@Override
	public int getDaño() {
		return this.guerrero.getDaño() + 30;
	}

	@Override
	public String getArmas() {
		return this.guerrero.getArmas() + " con Fuego";
	}
}