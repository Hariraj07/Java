package org.test;

public class StrOutBoundaryexception {
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		
		try {
			
		
		String s = "Java";
		char sa = s.charAt(4);
		System.out.println(sa);
		
		String s1 ="null";
		char sa1 = s1.charAt(5);
		System.out.println(sa1);
		} catch (IndexOutOfBoundsException e) {
System.out.println(" given value is out of boundary exception and please enter the value within index ");
		}
	}

}
