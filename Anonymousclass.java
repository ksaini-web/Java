package java06pm;

abstract class DEmo{
	
	abstract void show() ;
}

public class Anonymousclass {
	
  public static void main(String[] args) {
	  
	  DEmo d = new DEmo() {
		  void show() {
			  System.out.println("Hello Abstract class demo");
		  }
	  };
	  
	  d.show();
	  
  }

}
