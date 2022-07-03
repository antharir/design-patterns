package com.rajeshanthari.geek.practice;

public class EmployeeDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(1, "Rajesh", "Hyderabad");
		System.out.println(emp1);
		System.out.println(emp1.hashCode());
		Employee emp2 = emp1.clone();
		System.out.println(emp2);
		System.out.println(emp2.hashCode());
	}
}
