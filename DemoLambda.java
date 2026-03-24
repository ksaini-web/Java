package lambda;

public class DemoLambda {
	
	public static void main(String[] args) {
		
		Demo d = ()->System.out.print("hello Lambda");
		
		d.show();
	}

}
