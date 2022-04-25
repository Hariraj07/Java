package org.abstractsss;

public class Abstractimplement implements Abstract Interface{

	@Override
	public void hardwareResources() {
		System.out.println("hardward is new ");
		
	}
	
public static void main(String[] args) {
	Sample1 ks = new Sample1();
	ks.hardwareResources();
}
}
