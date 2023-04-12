package com.EIT.ClassObjectMethod;

class Perso{
	String name;
	String age;
}

public class object {

	public static void main(String[] args) {
		
		Perso person1=new Perso();
		person1.name="venkat";
		person1.age="22";
		
		
		Perso person2=new Perso();
		person2.name="babiyo";
		person2.age="22";
		
		System.out.println(person1.name);

	}

}
