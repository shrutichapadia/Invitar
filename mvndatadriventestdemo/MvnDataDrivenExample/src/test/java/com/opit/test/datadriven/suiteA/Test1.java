package com.opit.test.datadriven.suiteA;

import org.testng.annotations.Test;

import com.opit.test.datadriven.util.Utility;
import com.opit.test.datadriven.util.Xls_Reader;

public class Test1 {

	@Test
	public void test1(){
		//Xls_Reader suiteReader = new Xls_Reader("C:\\Workspace6\\DataDrivenTestNg\\resources\\suite.xlsx");
		
		Xls_Reader suiteReader = new Xls_Reader("\\Users\\shruti\\Documents\\workspace\\mvndatadriventestdemo\\MvnDataDrivenExample\\resources\\suite.xlsx");
		Utility.isSuiteRunnable(suiteReader, "SuiteA");
		
	}
}
