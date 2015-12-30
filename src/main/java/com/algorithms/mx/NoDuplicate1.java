package com.algorithms.mx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/**
 * Avoid adding duplicate elements into a list
 * Hint. Do not use a Set because the order is important
 * [2,3,4,5,6,4,3,6,7,4]
 *
 */
public class NoDuplicate1 {

public static List noDuplicate(int[] elements){
		
		HashSet set = new HashSet();
		List list = new ArrayList();
		for(int value:elements){
			//returns true if element was inserted
			if(set.add(value)){
				list.add(value);
			}			
		}
        System.out.println("Set" + set);

		return list;
	}
	
    public static void main( String[] args )
    {
        System.out.println("Avoid adding duplicate elements into a list");
        
        int[] elements = {2,3,4,5,6,2,3,4,5,6,7};
        
        List result = noDuplicate(elements);
        System.out.println("List" + result);
        
    }
}
