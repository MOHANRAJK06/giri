package org.bom;

import java.util.Iterator;

public class StringReverse {
	
	
	public static void main(String[] args) {
		
		String s = "My name is sarathkumar";
		String b ="Anbu";
		
		
    System.out.println("My:"+s);
		
		String[] d = s.split(" ");
		
	   for (int i=d.length-1; i>=0; i--) {
			
			String x = d[i];
			
		b = b+" "+x;
	}
	System.out.println(b);
	
    System.out.println("String");
	System.out.println("Success");
	System.out.println("END");
	
	
}
		
	
		
		
		
			
			
		}
	
	
	



