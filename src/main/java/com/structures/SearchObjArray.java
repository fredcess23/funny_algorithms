package com.structures;

import java.util.*;

class SearchObjArray {
	
    public static void main(String [] args) {
    
    	String [] sa = {"one", "two", "three", "four"};
        Arrays.sort(sa); //Ordena el array alfabeticamente (el orden natural).
        
        for(String s : sa)
        	System.out.print(s + " ");
       
        System.out.println("");
        System.out.println("one = " + Arrays.binarySearch(sa,"one")); // Busca la localizacion del elemento "one".
        System.out.println("--- ahora orden inverso ---");
        
        //Crea una instancia Comparator. En la siguiente linea se reordena el array usando el Comparator.
        ReSortComparator rs = new ReSortComparator(); 
        Arrays.sort(sa,rs);
        
        for(String s : sa)
            System.out.print(s + " ");
        
        System.out.println("");

        //Intenta buscar el array. No pasamos el parametro rs al metodo binarySearch() 
        //que usamos en el array, asi que obtenemos una respuesta (indefinida) incorrecta. 
        System.out.println("one = " + Arrays.binarySearch(sa,"one")); 
        
        // Nueva busqueda, pasando el parametro rs a binarySearch(). Esta vez obtenemos la respuesta correcta, 2.
        System.out.println("one = " + Arrays.binarySearch(sa,"one",rs));
    }
 
}


class ReSortComparator implements Comparator<String> { //Definimos el Comparator

	@Override
	public int compare(String a, String b) {
		//Al cambiar el uso de los argumentos en la invocacion de compareTo(), obtenemos el orden invertido.
		return  b.compareTo(a);
	}

}


