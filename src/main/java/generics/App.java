package generics;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		GenericClass<String,Integer, Double> g = new GenericClass<String, Integer, Double>("Hi",4,5.2);
		g.showType();
		
		//List of generics
		List<GenericClass<String,Integer, Double>> list = new ArrayList();
		list.add( new GenericClass("Hi",4,5.2));
		list.add( new GenericClass("Bye",2,5.1));
		
		for(GenericClass<String,Integer,Double> c:list){
			c.showType();
		}
		
	}

}
