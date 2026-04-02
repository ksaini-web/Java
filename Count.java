
package collection;

import java.util.HashMap;

public class Count {
	public static void main(String[] args) {

	int [] arr = {1,2,3,4,5,1,2};
	
	HashMap<Integer,Integer> map = new HashMap<>();
	
	for(int num : arr){
		map.put(num,map.getOrDefault(num,0)+1);
	}
	System.out.print(map);
	}
}
