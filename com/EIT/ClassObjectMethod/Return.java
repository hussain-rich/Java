package com.EIT.ClassObjectMethod;

class Name {
	String name = "jeris";
	int age = 22;

	void hello() {
		System.out.println("my name is " + name);
	}

	int calculateReteirmentAge() {
		int yearsleft = 65 - age;
		return yearsleft;
	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}
}

public class Return {

	public static void main(String[] args) {
		Name person = new Name();

		int years = person.calculateReteirmentAge();
		System.out.println(years);

		String name1 = person.getName();
		int age1 = person.getAge();
		System.out.println(name1);
		System.out.println(age1);

	}

}
