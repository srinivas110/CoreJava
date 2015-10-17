package com.test;

public class CountNoOfInstancesOfClass {

	static int count = 0;

	public CountNoOfInstancesOfClass() {
		 ++count;
         System.out.println("No of Instances" +count);
	}

	public static Integer returnCount(CountNoOfInstancesOfClass instanse) {
		if (instanse != null) {
			count++;
		}
		System.out.println("No of instance of class" + count);
		return count;
	}

	public static void main(String[] args) {

		CountNoOfInstancesOfClass instance = new CountNoOfInstancesOfClass();
		CountNoOfInstancesOfClass instance1 = new CountNoOfInstancesOfClass();
		CountNoOfInstancesOfClass instance2 = new CountNoOfInstancesOfClass();
		/*
		 * returnCount(instance); returnCount(instance1);
		 * returnCount(instance2);
		 */
	}

}
