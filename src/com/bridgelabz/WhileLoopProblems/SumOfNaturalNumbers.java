package com.bridgelabz.WhileLoopProblems;

import java.util.Scanner;

// sum of natural numbers using while loop

public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		//take number as input from user
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		
		//use while loop for calculating the sum of natural number
		int i = 1;
		while (i <= num1) {
			
			sum = sum + i;
			
			i++;
		}
		
		//print the value of sum in console tab
		System.out.println("Sum of Natural numbers of "+num1+ " is : " + sum);
	}

}
