package com.algorithms.mx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 */

public class TwoSum {

	// Solution 1 - Brute force
	public static int[] twoSum(int[] numbers, int target) {
		int[] ret = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					ret[0] = numbers[i];
					ret[1] = numbers[j];
				}
			}
		}
		return ret;
	}

	// Solution 2 - Using a hashmap
	public static int[] twoSumByHash(int[] numbers, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int indexOfArray = map.get(numbers[i]);
				result[0] = numbers[indexOfArray];
				result[1] = numbers[i];
				break;
			} else {
				map.put(target - numbers[i], i); // i is saving the position of
													// the array, ex: (2,0)...
			}
		}

		return result;
	}

	//By Binary Search
	public static int[] twoSumBinary(int[] numbers, int target) {

		int[] result = new int[2];
		Integer index = null;
		Arrays.sort(numbers);
		int diff;

		for (int value : numbers) {
			diff = target - value;
			index = Arrays.binarySearch(numbers, diff);
			if (index >= 0) {
				result[0] = value;
				result[1] = numbers[index];
				break;
			}
		}

		return result;
	}

	public static List<String> twoSumBinary2(int[] numbers, int target) {

		List<String> result = new ArrayList<String>();
		Integer index = null;
		Arrays.sort(numbers);
		int diff;

		for (int value : numbers) {
			diff = target - value;
			index = Arrays.binarySearch(numbers, diff);
			if (index >= 0) {
				result.add("(" + value + ", " + numbers[index] + ")");
			}
			index=null;
		}

		return result;
	}

	public static void main(String... args) {

		int[] a = { 11, 7, 2, 15, 4 };
		
		System.out.println("By Hashmap");
		int res1[] = twoSumByHash(a, 9);
		System.out.println(res1[0] + " " + res1[1]);

		System.out.println("By Binary Search");
		int res2[] = twoSumBinary(a, 9);
		System.out.println(res2[0] + " " + res2[1]);

		// ++++++++++++++++++++++//
		int[] b = { 3, 5, 2, -4, 8, 11 };
		System.out.println("By Binary Search (pairs)");
		List res = twoSumBinary2(b, 7);
		System.out.println(res);

	}
}
