package com.EIT.BasicJava;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Text");
		String text = sc.nextLine();

		switch (text) {
		case "start":
			System.out.println("machine started");
			break;
		case "stop":
			System.out.println("machine stopped");
			break;
		default:
			System.out.println("not regcognized");
		}
	}
}
