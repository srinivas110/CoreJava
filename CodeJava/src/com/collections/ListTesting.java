package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ListTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=new ArrayList<Integer>(); 
		intList.add(2);
		intList.add(3);
		intList.add(5);
		System.out.println(intList);
		intList.add(2, 2);
		/*intList.add(1, 1);
		intList.add(5, 5);*/
		System.out.println(intList);
		
		List<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(2);
		linkedList.add(32);
		linkedList.add(3);
		
		System.out.println(linkedList.lastIndexOf(2));
		System.out.println(linkedList);

		
		

	}

}
