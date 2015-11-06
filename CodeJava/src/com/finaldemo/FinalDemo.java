package com.finaldemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FinalDemo {

	public static void main(String[] args) {
		Employee emp=new Employee(10L, "Srinivas");
		Employee emp1=new Employee(10L, "Srinivas1");
		//emp.getEmpName().replace('S', 'a');
		//System.out.println("Modified name--"+replace);
		//System.out.println(emp.getEmpName());
        final Map<String, Employee> mapObj=new MyHashMap<String, Employee>(2);
        mapObj.put("A", emp);
        mapObj.put("A", emp1);
        Set<Entry<String, Employee>> entryList=mapObj.entrySet();
        for(Entry<String, Employee> entry:entryList){
        	System.out.println(entry.getKey()+"-"+entry.getValue().getEmpName());
        }
      
	}

}
