package com.opit.session4;

public class MethodOverloadingDemo {
	
	//Methods are having the same name
	// but methids signature is different 
	//Overloaded method 1
	public static int sum(int a, int b){
		return (a+b);
	}
	//Overloaded method 2
	public static int sum(int a, int b, int c){
		return (a+b+c);
	}
	//Overloaded method 3
	public static String sum(String s, int a){
		return (s+a);
	}
   
	public static void main(String [] args){
		int result1 = sum(100,200);
		System.out.println(result1);
		
		int result2 = sum(100, 200, 300);
		System.out.println(result2);
		
		String result3  = sum("Selenium",1);
		System.out.println(result3);
	}
}
