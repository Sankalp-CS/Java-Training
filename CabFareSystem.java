package com.java4;

import java.util.Scanner;

public class CabFareSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total km:");
		int x=sc.nextInt();
		int fare=0;
		boolean isNight=true;
		
		if(x<=5) {
			fare=x*50;
		}else if(x<=10) {
			fare=5*50 + (x-5)*40;		
		}else {
			fare=5*50 + 5*40 +(x-10)*30;
		}
		
		if(isNight) {
			fare+=fare*	0.20;
		}
		System.out.println("fare:"+fare);
	}
}
