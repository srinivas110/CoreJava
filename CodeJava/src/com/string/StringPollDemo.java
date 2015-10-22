package com.string;

public class StringPollDemo {
	
	public static void main(String[] args){
		
		String s1=new String("srinivas");
		System.out.println("s1 reference"+s1);
		String s2="srinivas";
		System.out.println("s2 reference"+s2);
		String s3="srinivas";
		System.out.println("s3 reference"+s3);
		if(s1==s2)
			System.out.println("s1==s2");
		if(s3==s2)
			System.out.println("s3==s2");
	}

}
