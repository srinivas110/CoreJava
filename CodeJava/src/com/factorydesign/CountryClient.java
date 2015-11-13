package com.factorydesign;

public class CountryClient {

	public static void main(String[] args) {
		Country country=CountryFactory.getCountry("IN");
		System.out.println("Country Name-->"+country.getCountryName());

	}

}
