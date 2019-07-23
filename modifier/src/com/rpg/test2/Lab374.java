package com.rpg.test2;

public class Lab374 {
	public static void main(String[] args) {
		B b1=new B();
		b1.show("ami adu");
		b1.show(98);
	}

}
class A111{
	void show(int ab){
		System.out.println("A--show(ab)"+ab);
	}
	
}
class B extends A111{
	void show(String ab){
		System.out.println("B---show(ab-s)"+ab);
	}
	
}
