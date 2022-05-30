package com.capg.armstrongnumber;

import java.util.Scanner;

public class StudentsAverageMarks 
{
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();
        
        String name[] = new String[n];
        int totalmarks[] = new int[n];
        int grandTotal = 0;
        
        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.print("Enter name of Subjects Name" + (i+1) + ": ");
            name[i] = in.nextLine();
            System.out.print("Enter The total marks " + (i+1) + ": ");
            totalmarks[i] = in.nextInt();
            grandTotal += totalmarks[i];
        }
        
        double avg = grandTotal / (double)n;
        System.out.println("Average = " + avg);
        
        
    }

}
