package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {

		/* calling the function */
		
		try {
			getProperties();
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}

	public static void getProperties() throws Exception {

		Properties prop = new Properties();
		String projPath = System.getProperty("user.dir");
		try {
			InputStream input = new FileInputStream(projPath+ "/src/test/java/config/config.properties");
			 prop.load(input);
			 String browser = prop.getProperty("browser");
			 System.out.println("Browser in the properties File is " +browser);
			 
		} catch (FileNotFoundException e) {
			System.out.println("Inside the Catch block");
			e.printStackTrace();
		}
	}

}
