package FileoutputnputIO;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	String name = "kartik" ;
	String age = "21" ;
	
	Employee(String name , String age){
		
		this.name = name;
		this.age = age;
		
	}

}

public class Saveobject {
	
	
	public static void main(String[]args) {
	
	try {
	
	Employee emp = new Employee("kartik","21");
	
	FileOutputStream fos = new FileOutputStream("emp.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	oos.writeObject(emp);
	
	oos.close();
	fos.close();
	
	System.out.println("Object Saved");
	
	
	BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
	
	String Line ;
	
	while((Line = br.readLine())!=null) {
		
		System.out.println(Line);
	}
	
	br.close();
	
	
	
	
	}
	catch(Exception e){
		
	e.printStackTrace();
		
	}
	
	}
	
	

}
