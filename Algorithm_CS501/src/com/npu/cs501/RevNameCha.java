package com.npu.cs501;

import java.io.IOException;
import java.util.Stack;

public class RevNameCha {
	
	char in;
	char out;
	String std;
	public String dorev( String std){
		
		Stack st = new Stack();
		
		for(int i=0; i<=  std.length(); i++){
			 char ch = std.charAt(i); 
	         st.push(ch);
	         System.out.println("Stack"+st);
		
		}
		while(!st.isEmpty()){
			
			st.pop();
			 System.out.println("Stack"+st);
		   }
		
		return std;
	}

	public static void main(String []args) throws IOException{
		
		 String input = "shruti";
	      String chd = "";
	      RevNameCha rev = new RevNameCha();
	      
	      chd = rev.dorev(input);
	      System.out.println("Reversed name : " + chd);
	   }
}

