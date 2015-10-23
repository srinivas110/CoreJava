package com.shallowanddeep;

public class Employee implements Cloneable{
	private int empId;
	private String empName;
	 Dept dept;

	public Employee(int empId,String empName,Dept dept) {
         this.empId=empId;
         this.empName=empName;
         this.dept=dept;
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
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
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
	
  public Object clone() throws CloneNotSupportedException{
	  //Deep cloning
	Employee emp=(Employee)super.clone();
	emp.dept=(Dept)dept.clone();
	return emp;
	  //shallow cloning
	// return super.clone();
	  
  }
}
