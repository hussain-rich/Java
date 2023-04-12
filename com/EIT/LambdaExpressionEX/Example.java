package com.EIT.LambdaExpressionEX;

interface sample{
	int add(int a,int b);
}
class samp{
	public void run(sample e) {
		int value =e.add(5, 6);
		System.out.println(value);
	}
}

public class Example {

	public static void main(String[] args) {
		
		samp sam=new samp();
		sam.run(( a, b)-> a+b);
		

	}

}
