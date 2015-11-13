package com.factorydesign;

public class CountryFactory {

	public static Country getCountry(String code){
		if(code.equals("IN")){
			return new India();
		}
		else 
			return new USCountry();
	}
}
