package com.collections.sorting;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId()>o2.getEmpId()?1:o1.getEmpId()==o2.getEmpId()?0:-1;
	}

}
