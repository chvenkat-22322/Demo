package com.pack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MultipleOccurances {
	
	//public static void display(String string) {
	
	public static void main(String[] args) {
		
		String s ="Venkataeeee";
	
		Map<Character,Integer> map=new HashMap<>();
		
		char ch[]=s.toCharArray();
		
		for(char c :ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
			
		}
		//System.out.println(s + "" +map);
	

	Set<Map.Entry<Character, Integer>> entryset=map.entrySet();
	
	for(Map.Entry<Character, Integer> entry :entryset) {
		
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+":" +entry.getValue());
		}
	}
	

	}
}
