package com.algorithms.mx;

public class Reverse1 {

	//no built-in
	public static String reverseNoBuilt(String str) {

		char[] array = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = array.length - 1; i >= 0; i--)
			sb.append(array[i]);

		return sb.toString();
	}

	//built-in function
	public static String reverseBuiltin(String str) {

		StringBuilder input = new StringBuilder(str);
		input = input.reverse();
		return input.toString();
	}

	public static void main(String[] args) {

		String input = "Jesus is my savior";
		String res = reverseBuiltin(input);
		System.out.println(res);

	}
}