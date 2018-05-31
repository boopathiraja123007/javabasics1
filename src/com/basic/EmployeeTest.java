package com.basic;

import java.util.Scanner;

class Employee {
	private String firstName, lastName;
	private double salary;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void salaryCalculations()
	{
		if (salary<=0)
		{
			System.out.println("INVALID SALARY");
			
		}
		else
		{
			System.out.println("Emp1 - First Name : "+firstName);
			System.out.println("Emp1 - Last Name : "+lastName);
			System.out.println("Emp1 - Salary : "+salary);
			salary=salary*12;
			System.out.println("Emp1 - yearly salary : "+salary);
			salary=salary*1.1;
			System.out.println("Emp1 - incremented salary : "+salary);
			
		}
	
	}
	
}

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee1 = new Employee();
		
		employee1.setFirstName(scanner.next());
		employee1.setLastName(scanner.next());
		employee1.setSalary(scanner.nextDouble());
		employee1.salaryCalculations();
	}
}


