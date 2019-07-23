package com.rpg.test2;

public class Lab377 {

	public static void main(String[] args) {
		Hai2 h=new Hai2();
		h.m1();

	}

}
class Hello2{
	Q m1(){
		System.out.println("Q-------m1()");
		return new Q();
	}
}
class Hai2 extends Hello2{
	J1 m1(){
		System.out.println("J-----------m1()");
		return new J1();
	}
}
class Q{
	
}
class J1 extends Q{
	
}
