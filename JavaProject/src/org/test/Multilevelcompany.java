package org.test;

public class Multilevelcompany extends multilevelinheritanceclient{
	String companyname;
	String companylocation;
	 public void Companyname() {
companyname= "nttdata";
System.out.println("companyname" +companyname);
	}
	 public void companylocation() {
companylocation="Chennai";
System.out.println("companylocation" + companylocation);
	}
public static void main(String[] args) {
	Multilevelcompany mc = new Multilevelcompany();
	mc.Companyname();
	mc.companylocation();
mc.empid();
mc.emplocation();
mc.empphonenum();
mc.empname();
mc.clientlocation();
mc.clientname();
	
	
}
}
