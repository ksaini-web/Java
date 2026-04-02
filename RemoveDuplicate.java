package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,22,22,33,33);
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
		
		
	}
}
