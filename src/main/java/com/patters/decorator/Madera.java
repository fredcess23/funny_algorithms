package com.patters.decorator;

/**
 * <p>
 * Atributos de un arma de Madera
 * </p>
 * 
 */
public class Madera extends ArmasAbstracto {

	public Madera(GuerroAbstracto guerro) {
		this.guerrero = guerro;
	}

	@Override
	public int getDaño() {
		return this.guerrero.getDaño() + 5;
	}

	@Override
	public String getArmas() {
		return this.guerrero.getArmas() + " de Madera";
	}
}