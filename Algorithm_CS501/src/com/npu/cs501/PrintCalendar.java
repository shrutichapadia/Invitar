package com.npu.cs501;

import java.util.Scanner;

public class PrintCalendar {
	
	public static void printmonth(int month, int year){
		//System.out.println(month + " " + year);
		
		printMonthTitle(month,year);
		
		//printMonthBody(month,year);
		
	}
	public static void printMonthTitle(int month, int year){
		System.out.println("  "  + getMonthName(month));
	}
	
	public static String getMonthName(int month){
		
		String monthname = "";
		
		switch(month){
		case 1: monthname ="January";break;
		case 2: monthname ="February";break;
		case 3: monthname ="March";break;
		case 4: monthname ="April";break;
		case 5: monthname ="May";break;
		case 6: monthname ="June";break;
		case 7: monthname ="July";break;
		case 8: monthname ="August";break;
		case 9: monthname ="September";break;
		case 10: monthname ="October";break;
		case 11: monthname ="November";break;
		case 12: monthname ="December";
		
			
		}
		return monthname;
	}
//	public static void printMonthBody(int month, int year){
//		
//		int i = 0;
//		for (i = 0; i < startDay; i++)
//		System.out.print(" ");
//		for (i = 1; i <= numberOfDaysInMonth; i++) {
//		System.out.printf("%4d", i); 
//		if ((i + startDay) % 7 == 0);
//		System.out.println();
//
//		}
		
//		public static int getStartDate(int month, int year){
//			final int start_day_1800_1_jan = 3;
//			int totalnoofdays = getTotalNoofDays(year, month);
//			return (totalnoofdays + start_day_1800_1_jan)%7;
//		}
		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year to check calender e.g 2012");
		int year = input.nextInt();
		System.out.println("Enter Month as number  to check calender e.g 1");
		int month = input.nextInt();
		
		printmonth(month, year);
		
	}

}
