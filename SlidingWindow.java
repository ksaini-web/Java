package collection;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
	
	public static void main(String[] args) {
	
	int arr[] = {1,3,-1,-3,5,3,6,7};
	
	int k =3 ;
	
	Deque<Integer> dp = new LinkedList<>();
	
	for(int i = 0 ;i<arr.length ; i++) {
		
		if(!dp.isEmpty() && dp.peek() == i-k) {
			
			dp.poll();
		}
		
		while(!dp.isEmpty() && arr[dp.peekLast()] < arr[i]) {
			
			dp.pollLast();
		}
		
		dp.add(i);
		
		if(i>=k) {
			
			System.out.println(arr[dp.peek()]+"");
		}
	}
	
	
	
	
	}
}
