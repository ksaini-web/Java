package Generic;

class Box<T>{
	
	private T content;

	public  void set(T content) {
		this.content = content;
	}
	
	public T get () {
		
		return content;
	}
	
	public boolean isEmpty() {
		
		return content == null;
	}
}

public class Testgeneric {
	
	public static void main(String[] args) {
	
	Box<String>stringBox = new Box<String>();
	
	
	stringBox.set("Hello Generics");
	
	String Message = stringBox.get();
	
	Box<Integer> integerBox = new Box<Integer>();
	integerBox.set(100);
	
	int number = integerBox.get();
	
	
	System.out.println("String Box : "+Message);
	
	System.out.println("Number Box : "+number);
	
	}
	
	
	
	
	
	

}
