package com.patters.decorator;

/**
 * <p>
 * Atributos de un arma de Hierro
 * </p>
 */
public class Hierro extends ArmasAbstracto {

	public Hierro(GuerroAbstracto guerro) {
		this.guerrero = guerro;
	}

	@Override
	public int getDaño() {
		return this.guerrero.getDaño() + 10;
	}

	@Override
	public String getArmas() {
		return this.guerrero.getArmas() + " de Hierro";
	}
}