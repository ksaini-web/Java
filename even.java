package Ducatjava;

class even extends Thread{
	
	int n ;
	
	even(int b){
		n=b;
	}
			
	
	 public void run() {
		 
		 for(int i = 0 ; i<=n;i+=2) {
			 
			
				 System.out.println("Even" +i);
			 
	 }}}
	
		 class odd implements Runnable{
			 int n;
			 
			 
			 odd(int a){
				 
				n =a;
				 
			 }
			 
			 public void run() {
				 
				 for(int i = 1;i<=n;i+=2) {
					 
					
						 System.out.println("odd:" + i);
					 
				 }
			 }
				 
		 
}

public class Evenodd {
	
	public static void main(String[] args) {
		
		even e1 = new even(10);
		
		e1.start();
		
		odd obj = new odd(10);
		
		Thread o1 = new Thread(obj);
		
		o1.start();
		
		
		
		
	}
}


