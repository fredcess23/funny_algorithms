package com.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {

	public static void main(String[] args) {

		//Cuando actualizas el array o el arraylist, el otro se actualiza automaticamente.		
		
		String[] sa = {"one", "two", "three", "four"};
		List sList = Arrays.asList(sa); // make a List
		
		System.out.println("size " + sList.size());
		System.out.println("idx2 " + sList.get(2));
		
		sList.set(3,"six"); // change List
		sa[1] = "five"; // change array
		
		for(String s : sa)
			System.out.print(s + " ");
		
		System.out.println("\nsl[1] " + sList.get(1));
		
		
		
		
		List iL = new ArrayList();
		for(int x=0; x<3; x++)
			iL.add(x);
		
		Object[] oa = iL.toArray(); // create an Object array
		Integer[] ia2 = new Integer[3];
		ia2 = (Integer[]) iL.toArray(ia2); // create an Integer array
		
		
		
		
		
	}

}
