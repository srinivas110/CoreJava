package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<Long, String>();
		/* Hash Map over rites the values if key is same
		 * here we are adding long values Long internally implements equals and hashcode methods .
		 * observe below code  1 and 3 key values are same so the hash function returns the same bucket location
		 * before overrite the values its checking the equals() method of two keys(existing,current) if two keys are same the value
		 *  is overrite otherwise a linked list is created internally to save the current entry in the same bucket location
		 *  
		 *
		 *		 *  */
		map.put(1L, "srinivas");
		map.put(2L, "venkat");
		map.put(1L, "venkat");
		
		Set<Entry<Long, String>> entrySet = map.entrySet();
		for (Entry<Long, String> entry : entrySet) {
			System.out.println("Key-->" + entry.getKey() + " --Value--"
					+ entry.getValue());
		}
		
		//Testing with user defined objects
		Map<Employee, String> empMap = new HashMap<Employee, String>();
		empMap.put(new Employee(1, "sriniva"), "Yash");
		empMap.put(new Employee(2, "sriniva"), "Cts");
		empMap.put(new Employee(2, "venkata"), "IBM");
		//Set<Entry<Employee, String>> empEentrySet = empMap.entrySet();
		Employee emp=new Employee(1, "sriniva");
		System.out.println(empMap.get(emp));
	/*	for (Entry<Employee, String> entry : empEentrySet) {
			System.out.println(entry.getValue());
			System.out.println("Key empId-->" + entry.getKey().getEmpId() + "--empName--"+entry.getKey().getEmpName()+ " --Value--"
					+ entry.getValue());
		}*/

	}

}
