package collection;

import java.util.HashMap;
import java.util.PriorityQueue;

public class KthTopFreq {
	
	public static void main(String[] args) {
		
		//Given the Array
		int arr[] = {1,2,2,1,3,3,3};
		
		//Kth top Freq = 2
	int	k=2;
		
		// make the map fro freq 
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		// ADD all value in map for count the freq or number
		
		for(int i : arr) {
			
			map.put(i, map.getOrDefault(i,0)+1);
			
		}
		
		// make the costam priority Queue for top to freq
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(
				
				(a,b)->map.get(b) - map.get(a)
				);
		
		pq.addAll(map.keySet());
		
		for(int i =0 ; i<k;i++) {
			
			System.out.println(pq.poll());
		}
		
		
	}

}
