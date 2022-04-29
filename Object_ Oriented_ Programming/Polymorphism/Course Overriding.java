package org.test;

import org.edu.Polyexp;

//bSc(),bEd(),bA(),bBA(),ug(),pg()
public class Arts extends Polyexp {
	public void bsc() {
		System.out.println("BSC is 1 year");
	}

	public void bEd() {
		System.out.println("bEd is 2 years");
	}

	public void bBa() {
		System.out.println("bBa is 3 years");
	}

	@Override
	public void ug() {
		System.out.println("Ug is 5 years");
	}

	@Override
	public void pg() {
		System.out.println("PG is 6 years");
	}

	public static void main(String[] args) {
		Arts a = new Arts();
		a.bBa();
		a.bEd();
		a.bsc();
		a.pg();
		a.ug();

	}
}
