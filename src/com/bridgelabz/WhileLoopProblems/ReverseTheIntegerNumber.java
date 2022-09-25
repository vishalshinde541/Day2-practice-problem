package com.bridgelabz.WhileLoopProblems;

public class ReverseTheIntegerNumber {
	
	//Reverse the integer number using while loop
	public static void main(String[] args) {
		
		int orgNum =1234;
		int revNum = 0;
		
		int i = orgNum;
		while (i > 0) {
			int rev = i % 10;
			
			revNum = revNum*10 + rev;
			i = i/10;	
		}
		
		System.out.println("Original number : " + orgNum);
		System.out.println("Reverse number : " + revNum);
			
	}

}
