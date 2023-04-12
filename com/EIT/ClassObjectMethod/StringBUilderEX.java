package com.EIT.ClassObjectMethod;

public class StringBUilderEX {

	public static void main(String[] args) {
	 StringBuilder sb =new StringBuilder("");
	 
	 sb.append("my name is ");
	 sb.append(" ");
	 sb.append("ibrahim");
	 
	 System.out.println(sb.toString());
	 
	 StringBuilder s =new StringBuilder("");
	 
	 s.append("my name is")
	 .append(" ")
	 .append("venkat");
	 
	 System.out.println(s.toString());

	}

}
