package daviesTest.StepFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartSteps {
	
	WebDriver driver = Hooks.driver;
	Actions action = new Actions(driver);
	String regEmail = "ianw.f1@gmail.com";
	String correctPwd = "P455w0rd!";
	By loginButton = By.xpath("//a[@title='Log in to your customer account']");
	By loginEmail = By.id("email");
	By loginPassword = By.id("passwd");
	By loginSubmit = By.id("SubmitLogin");
	By tshirts = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]");
	By tshirtImg = By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	By quickView = By.xpath("//span[contains(text(),'Quick view')]");
	By addToCart = By.xpath("//span[contains(text(),'Add to cart')]");
	By addSuccess = By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]");
	

	@Given("^I have signed into my account$")
	public void i_have_signed_into_my_account() throws Throwable {
	    driver.findElement(loginButton).click();
	    Thread.sleep(2000);
	    driver.findElement(loginEmail).sendKeys(regEmail);
	    driver.findElement(loginPassword).sendKeys(correctPwd);
	    driver.findElement(loginSubmit).click();
	    Thread.sleep(2000);
	}

	@And("^have navigated to an in stock item profile that I wish to buy$")
	public void have_navigated_to_an_in_stock_item_profile_that_I_wish_to_buy() throws Throwable {
		
		driver.findElement(tshirts).click();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(tshirtImg)).perform();
		Thread.sleep(2000);
		driver.findElement(quickView).click();
		Thread.sleep(2000);
	}

	@When("^I click add to Cart$")
	public void i_click_Add_to_Cart() throws Throwable {
		driver.findElement(addToCart).click();
		Thread.sleep(3000);
	    
	}

	@Then("^the selected item should appear in my cart$")
	public void the_selected_item_should_appear_in_my_cart() throws Throwable {
	    Assert.assertEquals(true, driver.findElement(addSuccess).isDisplayed());
	    
	}

	@And("^hovered over an item to reveal the summary and options$")
	public void hovered_over_an_item_to_reveal_the_summary_and_options() throws Throwable {
		action.moveToElement(driver.findElement(tshirtImg)).perform();
		Thread.sleep(2000);
	    
	}
	
}


