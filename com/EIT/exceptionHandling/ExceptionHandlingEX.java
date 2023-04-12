package com.EIT.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingEX {

	public static void main(String[] args) {
		
		File file =new File("text.txt");
		
		try {
			FileReader fr =new FileReader(file);
		} catch (FileNotFoundException e) {
			 	
			System.out.println("File is not found  " + file.toString());
		}
		
		System.out.println("finished");
		
	}

}
