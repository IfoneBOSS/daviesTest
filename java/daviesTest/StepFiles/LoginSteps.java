package daviesTest.StepFiles;



import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
WebDriver driver = Hooks.driver;
Hooks hooks;
String regEmail = "ianw.f1@gmail.com";
String correctPwd = "P455w0rd!";
String incorrectPwd = "Password1!";
String unregEmail = RandomStringUtils.randomAlphabetic(10) + "@mail.com";
By loginButton = By.xpath("//a[@title='Log in to your customer account']");
By createEmail = By.id("email_create");
By createButton = By.id("SubmitCreate");
By firstNameField = By.id("customer_firstname");
By alreadyRegistered = By.id("create_account_error");
By invalidEmail = By.xpath("//li[contains(text(),'Invalid email address.')]");
By loginEmail = By.id("email");
By loginPassword = By.id("passwrd");
By loginSubmit = By.id("SubmitLogin");
By emailError = By.xpath("//li[contains(text(),'An email address required.')]");
By passwordError = By.xpath("//li[contains(text(),'Password is required.')]");
By authFailError = By.xpath("//li[contains(text(),'Authentication failed.')]");
By invPasswordError = By.xpath("//li[contains(text(),'Invalid password.')]");
By signOut = By.xpath("//a[@title='Log me out']");


	@Given("^My browser is on the authentication page$")
	public void my_browser_is_on_the_authentication_page() throws Throwable {
	    driver.findElement(loginButton).click();
	    Thread.sleep(2000);
	}

	@Then("^I enter unregistered email address \"([^\"]*)\" into the Create an Account email address field$")
	public void i_enter_unregistered_email_address_into_the_Create_an_Account_email_address_field(String arg1) throws Throwable {
		  driver.findElement(createEmail).sendKeys(arg1);
		   Thread.sleep(1000);
	}

	@When("^I Click create an account$")
	public void i_Click_create_an_account() throws Throwable {
	    driver.findElement(createButton).click();
	    Thread.sleep(2000);
	    
	}

	@Then("^I should be taken to the user registration page$")
	public void i_should_be_taken_to_the_user_registration_page() throws Throwable {
	    Assert.assertEquals(true, driver.findElement(firstNameField).isDisplayed());
	    
	}

	@Then("^I enter the registered address email address \"([^\"]*)\" into the create an account email address field$")
	public void i_enter_the_registered_address_email_address_into_the_create_an_account_email_address_field(String arg1) throws Throwable {
	    driver.findElement(createEmail).sendKeys(arg1);
	    Thread.sleep(1000);
	    
	}

	@Then("^I should remain on the same page$")
	public void i_should_remain_on_the_same_page() throws Throwable {
		Assert.assertEquals(true, driver.findElement(createEmail).isDisplayed());
	    
	}

	@Then("^I should see an error message stating that the account has already been registered$")
	public void i_should_see_an_error_message_stating_that_the_account_has_already_been_registered() throws Throwable {
		Assert.assertEquals(true, driver.findElement(alreadyRegistered).isDisplayed());
	    
	}

	@Then("^I enter an invalid value \"([^\"]*)\" into the Create an Account email address field$")
	public void i_enter_an_invalid_value_into_the_Create_an_Account_email_address_field(String arg1) throws Throwable {
		 driver.findElement(createEmail).sendKeys(arg1);
		    Thread.sleep(1000);
	}

	@Then("^I should see an error message stating that a valid email address must be used$")
	public void i_should_see_an_error_message_stating_that_a_valid_email_address_must_be_used() throws Throwable {
		Assert.assertEquals(true, driver.findElement(invalidEmail).isDisplayed());
	    
	}
	
	@And("^I enter my registered email address into the login email field$")
	public void i_enter_my_registered_email_address_into_the_login_email_field() throws Throwable {
	    driver.findElement(loginEmail).sendKeys(regEmail);
	    
	}

	@And("^I enter a password into the password field$")
	public void i_enter_a_password_into_the_password_field() throws Throwable {
	    driver.findElement(loginPassword).sendKeys(correctPwd);
	}

	@When("^I click sign in$")
	public void i_click_sign_in() throws Throwable {
	    driver.findElement(loginSubmit).click();
	    
	}

	@Then("^I should be logged in successfully to my account$")
	public void i_should_be_logged_in_successfully_to_my_account() throws Throwable {
	    Assert.assertEquals(true, driver.findElement(signOut).isDisplayed());
	    
	}

	@And("^I enter an unregistered email into the login email field$")
	public void i_enter_an_unregistered_email_into_the_login_email_field() throws Throwable {
	    driver.findElement(loginEmail).sendKeys(unregEmail);
	    
	}

	@Then("^I should not be logged in$")
	public void i_should_not_be_logged_in() throws Throwable {
	    Assert.assertEquals(true, driver.findElement(loginSubmit).isDisplayed());
	    
	}

	@And("^should see an error message stating Authentication Failed$")
	public void should_see_an_error_message_stating_Authentication_Failed() throws Throwable {
		Assert.assertEquals(true, driver.findElement(authFailError).isDisplayed());
	    
	}

	@And("^I enter an incorrect password into the password field$")
	public void i_enter_an_incorrect_password_into_the_password_field() throws Throwable {
		driver.findElement(loginPassword).sendKeys(incorrectPwd);
	    
	}

	@And("^should see an error message stating Password is required$")
	public void should_see_an_error_message_stating_Password_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(passwordError).isDisplayed());
	    
	}

	@And("^should see error messages stating Email address and Password are both required$")
	public void should_see_error_messages_stating_Email_address_and_Password_are_both_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(emailError).isDisplayed());
	    
	}


}
