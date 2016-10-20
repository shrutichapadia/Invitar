package example;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// any environment preparation like DB connection
		// read an external file in Data Driven test
		System.out.println("Preparing test Environment before testing maven");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// opening a browser maximise a browsers
		System.out.println("Opening a browser window");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("Closing the browser window");
	}

	@Test
	public void testLogin() {
		System.out.println("Testing loging functionality");
	}
	@Test
	public void testLogout() {
		System.out.println("Testing logout functionality");
	}

}
