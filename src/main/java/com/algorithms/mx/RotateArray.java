package com.algorithms.mx;



public class RotateArray {

	public static int[] rotate(int[] arr, int order) {
		//key line
		order = order % arr.length;
	 
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
	 
		//length of first part
		int a = arr.length - order; 
	 
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length-1);
		reverse(arr, 0, arr.length-1);
		return arr;
	}
	 
	public static void reverse(int[] arr, int left, int right){
		if(arr == null || arr.length == 1) 
			return;
	 
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}	
	}	
	public static void main(String[] args) {

		int []a = {1,2,3,4,5,6};
		a = rotate(a,2);
		System.out.println(a);
		
	}

}
