package com.java8.defaultmethods;

public abstract class CanalTelevisionImpl implements CanalTelevision {

	@Override
	public int getCanal() {
		return 0;
	}

	@Override
	public void setCanal(int canal) {
	}

	//Re define the default method
	public void bajarCanal() {
		System.out.println("Overriding the default method");
	}

	//Convert to abstract method
	public abstract void subirCanal();
	
}
