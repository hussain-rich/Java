package com.EIT.B4.ArrayChallange;


public class MinimumValueInArray {
	
	public static int findMin(int[] arr) {
	    int min = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	    }
	    return min;   
	}
	public static void main(String[] args) {
		int[] arr = {4, 2, 8, 1, 9, 5};
		int min = findMin(arr);
		System.out.println("The minimum value is: " + min);

	}
	
}
