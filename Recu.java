package com.java4;

public class Recu {
		static void recur(int a) {
			if(a>10)
				return;
			a++;
			recur(a);
			System.out.println(a);
			
		}
		public static void main(String args[]) {
			recur(1);
		}
}
