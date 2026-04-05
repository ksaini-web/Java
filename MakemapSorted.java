package collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class MakemapSorted {

	public static  void main(String[] args) {
		
		HashMap<Integer,Integer>map = new HashMap<>();
		map.put(1,50);
		map.put(2,40);
		map.put(3,30);
		map.put(4,20);
		
		
		
	    List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
	    
     list.sort((a,b) -> a.getValue() - b.getValue());
	    
	    for(Map.Entry<Integer,Integer> entry : list) {
	    	
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    	
	    	
	    }
	    }
}
