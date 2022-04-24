package org.test;

public class ReverseTheNumber {
public static void main(String[] args) {
	 int num=9876543;
	 int i=0; int j=0; int a=num;
	 
	 while (a>0) {
		 i=a%10;
		 j=(j*10)+i;
		 a=a/10;
		
	}
	 System.out.println(j);
}
}
