package Ducatjava;

class word extends Thread{
	
	public void run() {
		
		for(char ch ='A' ; ch<='E';ch++) {
			
			System.out.println("Words A to E : "+ch);
		}
	}
	
}


class number implements Runnable{
	
	public void run() {
		for(int i = 1 ;i<=5;i++) {
			System.out.println("Number's 1 to 5 :"+i);
		}
	}
	
}

public class Notinorder {
	
	public static void main(String[] args) {
	word w = new word();
	
	w.start();
	
	number n  = new number();
	
	Thread t = new Thread(n);
	
	
	t.start();
	
	}
			

}
