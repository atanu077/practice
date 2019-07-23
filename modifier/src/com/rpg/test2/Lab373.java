package com.rpg.test2;

public class Lab373 {
	public static void main(String[] args) {
		Hai1 h=new Hai1();
		h.m1();
		h.m2();
		h.m3();
		
	}

}
class Hello1{
	void m1(){
		System.out.println("Hello m1()!");
	}
	void m2(){
		System.out.println("Hello m2()");
	}
}
class Hai1 extends Hello1{
	void m2(){
		System.out.println("Hai.....m2()");
	}
	void m3(){
		System.out.println("Hai.......m3()");
	}
	
}
