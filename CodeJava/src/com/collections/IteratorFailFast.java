package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorFailFast {

	public static void main(String[] args) {
		List<String> intList=new ArrayList<String>(); 
		intList.add("abc");
		intList.add("xyz");
		intList.add("123");
		List<String> copyList=new CopyOnWriteArrayList<String>(intList);
		Iterator<String > list1=copyList.iterator();
		while(list1.hasNext()){
			String value=list1.next();
			
				//copyList.set(0, "1234");
				System.out.println("Original"+copyList);
				copyList.remove("abc");
				copyList.add("at last");
				copyList.add("at last1");
				System.out.println("After remove"+copyList);
			
		}
	}

}
