package org.test;

public class Reversestr {
	public static void main(String[] args) {
		String s="Hari";
		String s1="madam";
		String rev="";
		String rev1="";
		 for (int i =s.length()-1; i >= 0; i--) {
			 char c = s.charAt(i);
			 char d = s1.charAt(i);
			rev= rev+c ;
			rev1= rev1+c;
			
			
	}
		 if (rev.equals(s1)) {
				System.out.println(" The value  is palindrom");
				if (rev1.equals(s1)) {
					System.out.println(" The value  is palindrom");
				}
			}
			else {
				System.out.println("The value  is not  palindrom");
			}
}
}
