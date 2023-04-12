package com.EIT.ClassObjectMethod;

class Machine {

	private String name;
	private int code;

	public Machine() {
		this("babiyo", 0);

		System.out.println("constructor running");
	}

	public Machine(String name) {
		this(name, 0);
		System.out.println("second constructor running");
		this.name = name;
	}

	public Machine(String name, int code) {
		System.out.println("third constructor running");
		this.name = name;
		this.code = code;
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		Machine robot =new Machine();
		Machine robot1=new Machine("venkat");
		Machine robot2=new Machine("siva",37);
		

	}

}
