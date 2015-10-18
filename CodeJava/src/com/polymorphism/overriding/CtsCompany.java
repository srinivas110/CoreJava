package com.polymorphism.overriding;

public class CtsCompany extends Company {

	public CtsCompany() {
		System.out.println("Cts constructor");
	}

	public CtsCompany(String name) {
		this();
		System.out.println("Cts constructor args" + name);
	}

	/*
	 * if we override the method the visibility should be protected-->public or
	 * public-->public or protected-->protected can't decrease the visibility and
	 * return type should be Object-->String or Wrapper types
	 */
	public String getAddress() {
		return "Cts Address";
	}

}
