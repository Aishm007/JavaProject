package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_GoogleSearch {

	static WebDriver driver = null;
	
	@BeforeTest
	public void setupTest() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path"+projectPath );
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver 2");
		
	}
	
	@Test
	public static void googleSearch() {

		driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.click();		
		element.sendKeys("AutomationStepByStep");
		
		//driver.findElement(By.name("btnK")).click();
		//System.out.println("Hit on Google Search button");
		
		//Hit EnterKey
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println("Hit Enter Key");
		
		System.out.println("Test completed Successfully");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		

	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully and browser closed.");
	}
}
