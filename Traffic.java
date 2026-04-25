package com.java4;

import java.util.Scanner;

public class Traffic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the speed");
		int speed=sc.nextInt();
		int fine=0;
		if(speed>100) {
			fine+=1000;
		}else if(speed>80) {
			fine+=500;
		}
		//System.out.println(fine);
		System.out.println("repeated(yes/no)");
		String repeated=sc.next();
		
		if(repeated.equalsIgnoreCase("yes")) {
			fine=fine*2;
			System.out.println(fine);
		}else {
			System.out.println(fine);
		}
	}
}
