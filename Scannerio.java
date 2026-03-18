package FileoutputnputIO;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Scannerio {
	
	public static void main(String[] args) {
	try {
	Scanner sc  = new Scanner(new File("Demo.txt"));
	
	while(sc.hasNextLine()){
		System.out.println(sc.nextLine());
	}
	
	sc.close();
	}
	catch(FileNotFoundException e) {
	  e.printStackTrace();
	}}
}
