package com.npu.cs501;


import java.io.IOException;
import java.util.Stack;

public class RevName {
   private String input; 
   private String st ="";

   public String doRev(String input) {
      
      Stack theStack = new Stack(); 
      for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i); 
         theStack.push(ch); 
         System.out.println("Stack "+theStack);
      }  

      for (int j = 0; j < input.length(); j++){
       Object ch = theStack.pop(); 
         st = st + ch; 
         
         System.out.println("Stack final"+theStack);
         System.out.println("name stacking up in reverse order       "+ st);
      }
 
	 
      return st;
}

   public static void main(String[] args) 
   throws IOException {
      String input = "sarah";
      String chd = "";
      RevName rev = new RevName();
      
      chd = rev.doRev(input);
      System.out.println("Reversed name : " + chd);
   }
   
}