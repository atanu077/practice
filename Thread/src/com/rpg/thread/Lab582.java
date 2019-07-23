package com.rpg.thread;

public class Lab582 {

	public static void main(String[] args) {
		Hello1 h1=new Hello1();
		Hello1 h2=new Hello1();
		MyThread01 th1=new MyThread01(h1);
		MyThread01 th2=new MyThread01(h2);
		th1.start();
		th2.start();

	}

}
class Hello1{
void show(){
	Thread th=Thread.currentThread();
	synchronized (this) {
		for(int i=0;i<5;i++){
			System.out.println(th.getName()+"show"+"\t"+this);
		}
		try{
			th.sleep(500);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
}
class MyThread01 extends Thread{
	Hello1 h=null;
	public MyThread01(Hello1 h) {
		this.h=h;
	}
	public void run(){
		h.show();
		
	}
}
