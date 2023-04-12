package com.EIT.csating;

public class CastingEX {

	public static void main(String[] args) {
		byte bytevalue=20;
		int intvalue=3785;
		short shortvalue=17;
		long longvalue=85;
		
		double doublevalue=37.85;
		float floatvalue=37.17f;
		
		intvalue=(int)doublevalue;
		System.out.println(intvalue);
		
		doublevalue=intvalue;
		System.out.println(doublevalue);

	}

}
