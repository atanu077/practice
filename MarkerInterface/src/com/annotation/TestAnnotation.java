package com.annotation;

import java.lang.annotation.Annotation;

public class TestAnnotation {

	public static void main(String[] args) {
Nokia n=new Nokia("6300", 4);
Class c=n.getClass();
Annotation an=c.getAnnotation(Nokia.class);
smartphone s=(smartphone)an;
	System.out.println(s.name());
	System.out.println(s.version());
	}

}


@smartphone(name="kitkat",version=6)
class Nokia{
	String name;
	int version;
	public Nokia(String modelName, int size) {
		this.name = name;
		this.version = version;
	}
	
}