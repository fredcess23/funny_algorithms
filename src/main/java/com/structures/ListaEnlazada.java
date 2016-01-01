package com.structures;

import java.util.Scanner;

public class ListaEnlazada {

	public static void main(String...args){
		
		Scanner sc = new Scanner(System.in);
		Nodo primero = null; //head
		Nodo ultimo = null; // tail
		
		String linea;
		while((linea = sc.nextLine())!=null){
			
			char c = linea.charAt(0);
			
			// agregar nuevos elementos al final de la lista
			if(c==('a')){
				
				int n = new Integer(linea.split(" ")[1]); //ex: a 1 or a 3
				Nodo nuevo = new Nodo(n);
				nuevo.sig=null;
				
				if(primero==null && ultimo==null) //lista vacia
				{
					primero = nuevo;
					ultimo = nuevo;
				}
				else{
					//si no esta vacia agregamos el nuevo nodo al final
					ultimo.sig = nuevo; // modifica la propiedad sig de primero y ultimo
					ultimo = nuevo; // pierde la referencia anterior y apunta a otro objeto
				}
			}
			// imprimir , recorrer todos lo nodos de la lista de princio a fin
			else if(c=='p'){
				
				Nodo temp = primero;
				
				while(temp!=null) //mientras no se haya llegado al final de lista
				{
					System.out.print(temp.num + " ");
					temp = temp.sig; // avanzando...
				}
				System.out.println("");
		
			}
			
		}
		
	}
}

class Nodo{
	
	int num;
	Nodo sig;
	
	public Nodo(int n){
		this.num = n;
	}
	
}
