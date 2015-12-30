package com.algorithms.mx;

import java.util.Collection;
import java.util.Stack;

public class PolishNotation {
	
	//just for testing purposes
	public static <T> T addAndReturn(T element, Collection<T> collection){
	    collection.add(element);
	    return element;
	}
	
	public static void main(String...args){
		
		PolishNotation p = new PolishNotation();
		String []input ={"2","1","+","3","*"};
		
		int result = p.evalRPN(input);
		System.out.println(result);
	}
	
    public int evalRPN(String[] tokens) {
    		
        int returnValue = 0;
 
        String operators = "+-*/";
 
        Stack<String> stack = new Stack<String>();
 
        for(String t : tokens){
        	
        	//key condition
        	//push to stack if it is a number
            if(!operators.contains(t)){
                stack.push(t);
            }
          //pop numbers from stack if it is an operator
            else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                //int index = operators.indexOf(t);
                switch(t){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
 
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
 
    }
}