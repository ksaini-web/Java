package java06pm;

public class Methodouter {
	
	private int x = 20;
	
	void show() {

		
		class LocaInner{
			
			void display() {
				
				System.out.println(x);
			}
		}
		
		LocaInner l1 = new LocaInner();
		
		l1.display();
	}
	  
	public static void main(String[] args) {
		
		Methodouter mo =new  Methodouter();
		mo.show();
	}
	
	

}
