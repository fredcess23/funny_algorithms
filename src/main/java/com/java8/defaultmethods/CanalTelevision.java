package com.java8.defaultmethods;

interface CanalTelevision {
	int getCanal();
	void setCanal(int canal);
	
	default void subirCanal() {
	  setCanal(getCanal()+1);
	}

	default void bajarCanal() {
	  int canalActual=getCanal();
	  if (canalActual>0) { 
	    setCanal(getCanal()-1);
	  } else {
	    setCanal(0);
	  }
	}
}
