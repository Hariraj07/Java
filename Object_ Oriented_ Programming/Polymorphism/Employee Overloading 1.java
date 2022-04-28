package org.test;

public class PolimorphismNew {
	public void empolyeedetails() {
		System.out.println("Employee details");
	}

	public void empolyeedetails(String name) {
		System.out.println(name);
	}

	public void empolyeedetails(int id) {
		System.out.println(id);
	}

	public static void main(String[] args) {
		Polimorphismnew p = new Polimorphismnew();
		p.empolyeedetails();
		p.empolyeedetails(100);
		p.empolyeedetails("Raj");
	}

}
