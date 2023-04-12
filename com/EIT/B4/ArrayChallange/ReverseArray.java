package com.EIT.B4.ArrayChallange;

import java.util.Arrays;

public class ReverseArray {
	public static void reverseArray(int[] arr) {
	    int temp;
	    for (int i = 0; i < arr.length / 2; i++) {
	        temp = arr[i];
	        arr[i] = arr[arr.length - 1 - i];
	        arr[arr.length - 1 - i] = temp;
	    }
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));


	}

}
