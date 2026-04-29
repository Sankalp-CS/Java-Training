package com.java4;

public class CallByValue {
	static void add(int a,double b,String msg) {
		
		a=39;
		b=.9;
		double c=a+b;
		msg="hello..";
//		System.out.println("c:"+c);
		System.out.println("Msg:"+msg);
	}
	public static void main(String[] args) {
		int a=10;
		double b=20.0;
		String msg=new String("hi");
		add(a,b,msg);
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+msg);
	}
}
