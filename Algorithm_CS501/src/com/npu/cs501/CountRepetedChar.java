package com.npu.cs501;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class CountRepetedChar {
	

	public void CountRepetedChar(String str){
	         
	        Map<Character, Integer> repMap = new HashMap<Character, Integer>();
	        char[] chars = str.toCharArray();
	        for(Character chs:chars){
	            if(repMap.containsKey(chs)){
	                repMap.put(chs,repMap.get(chs)+1);
	            } else {
	                repMap.put(chs, 1);
	            }
	        }
	        Set<Character> keys = repMap.keySet();
	        for(Character chs:keys){
	            if(repMap.get(chs) > 1){
	                System.out.println(chs+"--->"+repMap.get(chs));
	            }
	        }
	    }
	     
	    public static void main(String[]args){
	    	CountRepetedChar recchar = new CountRepetedChar();
	    	
	    	System.out.println("Repeated Character in shruti Chapadia :");
	        recchar.CountRepetedChar("shruti chapadia");
	    
	}
	

	

}
