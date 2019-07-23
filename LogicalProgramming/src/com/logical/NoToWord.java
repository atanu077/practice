package com.logical;

import java.util.Scanner;

public class NoToWord {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		String msg=" ";
		while(i!=0){
			int rem=i%10;
		
		switch(rem){
			case 0: msg="zero"+msg;
			break;
			case 1: msg="One"+msg;
			break;
			case 2: msg="two"+msg;
			break;
			case 3: msg="three"+msg;
			break;
			case 4: msg="four"+msg;
			break;
			case 5: msg="five"+msg;
			break;
			case 6: msg="six"+msg;
			break;
			case 7: msg="seven"+msg;
			break;
			case 8: msg="eight"+msg;
			break;
			case 9: msg="nine"+msg;
			
			break;
		}
		i=i/10;
		}
		System.out.println(msg);
	}

}
