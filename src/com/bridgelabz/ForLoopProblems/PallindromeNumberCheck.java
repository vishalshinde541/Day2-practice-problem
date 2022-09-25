package com.bridgelabz.ForLoopProblems;

// find thst given number is pallindrome or not
public class PallindromeNumberCheck {
	
	public static void main(String[] args) 
	{
		
		String org = "madam";
		String rev = "";
		
		for (int i = org.length()-1; i >= 0 ; i--) 
		{
			rev = rev + org.charAt(i);
			
		}
		
		System.out.println("Original String :"+ org);
		System.out.println("Reverse String :"+ rev);
		
		if (rev.equals(org)) 
		{
			System.out.println("given String pallindrome");
			
		}
		else 
		{
			System.out.println("given String is not pallindrome");
			
		}
		
		
		
		
		
	}


}
