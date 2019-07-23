package com.logical;

public class StringReverse {

	public static void main(String[] args) {
		Reverse("I Love India");
		String r="";

	}
public static void  Reverse(String s){
	String[] words=s.split("");
	String r="";
	for(int i=0;i<words.length;i++){
		String w=words[i];
		String rw=" ";
	
	
	for(int j=w.length()-1;j>=0;j--){
		rw=rw+w.charAt(j);
	}
	r=r+rw+"";
	
}
	System.out.println(s);
	System.out.println(r);
}
}
