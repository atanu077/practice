package com.logical;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int l=Integer.toString(a).length();
		int[] a1=new int[l];
		int[] a2=new int[l];
		for(int i=a1.length-1;i>=0;i--){
			a2[a2.length-1-i]=a1[i];
		}
		for(int j=0;j>=a2.length;j++){
			System.out.println(a2[j]);
		}
		
	}

}
