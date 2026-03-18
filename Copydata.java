package FileoutputnputIO;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Copydata {

	
public static void main(String[] args) {
	
	try{FileInputStream fis = new FileInputStream("Demo.txt");
	
	 FileOutputStream fos = new FileOutputStream("Copy.txt");
	 
	 
	 int data ;
	 
	 
	 while((data = fis.read())!=-1){
		 
		 fos.write(data);
		 
	 }
	 
	 fis.close();
	 fos.close();
	 
	 
	 BufferedReader br = new BufferedReader(new FileReader("copy.txt"));
	 
	 String Line;
	 
	 while((Line=br.readLine() )!= null) {
		 
		System.out.println(Line);
		 
		 
	 }
	 
	 
	 
	 
	 
	
	}
	catch(IOException e) {
		
		e.printStackTrace();
		
		
	}
	
}
	
}
