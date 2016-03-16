//package com.opit.test.webdriver;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public class collectionInfoJenkiconnection {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// run selenium test in stand alone selenium
//		WebDriver driver = new RemoteWebDriver(new URL("http://jenkins.mydomain:4444/wd/hub"), capability);
//		
//		
//		//In addition to standard platform matching capability offered out-of-the-box by Selenium Grid, Jenkins allows you 
//		//to specify "jenkins.label" as a capability, whose value is an expression of label names to narrow down 
//		//where to run the tests. See the following example:
//		DesiredCapabilities capability = DesiredCapabilities.firefox();
//		// say you use the redhat5 label to indicate RHEL5 and the amd64 label to specify the architecture
//		capability.setCapability("jenkins.label","redhat5 && amd64");
//		// Say you want a specific node to thread your request, just specify the node name (it must be running a selenium configuration though)
//		capability.setCapability("jenkins.nodeName","(master)");
//	}
//
//}
