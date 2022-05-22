package org.test;

public class Food extends PartialAbstract {
		String southindia;
		String Northindia;
		String Midwestindia;
	@Override
	public void foodculture() {
southindia= "dosa";
Northindia= "chapathi";
Midwestindia="roti";
System.out.println("southindia food " +southindia);
System.out.println("Northindia " + Northindia);
System.out.println("Midwestindia" +Midwestindia);
	}
public static void main(String[] args) {
	Food fd = new Food();
	fd.Aadhar();
	fd.Pan();
	fd.foodculture();
}
}
