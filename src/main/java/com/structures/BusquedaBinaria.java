package com.structures;

class BusquedaBinaria {
	/**
	 * Busca un valor numerico dentro de un arreglo numerico... (previamente
	 * ordenado) usando el metodo de busqueda binaria
	 * 
	 * @param arreglo con los elementos; dato a buscar
	 * @return posicion del elemento buscado, en caso de no existir retorna -1
	 */
	public static int busquedaBinaria(int vector[], int target) {
		
		int n = vector.length;
		int centro; 
		int inf = 0;
		int sup = n ;
		
		while (inf <= sup) {
			
			centro = (sup + inf) / 2;
			System.out.println("Nuevo centro " + centro);
			System.out.println("valor en centro " + vector[centro] );

			if (vector[centro] == target)
				return centro;
			
			else if (vector[centro] > target){ //lado derecho, se redefine el limite inferior
				inf = centro + 1;
			}
			else //lado izquierdo, se redefine el limite superior
				sup = centro - 1;		
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] vector = { 1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77, 79, 80, 82 };
		int valorBuscado = 70;
		System.out.println(busquedaBinaria(vector, valorBuscado));
	}
}