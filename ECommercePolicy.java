package com.java4;

public class ECommercePolicy {
			public static void main(String[] args) {
				int  days=14;
				boolean isDefective=false;
				boolean isPremium=false;
				
				if(days<=7 || isDefective || (isPremium && days<=15)) {
					System.out.println("Return Accepted");
				}else {
					System.out.println("return Rejected");
				}
			}
}
