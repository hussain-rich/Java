package com.EIT.csating;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingFile {

	public static void main(String[] args) {
File file =new File("test.txt");
		
		try(BufferedWriter br =new BufferedWriter(new FileWriter(file))){
			br.write("THE FIRST LINE");
			br.write("THE SECOND LINE");
			br.newLine();
			br.write("THE LAST LINE");
			}
			
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to read"+file.toString());
		}

	}

}

