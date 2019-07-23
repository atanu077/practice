package com.rpg.test2;

public class Lab372 {
	public static void main(String[] args) {
		A a1=new A(80);
		System.out.println(a1.getI());
		a1.setI(90);
		System.out.println(a1.getI());
		
	}

}
class A{
	private int i;
	A(int i){
		this.i=i;
	}
	public void setI(int i){
		this.i=i;
	}
	public int getI(){
		return this.i;
	}
	
}
