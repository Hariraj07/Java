package org.test;

import java.util.HashSet;

public class Revstr {
	public static void main(String[] args) {
		String s= "Hari";
		String rev = "";
		 for (int i = 0; i < s.length(); i++) {
			 char c = s.charAt(i);
			 //System.out.println(c);
			 rev=rev+c;
		}
		HashSet s1 = new HashSet();
		for (int i = 0; i < args.length; i++) {
			System.out.println(rev);
		}
	}

}
