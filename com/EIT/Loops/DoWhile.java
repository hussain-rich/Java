package com.EIT.Loops;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int value = 0;
		do {
			System.out.println("enter the number");
			value = sc.nextInt();
		} while (value != 5);
		System.out.println("got 5");

	}

}
