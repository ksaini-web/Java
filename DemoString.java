package lambda;

public class DemoString {
	
	public static void main(String[] args) {
		
		String input = "hello word";
		
		
		Demo toupper = s->s.toUpperCase();
		
		System.out.println("TO Upcase : "+toupper.apply(input));
		
		
		Demo toLower = s->s.toLowerCase();
		
		System.out.println("TO lower case :"+toLower.apply(input));
		
		Demo reverse = s->{
			
			StringBuilder sd = new StringBuilder(s);
			
			return sd.reverse().toString();
			
		};
		
		
		
		System.out.print("reverse : "+reverse.apply(input));
		
		
	}

}
