package example;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class New {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class statement execute");
	}

	@Test
	public void test1() {
	//	driver.findElements("")
		System.out.println("Test  statement execute");
	}
	@Test
	public void test2() {
	//	driver.findElements("")
		System.out.println("Test2  statement execute");
	}
	@Test
	public void test3() {
	//	driver.findElements("")
		System.out.println("Test3  statement execute");
	}
	@Ignore
	public void test4() {
	//	driver.findElements("")
		System.out.println("Test4  statement execute");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class statement execute");
	}

}
