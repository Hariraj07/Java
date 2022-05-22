package org.test;

public class Inheritance2 extends Inheritance1 {
String bike() {
	return " cycle with motor";

}
 void motorcycle() {
	System.out.println("I am motor cycle, I am " + bike());
	String temp=super.bike();
	System.out.println("My ancestor is a cycle who is " + temp);
}		
  public static void main(String[] args) {
	  Inheritance2 m = new Inheritance2();
	  m.bike();
	  m.motorcycle();
}
 
}
	


