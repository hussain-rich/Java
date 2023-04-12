package com.EIT.ClassObjectMethod;

class persons {
	String name;
	String age;
	
	
	void hello() {
		for(int i=0;i<2;i++) {
		System.out.println("my name is "+ name +" and i am"+ age +" years old");
		}
	}
	void hello1() {
		System.out.println("hello there");
	}
}

public class Method {
	public static void main(String[] args) {

		persons person1 = new persons();
		person1.name = "venkat";
		person1.age = "22";
		person1.hello();
		person1.hello1();
		
		
		persons person2 = new persons();
		person2.name = "babiyo";
		person2.age = "22";
		person2.hello();
		person2.hello1();

		System.out.println(person1.name);

	}

}
