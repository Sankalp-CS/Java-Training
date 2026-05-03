package com.java4;

import java.util.Scanner;

public class StudentResultAnalyzer {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int[] marks=new int[5];
			int sum=0,avg=0;
			System.out.println("Enter the marks:");
			for (int i = 0; i < 5; i++) {
				 marks[i]=sc.nextInt();
				 if(marks[i]<33) {
						System.out.println("Fail");
						return ;
					}
				 sum+=marks[i];
				 
			}
			 avg=sum/5;
			if(avg>=75) {
				System.out.println("Distinction");
			}else if(avg>=65 && avg<=75) {
				System.out.println("First Class");
			}else if(avg>=50 && avg<=65) {
				System.out.println("Second Class");
			}else {
				System.out.println("Pass");
			}
		}
}
