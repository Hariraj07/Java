package org.test;

public class Calculateuppercaselowercase {
	public static void main(String[] args) {
	String s="HariH@ran12";
	int uppercase = 0; int lowercase=0; int digit=0; int special =0;
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (Character.isUpperCase(c)) {
			uppercase ++;
		}
		else if (Character.isLowerCase(c)) {
			lowercase++;
		}
		else if (Character.isDigit(c)) {
			digit++;
		} else {
			special++;
		}
	}
	System.out.println("upper case is " +uppercase);
	System.out.println("lower case is "+lowercase);
	System.out.println("digit is " + digit);
	System.out.println("special characteris "+ special);
	
	}
}
