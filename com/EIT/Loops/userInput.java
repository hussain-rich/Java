package com.EIT.Loops;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String input = sc.nextLine();

		System.out.println("the text is: " + input);
	}

}
