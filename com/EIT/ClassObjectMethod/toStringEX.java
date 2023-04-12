package com.EIT.ClassObjectMethod;

class Frog {

	private int id;
	private String name;

	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {

		return id + ":" + name;
	}
}

public class toStringEX {

	public static void main(String[] args) {

		Frog frog1 = new Frog(35, "ibu");
		Frog frog2 = new Frog(37, "venkat");

		System.out.println(frog1);
		System.out.println(frog2);

	}

}
