package com.rpg.test2;

public class Lab380 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A02 a=new B02();
		a.m2();

	}

}
class A02{
	 void m1(){
		
	}
	 static void m2(){
		 System.out.println("A02-----m2()");
	 }
}
class B02 extends A02{
	final void m1(){
		
	}
static void m2(){
	System.out.println("B02--------------m2()");
	
}
}
