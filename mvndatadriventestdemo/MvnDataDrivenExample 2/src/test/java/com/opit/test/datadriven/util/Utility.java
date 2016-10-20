package com.opit.test.datadriven.util;

public class Utility {

	public static boolean isSuiteRunnable(Xls_Reader xls, String suiteName){
		
		int rowCount = xls.getRowCount("Suite");
		System.out.println("Total number of rows in the Suite sppreadsheet : "+rowCount);
		
		return false;
	}
}
