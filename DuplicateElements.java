package com.pack;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		int count =0;
		
		String s[] = {"venkat","balu","balu"};
		
		for(int i =0; i<=s.length;i++) {
			//int count1 =0;
			
			for(int j=i+1; j<s.length;j++) {
				
				if(s[i].equals(s[j])) {
					
					count++;
					
				}else {
					//System.out.println("zero :::"+count);
				}
			}
			
		}
	//	System.out.println("count ===" +count);
		
		Set<String> al =new HashSet<String>();
		
	    for(String a:s) {
	    	
	    	if(al.add(a)==false) {
	    		
	    		System.out.println(al);
	    	}
	    	
	    	
	    }
		
	
	}
	
}
