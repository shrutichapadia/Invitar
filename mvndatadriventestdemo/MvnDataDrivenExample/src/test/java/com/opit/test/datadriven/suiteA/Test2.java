package com.opit.test.datadriven.suiteA;

public class Test2 {
	
	@Test
	public void test2(){
		//Xls_Reader suiteReader = new Xls_Reader("C:\\Workspace6\\DataDrivenTestNg\\resources\\suite.xlsx");
		
		Xls_Reader suiteReader = new Xls_Reader("\\Users\\shruti\\Documents\\workspace\\mvndatadriventestdemo\\MvnDataDrivenExample\\resources\\suite.xlsx");
		Utility.isSuiteRunnable(suiteReader, "SuiteA");

}
