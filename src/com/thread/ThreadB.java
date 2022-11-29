package com.thread;

public class ThreadB implements Runnable{

	@Override
	public void run() {
	System.out.println("thread is runing");
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		ThreadB t=new ThreadB();
		
		Thread t1=new Thread(t);
		t1.start();
	}

	
	
	
}
