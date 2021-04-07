package com;

import java.util.Scanner;

/*
 * Problem -->> Given a string str containing only lowercase letters,
 *  generate a string with the same letters, but in uppercase.
 */
public class UpeerCase {

	public static String to_upper(String str) {
		return str.toUpperCase();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(to_upper(str));
	}

}
