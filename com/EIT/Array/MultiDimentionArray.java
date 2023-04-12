package com.EIT.Array;

public class MultiDimentionArray {
	public static void main(String[] args) {
		int[][] text= {{4,02,2,5,},{6,2,4,8},{5,1,7,3}}; 
		
		for(int row=0;row<text.length;row++) {
			for(int col=0;col<text[row].length;col++) {
				System.out.print(text[row][col] + "\t");
			}
			System.out.println();
		}

	}
}
