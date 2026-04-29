package com.java4;

import java.util.Scanner;

public class PwStrenCheck {
	static void checker(String pw) {
		boolean checker=false;
		int lower=0,upper=0,digit=0,specChar=0;
		for(int i=0;i<pw.length();i++) {
			char ch=pw.charAt(i);
			if(ch>='0'&& ch<='9') {
				digit++;
			}else if(ch>='A'&& ch<='Z') {
				upper++;
			}else if(ch>='a'&& ch<='z') {
				lower++;
			}else {
				specChar++;
			}
		}
		if(lower>=1&& upper>=1 && specChar>=1&&digit>=1) {
			checker=true;
			
		}
		if (checker) {
			System.out.println("Success");
		}else {
			System.out.println("Not full filling the criteria");
		}
			
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pw");
		String pw=sc.next();
		checker(pw);
		
	}
}
