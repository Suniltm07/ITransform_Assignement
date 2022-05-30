package com.capg.exception;

import java.util.Scanner;

public class UserDefinedException {
	  static double currentbalance = 100;

	    public static void main(String[] args) throws MinimumAccountBalance {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter amount to withdrawal");
	        int n = sc.nextInt();
	        try {
	            if (currentbalance < n) {
	                throw new MinimumAccountBalance("Insufficient funds your Current balance is " + currentbalance);
	            } else {
	                System.out.println("Please Take The Money : " + n);
	            }

	        } catch (MinimumAccountBalance mab) {
	            mab.printStackTrace();
	        }
	    }


}
