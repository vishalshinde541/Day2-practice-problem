package com.bridgelabz.ForLoopProblems;

import java.util.Scanner;

// Find the sum of natural numbers using for loop
public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num1 = scan.nextInt();
		
		for (int i = num1; i >=1 ; i--) {
			
			sum = sum + i;
			
		}
		
		System.out.println("Sum of Natural numbers of "+num1+ " is : " + sum);
		
		
	}
	

}
