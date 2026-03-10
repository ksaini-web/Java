package Ducatjava;

class Box{
	
	int item;
	
	boolean full = false;
	
	synchronized void put(int value) throws Exception{
		
		while(full) {
			
			wait();
		}
		
		item = value;
		
		System.out.println("Produced :" + item);
		
		full = true;
		
		notifyAll();
	}


synchronized void get() throws Exception {
	
	
	while(!full) {
		
		wait();
	}
	
	
	
	System.out.println("Consumed:"+ item);
	
	full =false;
	
	notifyAll();
	
	
}
}

public class Threadq {
	
	public static void main(String[] args) {
		
		Box box = new Box();
		
		
		Thread t1 = new  Thread(()->{
			
			try {
				for(int i = 1 ;i<=5 ;i++) {
					
					box.put(i);
				}
			}
			catch(Exception e) {
				
				
			}
		});
		
	Thread t2 = new  Thread(()->{
			
			try {
				for(int i = 1 ;i<=5 ;i++) {
					
					box.get();
				}
			}
			catch(Exception e) {
				
				
			}
		});
	
	t1.start();
	t2.start();
		
	}

}
package Ducatjava;

class Box{
	
	int item;
	
	boolean full = false;
	
	synchronized void put(int value) throws Exception{
		
		while(full) {
			
			wait();
		}
		
		item = value;
		
		System.out.println("Produced :" + item);
		
		full = true;
		
		notifyAll();
	}


synchronized void get() throws Exception {
	
	
	while(!full) {
		
		wait();
	}
	
	
	
	System.out.println("Consumed:"+ item);
	
	full =false;
	
	notifyAll();
	
	
}
}

public class Threadq {
	
	public static void main(String[] args) {
		
		Box box = new Box();
		
		
		Thread t1 = new  Thread(()->{
			
			try {
				for(int i = 1 ;i<=5 ;i++) {
					
					box.put(i);
				}
			}
			catch(Exception e) {
				
				
			}
		});
		
	Thread t2 = new  Thread(()->{
			
			try {
				for(int i = 1 ;i<=5 ;i++) {
					
					box.get();
				}
			}
			catch(Exception e) {
				
				
			}
		});
	
	t1.start();
	t2.start();
		
	}

}
