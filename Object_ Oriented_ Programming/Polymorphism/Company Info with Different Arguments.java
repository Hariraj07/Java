package org.day9;

public class Company Info with Different Arguments{
	public void Companyname() {
		System.out.println("Company details");
	}
	public void Companyname(int companyid) {
		System.out.println("companyid is " + companyid);
	}
	public void Companyname(String companyid, float companylocation) {
		System.out.println("company location is " + companylocation);
	}
	public static void main(String[] args) {
		CompanyInfoDifferentNumberofArguments c = new CompanyInfoDifferentNumberofArguments();
		c.Companyname();
		c.Companyname(1235);
		c.Companyname(2522);
	}
}
