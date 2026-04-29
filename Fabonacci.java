package com.java4;

public class Fabonacci {
	static void fabonacci(int n) {
		int a=0,b=1;
		for(int i=0;i<n;i++) {
			System.out.println(a+"");
			int c=a+b;
			a=b;
			b=c;
		}
		
		
	}
	public static void main(String []agrs) {
		fabonacci(10);
	}

}
