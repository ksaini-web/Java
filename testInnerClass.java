package java06pm;

public class testInnerClass {
	
	//memeber inner class
	
	private int x = 100;
	
	class Inner{
		
		void show() {
			
			System.out.println("value of "+x);
		}
	}
	
	public static void main(String[] args) {
		
		testInnerClass outerclass = new  testInnerClass();
		
		testInnerClass.Inner oi = outerclass.new Inner();
		oi.show();
		
		
		// in single line 
		
		testInnerClass.Inner singleline = new testInnerClass().new Inner();
		singleline.show();
		
		
		
		
		
	}

}
