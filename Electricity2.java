package com.java4;

import java.util.Scanner;

public class Electricity2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no. of units");
		int units=sc.nextInt();
		double surch=0;
		double bill=0;
		
		if(units<=100 && units>=0) {
			bill+=units*5;
		}
		else if(units<=200 && units>=101) {
			bill+=units*7;
		}else {
			bill+=units*10;
		}
		if(bill>2000) {
		    surch=bill/10;
			bill+=surch;
		}
		System.out.println("Surcharge :"+surch);
		System.out.println("Total bill :"+bill);
		sc.close();
	}
}
