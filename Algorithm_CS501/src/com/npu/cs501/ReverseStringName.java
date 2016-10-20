package com.npu.cs501;

public class ReverseStringName {
	String str;
	public String ReverseName(String str){
	
	if (str.length() < 2) {
        return str;
    }
	else
    return ReverseName(str.substring(1)) + str.charAt(0);
	
	}
	 public static void main(String[] args) {
	
		 String name="shruti Chapadia";
		 ReverseStringName rvn = new ReverseStringName();
		 String rn = rvn.ReverseName(name);
		 System.out.println("Reverse name is    " + rn);
		 
	 }
	 }
		 //Because you mention not to use for loop and reverse default java method i used above
//         int len=name.length();
//         char[] c = name.toCharArray();
//         
//         for(int i=0;i<len-1;i++)
//         {
//        	 for(int j=len-1; j<len-i-1;j--){
//             char temp= c[0];
//             c[0]=c[len-1];
//             c[len-1]=temp;
//         }
//         }
//         System.out.println("Swapping string is: ");
//         System.out.println(c);

         
