package com.bridgelabz.SwitchStaementProblems;

import java.util.Scanner;

public class PrintMonthNameForGivenNumber {
	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = ref.nextInt();
		
		switch (num) {
		case 1 :
			System.out.println("January");
			break;
		case 2 :
			System.out.println("February");
			break;
		case 3 :
			System.out.println("March");
			break;
		case 4 :
			System.out.println("April");
			break;
		case 5 :
			System.out.println("May");
			break;
		case 6 :
			System.out.println("Jun");
			break;
		case 7 :
			System.out.println("July");
			break;
		case 8 :
			System.out.println("August");
			break;
		case 9 :
			System.out.println("Saptember");
			break;
		case 10 :
			System.out.println("October");
			break;
		case 11 :
			System.out.println("November");
			break;
		case 12 :
			System.out.println("December");
			break;

		default:
			System.out.println("Invalid input");
			break;
		}

	}
}
