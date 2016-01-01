package com.structures;

import java.util.Scanner;

public class Arbol {

	static void inorden(Node raiz){
		
		if(raiz == null)
			return;
		else{
			inorden(raiz.izq);
			System.out.print(raiz.num + " ");
			inorden(raiz.der);
		}		
	}
	
	public static void main(String...args){
		
		Node raiz = null;
		
		Scanner sc = new Scanner(System.in);
		String linea;
		while((linea = sc.nextLine())!=null){
			
			char c = linea.charAt(0);
				
			// agregar nuevos elementos al final de la lista
			if(c==('a')){
				
				int n = new Integer(linea.split(" ")[1]); //ex: a 1 or a 3
				
				if(raiz==null)
					raiz = new Node(n);
				
				else
					raiz.inserta(n);
				
			}
			else if(c=='p'){
				inorden(raiz);
			}
		}
	
	}
	
}

class Node{
	
	int num;
	Node izq;
	Node der;
	
	public Node(int n){
		num=n;
	}
	
	void inserta(int n){
		
		if(n < num){
			if(izq == null)
				izq = new Node(n);
			else 
				izq.inserta(n);
		}
		else if (n > num){
			if(der == null)
				der = new Node(n);
			else 
				der.inserta(n);
		}	
		
	}
	
}
