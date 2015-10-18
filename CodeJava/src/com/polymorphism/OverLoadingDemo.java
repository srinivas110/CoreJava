package com.polymorphism;

public class OverLoadingDemo {

	public static void main(String[] args) {
		//over loading concept works most specific to genralized objects
		//constructor overloading 
		Employee emp=new Employee("Hai");
		emp.displayName("srinivas");
		emp.displayName(new String("mohan"));
		emp.displayName(12);
		//emp.addEmployee(4);
		/*emp.addEmployee(4L);
		emp.addEmployee(4.5);*/
	}

}
