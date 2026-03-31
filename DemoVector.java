package Ducatjava;

import java.util.Vector;

public class DemoVector { 
	
	public static void main(String[]args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("java");
		v.add("c++");
		v.add("Spring");
		v.add("DSa");
		
		System.out.println
		(v);
		
		System.out.println(v.get(3));
		
		v.remove(3);
		
		System.out.println
		(v);
		
		
		System.out.println(v.contains("DSa"));
		
		System.out.println(v.contains("c++"));
		
		
	
	}

}
