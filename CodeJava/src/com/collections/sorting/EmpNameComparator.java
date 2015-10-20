package com.collections.sorting;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareToIgnoreCase(o2.getEmpName());
		
		//return o1.getEmpName().equals(o2.getEmpName())?0:o1.getEmpName().length()==o2.getEmpName().length()?0:-1;
	}

}
