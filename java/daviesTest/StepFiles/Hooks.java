package daviesTest.StepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {
	static WebDriver driver;
	String path = "src\\test\\java\\daviesTest\\tools\\chromedriver.exe";
	String chrome = "Webdriver.chrome.driver";
	String homepage = "http://automationpractice.com/index.php";
	

	@Before
	public void setup() {
		System.setProperty(chrome, path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get(homepage);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;
	}
	
	
}
