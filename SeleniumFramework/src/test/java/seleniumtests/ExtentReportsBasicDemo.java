package seleniumtests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("GoogleSearch test", "This is test to validate search text Automtion Step By Step");
        
        String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path"+projectPath );
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver 2");
		
		driver = new ChromeDriver();
		
		// log(Status, details)
        test.log(Status.INFO, "Starting the Test Case)");
        
        driver.get("https://google.com/");
        test.pass("Navigated successfully to Google.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
        test.pass("Entered the search test as Automation Step By Step");
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test.pass("Hit Enter button to view the search results");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        try {
			test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        
        // test with snapshot
        try {
			test.addScreenCaptureFromPath("screenshot.png");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        
        driver.close();
        test.pass("Closed the browser");
        
        driver.quit();
        test.pass("Quit the browser");
        
        test.info("Test Completed");
        
        // calling flush writes everything to the log file
        extent.flush();
	}

}
