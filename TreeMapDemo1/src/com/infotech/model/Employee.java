package com.infotech.model;
import java.util.Scanner;

public class Employee implements Comparable<Employee>{

	private Integer employeeId;
	private String employeeName;
	private Double salary;
	private String email;
	
	public Employee() {
//		super(); your super keyword that is useless
		
//		get employee information from user
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter employeeId:");
		this.employeeId = inp.nextInt();
		System.out.println("Enter employyeeName:");
		this.employeeName = inp.next();
		System.out.println("Enter employee salary:");
		this.salary = inp.nextDouble();
		System.out.println("Enter employee email:");
		this.email = inp.next();
		System.out.println("===== ===== ===== ===== =====");
	}
	

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}

//	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", email=" + email + "]";
	}

//	@Override
	public int compareTo(Employee o) {
		return this.getEmployeeName().compareTo(o.getEmployeeName());
	}
}
