package com.bridgelabz.OpratorProblems;

import java.util.Arrays;

public class Ex1_ArithmeticOperationsToFindMaxAndMin {
	public static void main(String[] args) {

		int a = 5;
		int b = 7;
		int c = 6;

		double eq1 = a + b * c;
		double eq2 = c + a / b;
		double eq3 = a % b + c;
		double eq4 = a * b + c;

		double ar[] = { eq1, eq2, eq3, eq4 };

		Arrays.sort(ar);
        
		System.out.println("Minimum value = " + ar[0]);
		System.out.println("Maximum value = " + ar[ar.length-1]);

	}

}
