package com;
import java.util.Scanner;

public class StringAnalysis {
	public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input=scanner.nextLine();      
		StringBuilder sb=new StringBuilder(input);
		String reversed=sb.reverse().toString();      
		int vowels=0,consonants=0;
		String lowerCaseInput = input.toLowerCase();

		for (int i=0;i<lowerCaseInput.length();i++) {
			char ch=lowerCaseInput.charAt(i);
			if (Character.isLetter(ch)){
				if ("aeiou".indexOf(ch)!=-1) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		boolean isPalindrome = input.equalsIgnoreCase(reversed);
		System.out.println("\nOriginal String: "+input);
		System.out.println("Reversed String: "+reversed);
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of Consonants: "+consonants);
		System.out.println("Is Palindrome: "+isPalindrome);
		scanner.close();
	}
}
