package com.npu.cs501;

public class rannumcharcter {


		
		public static char getrandomchar(char ch1, char ch2){
			
			System.out.println("charater in decimal");
			
			return (char)(ch1+ Math.random() *(ch2 - ch1 +1));
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			char a1 = 'a', a2='z';
			
			System.out.println("random charater"+ getrandomchar(a1,a2));
		
			
			
		}

	}


