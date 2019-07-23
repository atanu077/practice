package com.logical;

import java.util.Scanner;

public class OnewordReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		char[] arr1=s.toCharArray();
		char[] arr2=new char[arr1.length];
		for(int i=arr1.length-1;i>=0;i--){
			arr2[arr2.length-1-i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++){
			System.out.print(arr2[j]);
		}
	}

}
