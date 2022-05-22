package org.test;

import java.util.Scanner;

public class SawpTwonumbersusingthirdvariable {
	
 public static void main(String[] args) {
//	System.out.println("Before sawpping");
//	System.out.println(args[0]);
//	System.out.println(args[1]);
	 int c;
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the A value ");
	int ValueA = Sc.nextInt();
	Scanner Sc1 = new Scanner(System.in);
	System.out.println("Enter the B value ");
	int ValueB = Sc.nextInt();
	
	 c = ValueA;
	 ValueA = ValueB;
	 ValueB=c;
	 
	 System.out.println("Value of A is " +ValueA);
	 System.out.println("Value of A is " +ValueB);
	

	
	
}
}
