package com.cit.SuiteOne;

import java.io.IOException;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import com.cit.TestSuiteBase.SuiteBase;
import com.cit.Utility.Read_XLS;
import com.cit.Utility.SuiteUtility;

public class SuiteOneBase extends SuiteBase{
	
	Read_XLS FilePath = null;
	String SheetName = null;
	String SuiteName = null;
	String ToRunColumnName = null;	
	
	//This function will be executed before SuiteOne's test cases to check SuiteToRun flag.
	@BeforeSuite
	public void checkSuiteToRun() throws IOException{
		//Called init() function from SuiteBase class to Initialize .xls Files
		init();	
		//To set TestSuiteList.xls file's path In FilePath Variable.
		FilePath = TestSuiteListExcel;
		SheetName = "SuiteList";
		SuiteName = "SuiteOne";
		ToRunColumnName = "SuiteToRun";
		
		//If SuiteToRun !== "y" then SuiteOne will be skipped from execution.
		if(!SuiteUtility.checkToRunUtility(FilePath, SheetName,ToRunColumnName,SuiteName)){			
			//To report SuiteOne as 'Skipped' In SuitesList sheet of TestSuiteList.xls If SuiteToRun = N.
			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Skipped/Executed", SuiteName, "Skipped");
			//It will throw SkipException to skip test suite's execution and suite will be marked as skipped In testng report.
			throw new SkipException(SuiteName+"'s SuiteToRun Flag Is 'N' Or Blank. So Skipping Execution Of "+SuiteName);
		}
		//To report SuiteOne as 'Executed' In SuitesList sheet of TestSuiteList.xls If SuiteToRun = Y.
		SuiteUtility.WriteResultUtility(FilePath, SheetName, "Skipped/Executed", SuiteName, "Executed");
	}	






//	public void init() throws IOException{
//	//Please change file's path strings bellow If you have stored them at location other than bellow.
//	//Initializing Test Suite List(TestSuiteList.xls) File Path Using Constructor Of Read_XLS Utility Class.
//	TestSuiteListExcel = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\cit\\ExcelFiles\\TestSuiteList.xlsx");
//	//Initializing Test Suite One(SuiteOne.xls) File Path Using Constructor Of Read_XLS Utility Class.
//	TestCaseListExcelOne = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\cit\\ExcelFiles\\SuiteOne.xlsx");
//	//Initializing Test Suite Two(SuiteTwo.xls) File Path Using Constructor Of Read_XLS Utility Class.
//	TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\cit\\ExcelFiles\\SuiteTwo.xlsx");																			
//}
}
