package com.genrics;

public class GenericsMethods {
	
	//Generics in method
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
        return g1.getValue().equals(g2.getValue());
    }
     
    public static void main(String args[]){
    	
    	
       /* GenericsType<String> g1 = new GenericsType<>();
        g1.setValue("Pankaj");
        g1.setValue(18); 
        
        GenericsType<String> g2 = new GenericsType<>();
        g2.setValue("Pankaj");
         
        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
        System.out.println("The two values are equal True/False-->"+isEqual);
        //above statement can be written simply as
        isEqual = GenericsMethods.isEqual(g1, g2);
        System.out.println("The two values are equal True/False-->"+isEqual);
        //This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
        //Compiler will infer the type that is needed
*/    }

}
