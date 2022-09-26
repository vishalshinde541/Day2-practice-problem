package com.bridgelabz.SwitchStaementProblems;

import java.util.Scanner;

// Program to Check Vowel or Consonant
public class CheckVowelOrConsonant {
	
	public static void main(String[] args) {
		
		char ch = 'a';
		
		switch (ch) {
		case 'a':
			System.out.println(ch + " is a vowel");
			break;
		case 'e':
			System.out.println(ch + " is a vowel");
			break;
		case 'i':
			System.out.println(ch + " is a vowel");
			break;
		case 'o':
			System.out.println(ch + " is a vowel");
			break;
		case 'u':
			System.out.println(ch + " is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonent");
			break;
		}
		
		
//		Scanner ref = new Scanner(System.in);
//		System.out.println("Enter the character : ");
//		char ch = ref.next().charAt(0);
//		
//		switch (ch) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println(ch + " is a vowel");
//			break;
//
//		default:
//			System.out.println(ch + " is a consonent");
//			break;
//		}
		
	}

}
