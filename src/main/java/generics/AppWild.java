package generics;

import java.util.ArrayList;
import java.util.List;



public class AppWild {

	public void lista(List<Alumno> lista){
		for(Alumno a:lista){
			System.out.println(a.getNombre());
		}
	}

	//WildCard UpperBounded
	//List<?> lista  =  List<? extends Object>
	//extends - Hace referencia a herencia y a implementacions
	//Reconocer/Recibir aquellas clases que son subclases o implementaciones de ...
	public void listaUpperBounded(List<? extends Persona> lista){
		for(Persona per:lista){
			System.out.println(per.getNombre());
		}
	}

	//Reconocer aquellla classes que son superclasses de ...
	public void listaLowerBounded(List<? super Alumno> lista){
		for(Object per:lista){
			if(per instanceof Alumno)
				System.out.println(((Alumno)per).getNombre());
		}
	}
	
	public static void main(String[] args){
		AppWild aw = new AppWild();
		Persona al1 = new Profesor("Terry");
		Persona al2 = new Alumno("Daysy");
		Persona al3 = new Alumno("Fredy");
		
		List<Persona> lista = new ArrayList<>();
		lista.add(al1);
		lista.add(al2);
		lista.add(al3);

		System.out.println("Wildcard UpperBounded");
		aw.listaUpperBounded(lista);
		
		System.out.println("Wildcard LowerBounded");
		aw.listaLowerBounded(lista);

	}
	
	
}
