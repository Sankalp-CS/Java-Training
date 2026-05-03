package com.java4;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no. of units");
		int units=sc.nextInt();
		double bill=50;
		
		if(units<=100 && units>=0) {
			bill+=units*1.5;
		}
		else if(units<=200 && units>=101) {
			bill+=100*1.5 +(units-100)*3.5;
		}else {
			bill+=100*1.5 + 100*3.5 +(units-200)*5;
		}
		if(bill>2000) {
//			double x=bill*1.1;
			bill*=1.1;
		}
		System.out.println("Total bill :"+bill);
		sc.close();
	}
}
