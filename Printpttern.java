package Ducatjava;
public class Printpttern {
int state = 0 ;

synchronized void printCapital(char ch) throws Exception {
	
	while(state != 0) {
		
		wait();
	}
	
	System.out.print(ch);
	
	state = 1;
	
	notifyAll();
}

synchronized void printNumber(int num)  throws Exception  {
	
	while(state != 1) {
		
		wait();
	}
	
	System.out.print(num);
	
	state = 2;
	
	notifyAll();
	
	
}


synchronized void printsmall(char ch)  throws Exception  {
	
	while(state != 2) {
		wait();
	}
	
	System.out.println(ch);
	
	state = 0;
	
	notifyAll();
}


	
	public static void main(String[] args ) {
		
		Printpttern p =new  Printpttern();
		
		
		Thread t1 = new Thread(()->{
			try {
				for(char ch = 'a'; ch<='d';ch++) {
					
					p.printsmall(ch); 
				}
				}
			
				catch(Exception e){
					
					System.out.print(e);
					
				
			}
		});
		
	   Thread t2 = new Thread(() -> {
		   
		   try {
			   for(int i = 1 ; i<= 4 ; i++) {
				   p.printNumber(i);
				   
			   }}
			   catch(Exception e){
				   
				   System.out.print(e);
				   
			   }
		   
	   });
		
	   Thread t3 =new  Thread(() -> {
		   
		   try {
			   for(char ch='A'; ch<='D' ; ch++) {
				   p.printCapital(ch);  
			   }
		   }
		   
		   catch(Exception e){
			   
			   System.out.print(e);
			   
		   }
	   });
	   
	   t1.start();
	   t2.start();
	   t3.start();
		
		
		
		
	}

}
