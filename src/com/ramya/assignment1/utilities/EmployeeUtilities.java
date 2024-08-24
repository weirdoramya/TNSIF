package com.ramya.assignment1.utilities;

import com.ramya.assignment1.employeees.Employee;

public class EmployeeUtilities {
	  
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeid());
        System.out.println("Salary: " + employee.getSalary());
    }

    
    public static double calculateTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}



