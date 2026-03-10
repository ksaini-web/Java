package Ducatjava;



public class PrintBythread {
	
	int state = 0;
	
	synchronized void printnumber(int num) throws Exception {
		
		while(state!=0) {
			wait();
		}
		
		System.out.print(num);
		
		state = 1;
		notifyAll();
	}
	
	
	synchronized void printCamalcase(char ch) throws Exception {
		
		while(state!=1) {
			wait();
		}
		
		
		
		System.out.print(ch);
		
		state = 0;
		notifyAll();
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		PrintBythread p = new PrintBythread();
		
		Thread t1 = new Thread(()->{
			
			try {
				for(int i = 1 ; i<=4 ; i++) {
					
					p.printnumber(i);
					
				}
				
			}
			catch(Exception e){
				   e.printStackTrace();
			}
		});
		
		Thread t2 = new  Thread(()->{
			
			try {
				for(char ch = 'A' ; ch <='D' ; ch++ ) {
					p.printCamalcase(ch);
				}
			}
			catch(Exception e){
				   e.printStackTrace();
			}
		}) ;
		
		
		t1.start();
		t2.start();
		
	}
	
	

}
