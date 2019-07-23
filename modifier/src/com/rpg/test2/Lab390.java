package com.rpg.test2;

public class Lab390 {
	public static void main(String[] args) {
		B04 b=new  B04();
		b.m1();
		
	}

}
class A04{
	static void m1(){
		System.out.println("A04------------m1()");
	}
}
class B04 extends A04{
	static void m1(){
		System.out.println("B04------------m1()");
		//super.m1();
	}
}
