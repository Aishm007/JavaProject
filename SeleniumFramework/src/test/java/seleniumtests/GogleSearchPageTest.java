package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GogleSearchPageTest {
	
	private static WebDriver driver = null;
	private static String text = "Automation Step By Step";
	public static void main(String[] args) {
		
		googleSearchtest();
	}

	public static void googleSearchtest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path"+projectPath );
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver 2");
		
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		searchPageObj.setText(text);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchPageObj.clickButton();
		
		driver.close();
		
		driver.quit();
	}
}
