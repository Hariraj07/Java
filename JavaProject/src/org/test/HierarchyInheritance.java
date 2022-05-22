package org.test;

public class HierarchyInheritance extends SingleInheritance {
	String client1name;
	public void client1() {
client1name= "privia"; 
System.out.println(client1name);
	}
public static void main(String[] args) {
	HierarchyInheritance h = new HierarchyInheritance();
	h.client1();
h.empid();


}
}
