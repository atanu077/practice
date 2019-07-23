package com.rpg.thread;

public class Lab581 {

	public static void main(String[] args) {
		Hello h1=new Hello();
		Hello h2=new Hello();
		MyThread th1=new MyThread(h1);
		MyThread th2=new MyThread(h2);
		
		th1.start();
		th2.start();
		
	}

}
class MyThread extends Thread{
	Hello h1=null;
	public MyThread(Hello h1) {
		this.h1 = h1;
	}
	public void run(){
		h1.show();
	}
	
}
class Hello{
	synchronized void show(){
		Thread th=Thread.currentThread();
				for(int i=0;i<10;i++)
				{
					System.out.println(th.getName()+"\t"+"show()"+"\t"+i+"\t"+this);
					try{
						Thread.sleep(1000);
						
					}
					catch(Exception e){
						e.printStackTrace();
						
					}
					
				}
	}
	
}