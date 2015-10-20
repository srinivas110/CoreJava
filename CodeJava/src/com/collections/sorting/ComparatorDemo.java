package com.collections.sorting;

import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Venkat"));
		empList.add(new Employee(2, "Mohan"));
		empList.sort(new EmpNameComparator());
		System.out.println("Sorting By Name--->");
		for(Employee emp:empList){
			System.out.println("EmpId:"+emp.getEmpId() +"--EmpName :"+emp.getEmpName());
		}
		empList.sort(new EmpIdComparator());
		System.out.println("Sorting By ID--->");
		for(Employee emp:empList){
			System.out.println("EmpId:"+emp.getEmpId() +"--EmpName :"+emp.getEmpName());
		}

	}

}
