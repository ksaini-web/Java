package Ducatjava;

public class OddEven1 {
	
	static int number = 1;
	
	int max = 10 ;
	
	synchronized void printodd() {
		
		while(number<=max) {
			
			if(number%2==0) {
				
				try {
					wait();
				}
				catch(Exception e) {
				System.out.print(e);
				}
				
				
			}
			else {
				
				System.out.println("Odd number : "+number);
				number++;
				notifyAll();
			}
		}
	}
	
	
	synchronized void printeven() {
		 
		while(number<=max) {
			if(number%2!=0) {
			try {
				wait();
			}
			catch(Exception e) {
				System.out.print(e);
			}}
			
			else {
				
				System.out.println("Even number :"+number);
				
				number++;
				
				notifyAll();
				
			}
		}
		

	}
	
	public static void main(String[] args) {
		
		OddEven1 OE = new OddEven1();
		
		Thread t1 = new Thread(()->{
			OE.printodd();
		});
		
		Thread t2 = new Thread(()->{
			
			OE.printeven();
		});
		
		t1.start();
		t2.start();
		
		
	}

}
