	

public class  Average {
	
	public static <T extends Number> double average(T[] arr) {
		
		if(arr == null || arr.length == 0) {
			
			return 0;
		}
		
		double sum = 0;
		
		for( T num : arr ) {
			sum+= num.doubleValue();
		}
		
		return sum / arr.length;
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Average (INteger) : "+average(intArr));
		
		Double[] doubleArr = {1.2,2.6,3.5};
		
		System.out.println("Average (Double): " + average(doubleArr));
	}

}
