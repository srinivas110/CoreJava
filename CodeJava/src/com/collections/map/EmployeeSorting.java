package com.collections.map;


public class EmployeeSorting implements Comparable<EmployeeSorting> {
	private int empId;
	private String empName;

	public EmployeeSorting() {

	}

	public EmployeeSorting(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
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
		System.out.println("Calling hashcode-->" + empName);
		return empName.length();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Calling equals");
		Employee emp = (Employee) obj;
		return this.empId == emp.getEmpId();
	}

	@Override
	public int compareTo(EmployeeSorting emp) {
		// TODO Auto-generated method stub
		return this.empId>emp.getEmpId()?1:this.empId==emp.getEmpId()?0:-1;
		//return compare(this, emp);
	}

	

}
