package com.polymorphism.overriding;

public class Company {
	
	public Company(){
		System.out.println("Super class constructor");
	}
    protected Object getAddress(){
    	return "Bangalore";
    }
	
}
