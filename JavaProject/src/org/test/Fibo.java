package org.test;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int nextnum;
		int lengthofserious;

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the length of serious");
		lengthofserious = Sc.nextInt();

		for (int i = 0; i < lengthofserious; i++) {

			System.out.println(num1 + " ");
			nextnum = num1 + num2;
			num1 = num2;
			num2 = nextnum;

		}

	}

}
