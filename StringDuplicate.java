package com.pack;

public class StringDuplicate {
	
 public static void main(String[] args) {
	
	 String s = "veenkatae";
	 
     char[] ch =s.toCharArray();
     
     for(int i=0; i<ch.length-1; i++) {
    	 
    	for(int j=i+1; j<ch.length-1; j++) {
    		
    		if(ch[i]==ch[j])
    		{
    			System.out.println(ch[i]);
    		} 	}
    	 
     }
     
 }

}
