package org.test;

public class SingleInheritance {
	int empid;
	String empname;
	Long empphonenum;
	String emplocation;
	
	
public void empid() {
	empid=12456;
		System.out.println(empid);
	}
	public void empphonenum() {
		empphonenum=9962795767l;
		System.out.println(empphonenum);
	}
	public void emplocation() {
		emplocation="chennai";
		System.out.println(emplocation);
	}
	 public  void empname() {
		 empname="Hari";
			System.out.println(empname);
}
	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
	s.empid();
	s.empname();
	s.emplocation();
	s.empphonenum();
	
		
	}

}
