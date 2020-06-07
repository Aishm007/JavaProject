import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path"+projectPath );
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.click();		
		element.sendKeys("AutomationStepByStep");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//WebDriver driver = new InternetExplorerDriver();
		
		//driver.close();
		//driver.quit();
		
	}
}
