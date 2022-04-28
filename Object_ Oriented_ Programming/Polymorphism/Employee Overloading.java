package org.day9;

public class Employee {
	public void empdetails()
	{System.out.println("This is emp details");
	}
	public void empdetails(int age) {
		System.out.println("Age is " + age);
		}
	public void empdetails(int age, long roll) {
		System.out.println("Rollnumber is " +  roll);
		}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.empdetails();
		e.empdetails(10);
		e.empdetails(10, 112322322332l);
	}
}
