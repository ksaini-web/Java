package Ducatjava;

import java.util.concurrent.locks.ReentrantLock;

public class ThreeThread {
	
	int number =1;
	
	ReentrantLock lock = new ReentrantLock();
	
	
	void firstthree() {
		
		
		
		while(number==1) {
			lock.lock(); 
			try {
				char ch='A';
				for(int i= 1;i<=3;i++) {
					
					System.out.println(ch++);
					
					
					
				}
				number=2;
				
			}finally {
				
				lock.unlock();
				
			}
		}
		
		
	}
	
	void secondthree() {
		
		
		
		while(number==2) {
			lock.lock();
			
			try {
				char ch='A';
				for(int i= 1;i<=3;i++) {
					
					System.out.println(ch++);
					
					
					
					
				}
				number =2;
				
			}finally {
				
				lock.unlock();
				
			}
		}
		
		
	}
	
	void thirdthree() {
		
		lock.lock();
		
		while(number==3) {
			
			try {
				char ch='A';
				for(int i= 1;i<=3;i++) {
					
					System.out.println(ch++);
					
					
					
				}
				number=3;
				
			}finally {
				
				lock.unlock();
				
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		ThreeThread obj = new ThreeThread();
		
		Thread t1 = new Thread(()->obj.firstthree());
		Thread t2 = new Thread(()->obj.secondthree());
		Thread t3 = new Thread(()->obj.thirdthree());
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	

}
