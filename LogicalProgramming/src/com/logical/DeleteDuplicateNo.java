package com.logical;

import java.util.Scanner;

public class DeleteDuplicateNo {

	public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 int n=sc.nextInt();
 int[] a=new int[n];
 for(int i=0;i<n;i++){
	 a[i]=sc.nextInt();
	 
 }
 for(int i=0;i<n;i++){
	 for(int j=i+1;j<n;j++){
		 i++;
		 j=i+1;
	 }
	 System.out.print(a[i]);
 }

	}

}

