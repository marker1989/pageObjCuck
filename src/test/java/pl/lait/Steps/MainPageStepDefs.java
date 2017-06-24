package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pl.laita.PageObjects.MainPage;
import pl.laita.setup.Init;

public class MainPageStepDefs extends Init {

	protected WebDriver driver;

	@Before
	public void init() {
		driver = getDriver();

	}

	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Wrong page title", "Welcome: Mercury Tours", driver.getTitle());
	}

	@When("^I click link sign-on$")
	public void i_click_link_sign_on() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		MainPage main = new MainPage();
		main.link_signOn(driver).click();
	}

	@Then("^I should see login page$")
	public void i_should_see_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Wrong page title", "Sign-on: Mercury Tours", driver.getTitle());
	}

	@When("^I click link \"([^\"]*)\"$")
	public void i_click_link(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		MainPage main = new MainPage();
		main.link_click(driver, arg1).click();
	}

	@Then("^I should see \"([^\"]*)\" page title$")
	public void i_should_see_page_title(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Wrong page title", arg1, driver.getTitle());

	}

	@After
	public void end() {
		cleanUp();
	}

}