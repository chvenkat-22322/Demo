package com.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List<String> al =new ArrayList<>();{
			
		al.add("kjsfg");
		al.add("sGdfj");
		al.add("Venkat");
		
		System.out.println(al);
		
	List<String>al2=al.stream().filter(x->x.startsWith("s")).collect(Collectors.toList());
		
			System.out.println(al2);
		}
	}

}
