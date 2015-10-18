package com.polymorphism.overriding;

public class EbayCompany extends Company{

	public EbayCompany(){
		System.out.println("Ebay Constructor");
	}
	protected String getAddress(){
    	return "Ebay Address";
    }
}
