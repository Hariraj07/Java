package org.sample;

public class DesktopInheri extends ComputerInheri {

	public void Cpu() {// Single inheritance
		System.out.println("Super Fast CPU");
	}

	public void Mouse() {
		System.out.println("Wired mouse");
	}

	public void Moniter() {
		System.out.println("Oled Moniter");
	}

	public static void main(String[] args) {
		DesktopInheri d = new DesktopInheri();
		d.Ram();
		d.Mouse();
		d.Moniter();
		d.Ram();
		d.Display();

	}
}
