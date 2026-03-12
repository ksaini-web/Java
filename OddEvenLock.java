package Ducatjava;

import java.util.concurrent.locks.ReentrantLock;

public class OddEvenLock {
	
	int number =1;
	
	ReentrantLock lock = new ReentrantLock();
	
	
	void printoddnumber() {
		
		while(number<=10) {
			
			lock.lock();
			
			try {
				
				if(number%2 != 0) {
					
					System.out.println("Odd number :"+number);
					number++;
				}
			     
			}finally {
		    	 
		    	 lock.unlock();
		     }
			
			
			
		}
	}
	
	void printevennumber() {
		
		while(number <= 10) {
			
			lock.lock();
			
			try {
				if(number % 2 == 0) {
					System.out.println("Even number :"+number);
					number++;
				}
			}
			finally {
				lock.unlock();
			}
			
		}
	}

	public static void main(String[] args) {
		
		OddEvenLock oel = new OddEvenLock();
		
		
		Thread t1 = new Thread(() ->{
			
			oel.printoddnumber();
		});
		
	Thread t2 = new Thread(() ->{
			
			oel.printevennumber();
		});
		
	
	t1.start();
	t2.start();
		
		
	}
}
