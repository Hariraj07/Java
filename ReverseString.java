package org.Rev;
//Reverse the string
public class ReverseString {
	public static void main(String[] args) {
		String s = "Hari";
		String rev = "";
		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			rev = rev+ c;
			
			
		}
		System.out.println(rev);
	}

}
