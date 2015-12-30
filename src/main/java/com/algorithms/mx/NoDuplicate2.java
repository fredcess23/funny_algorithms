package com.algorithms.mx;

/**
 * Find if the array contains any duplicates
 * 
 */

import java.util.HashSet;

public class NoDuplicate2 
{
	
	public boolean containsDuplicate(int[] elements) {
	    
		if(elements==null || elements.length==0)
	        return false;
	 
	    HashSet<Integer> set = new HashSet<Integer>();
	    
	    for(int value: elements){
	    	//if element was not inserted, means there is a duplicate element
	        if(!set.add(value)){
	            return true;
	        }
	    }
	 
	    return false;
	}
	
	public static void main(String[] args) {
		
        int[] elements = {2,3,4,5,6,2,7};
        NoDuplicate2 n = new NoDuplicate2();
        boolean flag = n.containsDuplicate(elements);
        
        if(flag)
        	System.out.println("there are duplicate elements");
        else
        	System.out.println("no duplicate elements");
        
	}

	
}
