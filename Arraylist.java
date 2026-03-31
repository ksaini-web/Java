package Ducatjava;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	
public static void main(String[]args) {
	
	List<String> list_Strings = new ArrayList<String>();
	
	list_Strings.add("red");
	list_Strings.add("orange");
	list_Strings.add("green");
	list_Strings.add("yellow");
	
	System.out.print(list_Strings);
	
	//Iterate in ArrayList
	
	for(String element : list_Strings) {
		
		System.out.println(element);
	}
	
	
	list_Strings.add(0,"pink");
	

	System.out.println(list_Strings);
	
	list_Strings.set(2, "light green");
	
	System.out.println(list_Strings);
	
	
	
	
	
}

}
