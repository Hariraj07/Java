package org.test;

import java.util.Scanner;

public class Revdupstr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		int length = sb.length();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {

				char c1 = sb.charAt(i);
				char c2 = sb.charAt(j);
				if (c1 == c2) {

					sb.deleteCharAt(i);
					i = 0;
					j = 0;
					length = length - 1;
				}
			}
		}
		System.out.println(sb);
	}
}