package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pl.laita.PageObjects.MainPage;
import pl.laita.PageObjects.ReservationPage;
import pl.laita.PageObjects.SignOnPage;
import pl.laita.setup.Init;

public class ReservPageStepDefs extends Init {
	
	protected WebDriver driver;
	
	@Before
	public void init(){
		driver = getDriver();
	}
	
	
	
	@When("^I login as \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_login_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SignOnPage signon = new SignOnPage();
		signon.loginAs(arg1, arg2, driver);
	    
	}

	@When("^I choose on-way radio$")
	public void i_choose_on_way_radio() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReservationPage res = new ReservationPage();
		res.radio_oneWay(driver).click();
	}

	@When("^I choose \"([^\"]*)\" passengers$")
	public void i_choose_passengers(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReservationPage res = new ReservationPage();
		res.selectPassengersCount(driver, arg1);
	}

	@When("^I choose \"([^\"]*)\" from port$")
	public void i_choose_from_port(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReservationPage res = new ReservationPage();
		res.selectFromPort(driver, arg1);
	}

	@When("^I choose \"([^\"]*)\" from month$")
	public void i_choose_from_month(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReservationPage res = new ReservationPage();
		res.selectFromMonth(driver, arg1);
	}

	@When("^I choose \"([^\"]*)\" from day$")
	public void i_choose_from_day(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReservationPage res = new ReservationPage();
		res.selectFromDay(driver, arg1);
	}

	@When("^I choose \"([^\"]*)\" to port$")
	public void i_choose_to_port(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReservationPage res = new ReservationPage();
		res.selectToPort(driver, arg1);
	}

	@When("^I choose \"([^\"]*)\" to month$")
	public void i_choose_to_month(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReservationPage res = new ReservationPage();
		res.selectToMonth(driver, arg1);
	}

	@When("^I choose \"([^\"]*)\" to day$")
	public void i_choose_to_day(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReservationPage res = new ReservationPage();
		res.selectToDay(driver, arg1);
	}

	@Then("^form should be filled with date above$")
	public void form_should_be_filled_with_date_above() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
	}


}
