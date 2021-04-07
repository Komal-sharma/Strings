package com;

import java.util.Scanner;

/*
 * Problem -->> Given a string S. The task is to convert characters of string to lowercase.
 * 
 */
public class LowerCaseString {
	
	public static String toLower(String str) {
		String lowerCaseStr = str.toLowerCase();
		return lowerCaseStr;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(toLower(str));
	}

}
