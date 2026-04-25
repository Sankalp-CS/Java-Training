package com.java4;

import java.util.Scanner;

public class loginAttempt {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int maxAttempt=0;
			String pw="sankalp30";
			boolean success=false;
			
			while(maxAttempt<3) {
				System.out.println("Enter the password");
				String input=sc.next();
				
				if(input.equals(pw)) {
					System.out.println("Login Successfull");
					success=true;
					break;
				}else {
					maxAttempt++;
					System.out.println("Wrong password");
				}
			}
			if(!success) {
				System.out.println("Account locked");
			}
			sc.close();
		}
}
