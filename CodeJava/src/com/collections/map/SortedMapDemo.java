package com.collections.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		/*
		 * TreeMap is implementation class to SortedMap,NavigableMap which
		 * maintains the default sorting order
		 */
		// SortedMap<Long, String> map=new TreeMap<Long ,String>();
		Map<Long, String> map = new TreeMap<Long, String>();
		map.put(5L, "Venkat");
		map.put(1L, "Srini");
		map.put(2L, "Srini");

		Set<Entry<Long, String>> entrySet = map.entrySet();
		for (Entry<Long, String> entry : entrySet) {
			System.out.println("Key-->" + entry.getKey() + " --Value--"
					+ entry.getValue());
		}
		
		SortedMap<EmployeeSorting, String> empMap = new TreeMap<EmployeeSorting, String>();
		
		empMap.put(new EmployeeSorting(5, "srinivaas"), "Yash");
		empMap.put(new EmployeeSorting(2, "mohankrishna"), "Cts");
		empMap.put(new EmployeeSorting(4, "venkata"), "IBM");
		Set<Entry<EmployeeSorting, String>> empEentrySet = empMap.entrySet();
		//Employee emp=new Employee(1, "sriniva");
		//System.out.println(empMap.get(emp));
		for (Entry<EmployeeSorting, String> entry : empEentrySet) {
			System.out.println(entry.getValue());
			System.out.println("Key empId-->" + entry.getKey().getEmpId() + "--empName--"+entry.getKey().getEmpName()+ " --Value--"
					+ entry.getValue());
		}
	}

}
