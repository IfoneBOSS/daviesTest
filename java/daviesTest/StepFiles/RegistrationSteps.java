package daviesTest.StepFiles;


import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;



public class RegistrationSteps {
	WebDriver driver = Hooks.driver;
	String email = RandomStringUtils.randomAlphabetic(10) + "@mail.com";
	By theLoginButton = By.className("login");
	By createEmail = By.id("email_create");
	By createButton = By.id("SubmitCreate");
	By firstNameField = By.id("customer_firstname");
    By firstName = By.id("customer_firstname");
    By lastName = By.id("customer_lastname");
    By emailAddress = By.id("email");
    By password = By.id("passwd");
    By adFirstName = By.id("firstname");
    By adLastName = By.id("lastname");
    By address = By.id("address1");
    By city = By.id("city");
    By state = By.id("id_state");
    By stateOpt1 = By.xpath("//option[contains(text(),'Alabama')]");
    By postcode = By.id("postcode");
    By country = By.id("id_country");
    By countryOpt1 = By.xpath("//select[@id='id_country']//option[contains(text(),'-')]");
    By homePhone = By.id("phone");
    By mobPhone = By.id("phone_mobile");
    By alias = By.id("alias");
    By submitAccount = By.id("submitAccount");
    By signOut = By.xpath("//a[@title='Log me out']");
    
    By firstNameError = By.xpath("//b[contains(text(),'firstname')]");
    By lastNameError = By.xpath("//b[contains(text(),'lastname')]");
    By passwordError = By.xpath("//b[contains(text(),'passwrd')]");
    By emailError = By.xpath("//b[contains(text(),'email')]");
    By addressError = By.xpath("//b[contains(text(),'address1')]");
    By cityError = By.xpath("//b[contains(text(),'city')]");
    By postcodeError = By.xpath("//li[contains(text(),'The Zip/Postal code')]");
    By countryError = By.xpath("//b[contains(text(),'id country')]");
    By stateError = By.xpath("//li[contains(text(),'This country requires you to choose a State.')]");
    By phoneError = By.xpath("//li[contains(text(),'You must register at least one phone number.')]");
    
	
	@Given("^My browser is on the user registration page$")
	public void my_browser_is_on_the_user_registration_page() throws Throwable {
		
		driver.findElement(theLoginButton).click();
	    Thread.sleep(2000);
	    driver.findElement(createEmail).sendKeys(email);
	    driver.findElement(createButton).click();
	    Thread.sleep(2000);
	    
	}

	@And("^I have entered a first name$")
	public void i_have_entered_a_first_name() throws Throwable {
	    driver.findElement(firstName).sendKeys("Testy");
	    
	}

	@And("^I have entered a last name$")
	public void i_have_entered_a_last_name() throws Throwable {
		driver.findElement(lastName).sendKeys("McGhee");
	    
	}

	@And("^I have entered a password$")
	public void i_have_entered_a_password() throws Throwable {
		driver.findElement(password).sendKeys("P455w0rd!");
	    
	}

	@And("^I have entered an address$")
	public void i_have_entered_an_address() throws Throwable {
		driver.findElement(address).sendKeys("123 Test Drive");
	    
	}

	@And("^I have entered a city$")
	public void i_have_entered_a_city() throws Throwable {
		driver.findElement(city).sendKeys("Testopolis");
	    
	}

	@And("^I have entered a zip code$")
	public void i_have_entered_a_zip_code() throws Throwable {
		driver.findElement(postcode).sendKeys("12345");
	    
	}

	@And("^I have selected a state$")
	public void i_have_selected_a_state() throws Throwable {
		driver.findElement(state).click();
		driver.findElement(stateOpt1).click();
	    
	}

	@And("^I have entered a mobile phone number$")
	public void i_have_entered_a_mobile_phone_number() throws Throwable {
	    driver.findElement(mobPhone).sendKeys("07123123123");
	    
	}

	@When("^I click register$")
	public void i_click_register() throws Throwable {
	    driver.findElement(submitAccount).click();
	    Thread.sleep(2000);
	}

	
	@Then("^I should be sent to the My Account page$")
	public void i_should_be_sent_to_the_My_Account_page() throws Throwable {
		Assert.assertEquals(true, driver.findElement(signOut).isDisplayed());
	    
	}

	@And("^I have entered a home phone number$")
	public void i_have_entered_a_home_phone_number() throws Throwable {
		 driver.findElement(homePhone).sendKeys("01234123123");
	    
	}

	@Then("^my account should not be created$")
	public void my_account_should_not_be_created() throws Throwable {
		Assert.assertEquals(true, driver.findElement(firstName).isDisplayed());
	    
	}

	@And("^I should see an error message stating First Name is required$")
	public void i_should_see_an_error_message_stating_First_Name_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(firstNameError).isDisplayed());
	    
	}

	@And("^I should see an error message stating last name is required$")
	public void i_should_see_an_error_message_stating_last_name_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(lastNameError).isDisplayed());
	    
	}

	@And("^I have deleted the contents of the email address field$")
	public void i_have_deleted_the_contents_of_the_email_address_field() throws Throwable {
	    driver.findElement(emailAddress).clear();
	    
	}

	@And("^I should see an error message stating email address is required$")
	public void i_should_see_an_error_message_stating_email_address_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(emailError).isDisplayed());
	    
	}

	@And("^I should see an error message stating password is required$")
	public void i_should_see_an_error_message_stating_password_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(passwordError).isDisplayed());
	    
	}

	@And("^I should see an error message stating address is required$")
	public void i_should_see_an_error_message_stating_address_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(addressError).isDisplayed());
	    
	}

	@And("^I should see an error message stating city is required$")
	public void i_should_see_an_error_message_stating_city_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(cityError).isDisplayed());
	    
	}

	@And("^I should see an error message stating zip code is required$")
	public void i_should_see_an_error_message_stating_zip_code_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(postcodeError).isDisplayed());
	    
	}

	@And("^I should see an error message stating that state is required$")
	public void i_should_see_an_error_message_stating_that_state_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(stateError).isDisplayed());
	    
	}

	@And("^I have deleted the entered country$")
	public void i_have_deleted_the_entered_country() throws Throwable {
		driver.findElement(country).click();
		driver.findElement(countryOpt1).click();
		Thread.sleep(2000);
		    
	}

	@And("^I should see an error message stating that country is required$")
	public void i_should_see_an_error_message_stating_that_country_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(countryError).isDisplayed());
	    
	}

	@And("^I should see an error message stating that at least one phone number is required$")
	public void i_should_see_an_error_message_stating_that_at_least_one_phone_number_is_required() throws Throwable {
		Assert.assertEquals(true, driver.findElement(phoneError).isDisplayed());
	    
	}


}
