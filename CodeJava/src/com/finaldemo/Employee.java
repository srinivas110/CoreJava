package com.finaldemo;

public final class Employee {

	private Long empId;
	private String empName;

	public Employee(Long empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public Long getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

}
