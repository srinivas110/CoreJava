package com.collections.map;

public class Employee {
	private int empId;
	private String empName;

	public Employee(int empId,String empName ) {
         this.empId=empId;
         this.empName=empName;
	}
	public Employee() {

	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Calling hashcode-->"+empName);
		return empName.length();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Calling equals");
		Employee emp=(Employee)obj;
		return this.empId==emp.getEmpId();
	}
	

}
