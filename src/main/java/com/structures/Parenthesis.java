package com.structures;

import java.util.HashMap;
import java.util.Stack;

public class Parenthesis {

	
	public static boolean isValid(String s) {
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) { //keys
				stack.push(curr);
				
			} else if (map.values().contains(curr)) { //values
				
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
			
				} else {
					return false;
				}
			
			}
		}
	 
		return stack.empty();
	}
	
	
	public static void main(String[] args) {

		String test = "([)";
		if(isValid(test)){
			System.out.println("It´s valid");
		}
		else
			System.out.println("NO valid");

	
	}

}
