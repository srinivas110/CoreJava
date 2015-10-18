package com.polymorphism.overriding;

public class GetCompanyAddress {

	public GetCompanyAddress() {

	}

	public String getCompanyAddress(Company company) {
		return company.getAddress();
	}

	public static void main(String[] args){
		GetCompanyAddress address=new GetCompanyAddress();
		System.out.println("Cts Address-->"+address.getCompanyAddress(new CtsCompany()));
		//System.out.println("Head office Address-->"+address.getCompanyAddress(new CtsCompany()));
		System.out.println("ebay Address-->"+address.getCompanyAddress(new EbayCompany()));
	}
}
