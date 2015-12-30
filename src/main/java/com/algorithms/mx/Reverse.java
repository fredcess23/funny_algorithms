package com.algorithms.mx;

public class Reverse {
	
	public static String reverseWords(String s) {

		if (s == null || s.length() == 0) {
			return "";
		}

		// split words by space
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (int i = arr.length - 1; i >= 0; --i) {
				sb.append(arr[i]).append(" ");
		}
		return sb.toString();
	}
	
	 
		public static void main(String[] args) {
			String str = "the sky is blue";
	 
			System.out.println(reverseWords(str));
		}	
}
