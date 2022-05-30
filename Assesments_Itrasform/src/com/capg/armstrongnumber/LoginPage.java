package com.capg.armstrongnumber;

import java.util.Scanner;

public class LoginPage 
{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String sp=" ";
	        System.out.println("Enter the Username EX:(Sunil (4 character must be enter ))");
	        String username = sc.nextLine();
	        if((username.contains(sp)) || username.length()<4){
	            System.out.println("Invalid Username");
	            return;
	        }

	        System.out.println("Enter the Password EX:(7259493361 (8 character must be enter))");
	        String userpass = sc.nextLine();
	        if((userpass.contains(sp)) || userpass.length()<8){
	            System.out.println("Invalid Password");
	            return;
	        }

	        System.out.println(username+" you are Registered Successfully...");

	        System.out.println("Enter the Username");
	        String lname = sc.nextLine();
	        System.out.println("Enter the Password");
	        String lpass = sc.nextLine();

	        if(username.equals(lname) && userpass.equals(lpass)){
	            System.out.println("Welcome "+lname+" you have Logged_in Successfully...");
	        }
	        else{
	            System.out.println("Username or password MissMatch");
	        }
	    }
	}


