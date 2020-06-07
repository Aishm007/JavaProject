package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		googleSearch();

	}
	
	public static void googleSearch() {

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path"+projectPath );
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver 2");
		
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		GoogleSearchPage.textBox_search(driver).sendKeys("AutomationStepByStep");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		GoogleSearchPage.searchButton(driver).sendKeys(Keys.RETURN);
	
		
		driver.close();
		driver.quit();
	}

}
