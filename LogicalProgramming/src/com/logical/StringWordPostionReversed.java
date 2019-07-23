package com.logical;

import java.util.Scanner;

public class StringWordPostionReversed {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length()==0){
			System.out.println("no input");
			
		}
		else{
			String[] s1=s.split("\t");
			for(int i=0;i<=s1.length;i++)
			System.out.println(s1[i]);
			
		}
	}

}
