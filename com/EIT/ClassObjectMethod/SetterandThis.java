package com.EIT.ClassObjectMethod;

class Setting {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class SetterandThis {

	public static void main(String[] args) {
		Setting set1 = new Setting();

		set1.setName("babiyo");
		set1.setAge(22);

		System.out.println(set1.getName());
		System.out.println(set1.getAge());

	}

}
