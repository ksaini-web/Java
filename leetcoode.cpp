package AverageDemo;

public class FindMaxDemo {
	
	public static <T extends Comparable<T>> T findMAx(T[] arr) {
		
		if(arr == null || arr.length == 0) {
			
			return null;
		}
		
		
		T max = arr[0];
		
		
		for(int i =0 ; i<arr.length ; i++) {
			
			max = arr[i];
		}
		 return max;
		
		
	}
	
	public static void main(String[] args ) {
		
		
		Integer [] nums = {10,20,30,40,50};
		
		System.out.println("MAx INteger : "+findMAx(nums));
		
		
		String[] nums2 = {"kartik","mayak","alokz"};
		
		System.out.println("MAx String : "+findMAx(nums2));
		
		
		
		
	}

}
