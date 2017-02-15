package gr.haec.hello;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HelloWorld {
	
	public static void main (String[]args){
		
		System.out.println("Hello World"); 
	try{
		File f= new File  ("c:\tmp.txt");
			FileReader fr = new FileReader (f);
	} catch (FileNotFoundException e){
		e.printStackTrace();
	}
			
			int[] pinakas = {1,2,3};
		try {	System.out.println(pinakas[10]);
		}
		catch (java.lang.ArrayIndexOutOfBoundsException e){
		System.err.println("lathos theseis"); 	
		}
		finally { 
}
	}
}

