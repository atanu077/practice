package com.logical;

public class Bridgei {

	public static void main(String[] args) {

		//ab@nb!c
		//cb@nb!a
		
		String s="ab@nb!c";//cb@nb!a
		String msg="";
		String a1="";
		String a2="";
		char[] c=s.toCharArray();
		int j=s.indexOf("@");
		int k=s.indexOf("!");
		System.out.println(j);
		//System.out.println(s.indexOf("!"));
		
		for(int i=c.length-1;i>=0;i--){
			if(i==j ){
				System.out.println(j);
				//System.out.println(k);
				
			}
			else if(c[i]==s.indexOf("!")){
					a2="!";
			}
			else
			msg=msg+s.charAt(i)+a1+a2;
			//System.out.println(msg);
		}
		System.out.println(msg);
		}
		
	}


