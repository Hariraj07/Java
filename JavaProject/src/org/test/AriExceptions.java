package org.test;

import java.util.LinkedList;

public class AriExceptions {
	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		li.add(1/2);
		li.add(4/2);
		li.add(6/3);
		try {
			li.add(5/0);
		} catch (ArithmeticException e) {
			System.out.println("Dont try to divide the number by zero");
		}
		
		
		
		System.out.println(li);
	
	}

}
