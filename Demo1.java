package com.pack;

public class Demo1 {
	
 public static void main(String[] args) {
	
   String s="venkat";
   String s2="";
   
   
   
   for(int i=s.length()-1;i>=0;i--) {
	   
	  s2=s2+s.charAt(i);
	  
   }
 System.out.println("Reverse String ======  "+s2);
   
   
   
}

}
