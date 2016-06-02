package com.java8.funcionalinterface;

public class CalculadoraLambdaTest {

	/*	 
	 "operacion" sirve para realizar una suma y producto en un mismo programa 
	 Se consigue declarando en una variable cuál es el comportamiento de 
	 este método haciendo uso de lambdas
	*/
	
	public static void main(String...args){
		
		ICalculadoraLambda iSuma = (x,y) -> x + y; 
        System.out.println(iSuma.operacion(4, 5));

        ICalculadoraLambda iMultiplicacion= (x,y) -> x * y;
        System.out.println(iMultiplicacion.operacion(4, 5));
        
	}
}
