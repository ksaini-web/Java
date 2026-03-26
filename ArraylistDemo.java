package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ArraylistDemo {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		
		// make the new arraylist and remove duplicate by the usinfg hashset
		
		
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,2,2,1));
		
		System.out.println("before the change :"+list2);
		
		HashSet<Integer> set =new  HashSet<>(list2);
		
		System.out.println("After remove :"+set);
		
		
		//sort the arraylist 
		
		Collections.sort(list2);
		System.out.println("Sort the element of array list "+list2);
		
	// reverese the arraylist with the help of Collections
		
		Collections.reverse(list2);
		System.out.println("reverse the arraylist with help of collectios "+list2);
	}
}
