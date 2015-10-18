package com.polymorphism;

public class Employee {
	
	public Employee(){
		System.out.println("Default constructor-->");
	}
	public Employee(String empName){
		//this() is the first statement inside parameter constructor for calling default const
		this();
		System.out.println("Parameter constructor-->"+empName);
	}
	
	public void addEmployee(int empId){
		System.out.println("Employee Id int val"+empId);
	}
	public void addEmployee(long empId,int position){
		System.out.println("Employee Id long val in position"+empId);
	}
	public void addEmployee(Double empId){
		System.out.println("Employee Id Double val"+empId);
	}
	public void displayName(String name){
		System.out.println("Hello  String-->"+name);
	}
	public void displayName(Object name){
		System.out.println("Hello Object -->"+name);
	}

}
