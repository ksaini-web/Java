package FileoutputnputIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
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

public class SaveAndReadobject {
	
	
	public static void main(String[]args) {
	
	try {
	
	Employee emp = new Employee("kartik","21");
	
	FileOutputStream fos = new FileOutputStream("emp.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	oos.writeObject(emp);
	
	oos.close();
	fos.close();
	
	System.out.println("Object Saved");
	
	
   FileInputStream fis = new FileInputStream("emp.txt");
   
   ObjectInputStream ois = new ObjectInputStream(fis);
   
   Employee e = (Employee)ois.readObject();
   
   System.out.println("Name : "+e.name);
   
   System.out.println("Age : "+e.age);
   
   
   fis.close();
   ois.close();
	
   
   
   
   
   
   
	}
	
	catch(Exception e){
		
	e.printStackTrace();
		
	}
	
	}
	
	

}
