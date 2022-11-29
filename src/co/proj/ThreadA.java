package co.proj;

public class ThreadA extends Thread {
	
	
	public void run() {
		
		
		System.out.println("thread1");
	}
	
	public static void main(String[] args) {
			
		ThreadA t=new ThreadA();
		
		
		t.start();
		
			
	}
	
}
