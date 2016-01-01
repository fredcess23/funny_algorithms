package com.structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//grafo no dirigido

public class Grafo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int nodos = new Integer(sc.nextLine());
		int aristas = new Integer(sc.nextLine());
		
		// arreglo de lista enlazadas
		ArrayList<Integer> arreglo[] = new ArrayList[nodos+1];
		
		
		for(int i=0; i<=nodos;++i){
			arreglo[i]=new ArrayList<Integer>();
		}
		
		String line;
		for(int i=0; i<aristas;++i){
			line = sc.nextLine();
			
			int x = new Integer(line.split(" ")[0]);
			int y = new Integer(line.split(" ")[1]);
			
			//grafo no dirigido

			arreglo[x].add(y);
			arreglo[y].add(x);
			
		}
		
		//recorrer el grafo (por anchura)
		// Se usara una cola (FIFO)
		Queue<Integer> cola = new LinkedList<Integer>();
		boolean visitados[] = new boolean[nodos+1]; //verifica si se ya se visito un nodo y evitar ciclos
		cola.offer(1);
		
		while(!cola.isEmpty()){
			int temp = cola.remove();
			visitados[temp] = true;
			System.out.print(temp + " ");
			
			for(int i=0; i<arreglo[temp].size();++i){
				int nodo = arreglo[temp].get(i);
				if(!visitados[nodo]){
					cola.offer(nodo);
				}
			}
			
		}
		
		
	}

}
