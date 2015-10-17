package com.test;

public class MissingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(missString("srinivas",4));
		//System.out.println(addLastCharFrontAndRear("sri"));
		//System.out.println(mixStart("mix"));
		//System.out.println(close10(4,6));
		//System.out.println(lastDigit(4,4));
		System.out.println(endUp("sri"));
	}

	public static String missString(String value, int index) {
		String frontPart = value.substring(0, index);
		System.out.println("Front Part-->"+frontPart);
		
		String rearPart = value.substring(index + 1, value.length());
		System.out.println("Rear Part-->"+rearPart);
		return frontPart + rearPart;

	}
	
	/*Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
	The original string will be length 1 or more. */
	public static String addLastCharFrontAndRear(String value) {
		String subStr = value.substring(value.length()-1,value.length());
		String finalValue=subStr+value+subStr;
		return finalValue;

	}

/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen.*/
	public boolean hasTeen(int a, int b, int c) {
		  if(a>=13&&a<=19 || b>=13&&b<=19 || c>=13&&c<=19){
		    return true;
		  }
		  
		  return false;
		}


/*Return true if the given string begins with "mix", 
except the 'm' can be anything, so "pix", "9ix" .. all count. */
	public boolean mixStart(String str) {

		if(str.length()>=3){
		return str.substring(1,3).startsWith("ix");

		}
		return false;
		  
		}
	/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
			Note that Math.abs(n) returns the absolute value of a number.*/
	public static int close10(int a, int b) {
		int aValue=Math.abs(10-a);
		int bValue=Math.abs(10-b);
		if(aValue<bValue){
			return a;
		}else if(aValue==bValue){
			return 0;
		}
		return b;
	}
	

/*Given two non-negative int values, return true if they have the same last digit, 
		such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.*/
	public static boolean lastDigit(int a, int b) {
	    int arem=a%10;
	    int brem=b%10;
	    while(arem>10){
	    	arem=a%10;
	    }
	    
	    while(brem>10){
	    	brem=a%10;
	    }
		return arem==brem;
	}
	
	/*Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there.
			Note that str.toUpperCase() returns the uppercase version of a string. */
	
	public static String endUp(String str) {
		if(str.length()<=3){
			return str.toUpperCase();
		}
		String upperCase= str.substring(str.length()-3, str.length()).toUpperCase();
		String lowerCase=str.substring(0, str.length()-3);
		return lowerCase+upperCase;
		 // return null;;
	}
}

