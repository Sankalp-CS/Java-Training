package com.java4;
public class ATM {
    public static void main(String[] args) {

        int balance = 5000;
        int withdraw = 4500;

        if (withdraw > balance) {
            System.out.println("Transaction Failed: Insufficient Balance");
        } else if (balance - withdraw < 1000) {
            System.out.println("Transaction Failed: Minimum balance violation");
        } else {
            System.out.println("Transaction Successful");
        }
    }
}