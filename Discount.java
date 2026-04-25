package com.java4;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		double amt=sc.nextDouble();
		int disc=0;
	
		if(amt>=5000) {
			disc+=20;
		}else if(amt>=3000) {
			disc+=10;
		}else {
			System.out.println("No discount");
		}
		System.out.println("premium:");
		String pre=sc.next();
		
		if(pre.equalsIgnoreCase("yes")) {
			disc+=5;
		}
		amt=amt-(amt*disc/100);
		System.out.println("Total amt:"+amt);
	}
}
