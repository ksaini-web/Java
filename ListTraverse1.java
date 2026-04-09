package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTraverse1 {
	
	public static void main(String[]args) {
		
		List<String> liststr =  new ArrayList<>();
		
		liststr.add("ram");
		liststr.add("RAM");
		liststr.add("SHAYAM");
		liststr.add("JOHN");
		
		//simple . loop
		for(int i=0;i<liststr.size();i++) {
			System.out.println("first method "+liststr.get(i));
			
		}
		System.out.println();
		//for each
		
		for(String str : liststr) {
			
			System.out.println("second method"+str);
		}
		
		// using iterator
		System.out.println();
		Iterator<String> itr = liststr.iterator();
		
		while(itr.hasNext()) {
			String Element = itr.next();
			
			System.out.println("Thrid method :"+Element);
			
		}
		
		System.out.println();
		//ListIteratorit only in(ArrayList , LInklist,vector) help travers forwards or backwords  ;
		ListIterator<String> ListIterator = liststr.listIterator();
		
		while(ListIterator.hasNext()) {
			
			String next = ListIterator.next();
			
			System.out.println(" "+next);
		}
		
		System.out.println();
		
		
		ListIterator<String> listIterator2 = liststr.listIterator(liststr.size());
		
		while(listIterator2.hasPrevious()) {
			String previous =listIterator2.previous();
			System.out.println(" "+previous);
		}
		
		System.out.println();
		
		
		liststr.forEach((Element)->{
			System.out.println(Element);
		});
		
		
		
		
		
		
		
		
		
	}

}
