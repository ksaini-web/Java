

class Mythread implements  Runnable {
	
public void run() {
	
	try{for(int i=0;i<=5;i++) {
		
		System.out.print(i);
		Thread.sleep(14000);
	}}
	catch(Exception e) {
		System.out.println(e);
	}
}
	
	
}

public class Sleepthread {

	
	public static void main(String[] args) {
	
	
	Mythread my = new  Mythread();
	
	Thread t1 = new  Thread(my);
	
	t1.start();}
	
}
