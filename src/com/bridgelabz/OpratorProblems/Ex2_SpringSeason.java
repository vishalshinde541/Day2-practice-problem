package com.bridgelabz.OpratorProblems;

import java.util.Scanner;

public class Ex2_SpringSeason {
	
	public static void main(String[] args) {
		int d;
		int m;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of Month");
		m = sc.nextInt();
		
		System.out.println("Enter the value of Day");
		d = sc.nextInt();
		
		
		if ((m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) 
				|| (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20)) {
			
			System.out.println("True");
		}else {
			System.out.println("Falls");
		}
		
	}

}
