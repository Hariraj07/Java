package org.test;

public class Axisbank extends Hdfc {
	@Override
	public void savings() {
		System.out.println("8%");
	}

	public static void main(String[] args) {
		Axisbank ac = new Axisbank();
		ac.bankinfo();
		ac.deposit();
		ac.fixed();
		ac.savings();
	}
}
