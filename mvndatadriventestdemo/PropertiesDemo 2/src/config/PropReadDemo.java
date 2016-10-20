package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      Properties props = new Properties();
      
      FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\Employee.properties");
      
      props.load(ip);
      //properties are case-sensitive
      System.out.println(props.getProperty("name") + " is "+props.getProperty("age")+" years old");
      
      System.out.println(System.getProperty("user.dir"));
      
	}

}
