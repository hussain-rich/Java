package com.EIT.csating;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesReadinfileUsingFilereader {

	public static void main(String[] args) {
		File file =new File("example.txt");
		
		try(BufferedReader br =new BufferedReader(new FileReader(file))){
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("can't find file"+file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to read"+file.toString());
		}

	}

}
