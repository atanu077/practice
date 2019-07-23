package com.rpg.thread;

public class Lab583 {

	public static void main(String[] args) {
		Hello11 h1=new Hello11();
		Hello11 h2=new Hello11();
		MyThread11 th1=new MyThread11(h1);
		MyThread11 th2=new MyThread11(h2);
		
		th1.start();
		th2.start();
		
	}

}
class MyThread11 extends Thread{
	 Hello11 h1=null;
	public MyThread11(Hello11 h1) {
		this.h1 = h1;
	}
	public void run(){
		h1.show();
	}
	
}
class Hello11{
	synchronized static  void show(){
		Thread th=Thread.currentThread();
				
							for(int i=0;i<10;i++)
				{
					System.out.println(th.getName()+"\t"+"show()"+"\t"+i+"\t");
					try{
						Thread.sleep(1000);
						
					}
					catch(Exception e){
						e.printStackTrace();
						
					}
					
				}
	}
	 }

	
