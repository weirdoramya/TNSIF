package com.tnsif.day5;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		//System.out.println(Employee.companyName);
		Employee1 e = new Employee1("Shubh", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee1("Deep", 321);
		System.out.println(e);
	}
}

