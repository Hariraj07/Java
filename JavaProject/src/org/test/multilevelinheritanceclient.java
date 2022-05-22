package org.test;

public class multilevelinheritanceclient extends SingleInheritance {
	String clientname;
	String clientlocation;
	public void clientname() {
clientname= "UIHC";
System.out.println("clientname" + clientname);
	}
	public void clientlocation() {
clientlocation ="iowa";
System.out.println("clientlocation" + clientlocation);
	}
	 public static void main(String[] args) {
		 multilevelinheritanceclient ma = new multilevelinheritanceclient();
		 ma.empid();
		 ma.emplocation();
		 ma.empname();
		 ma.empphonenum();
	}

}
