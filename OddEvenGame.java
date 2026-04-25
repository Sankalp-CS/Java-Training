package com.java4;

import java.util.Scanner;

public class OddEvenGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int even=0,odd=0;
		while(true) {
			int num=sc.nextInt();
			if(num==0) {
				break;
			}
			
			if(num%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		
		System.out.println("Even:"+even+" Odd:"+odd);
	}
}
