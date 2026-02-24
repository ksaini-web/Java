package java06pm;

public class Warrerclass {
	
	public static void main(String[] args) {
		int i = 10;//primitive dataType
		Integer i1 = i;//Auto Boxing
		
		
		
		System.out.println(i+" "+i1);
		
		
		Integer i2  = Integer.valueOf(i);
		
		System.out.println(i2);
		
		
		Integer i3 = Integer.valueOf(20);
		
		System.out.println(i3);
		
		int i4 = i3; //unboxing
		
		int i5 = Integer.valueOf(i4);
		
		System.out.println(i5);

	}

}
