package pl.laita.setup;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.laita.PageObjects.MainPage;
import pl.laita.PageObjects.ReservationPage;
import pl.laita.PageObjects.SignOnPage;
import pl.laita.setup.Init;

public class ReservationTest extends Init {
	
	protected static WebDriver driver;
	@Before
	public void run(){
		driver = getDriver();
		
	}
	 
	@Test
	public void reservation(){
	//przechodzimy w głównym menu do strony SIGN-ON
	MainPage mainPage = new MainPage();
	SignOnPage signOnPage = new SignOnPage();
	ReservationPage reservationPage = new ReservationPage();
	
	//przechodzimy w głównym menu do strony SIGN-ON
	mainPage.link_signOn(driver).click();
	//logujemy się jako adam_qwe/qwe123
	signOnPage.loginAs("adam_qwe", "qwe123",  driver);
	//wypełniamy pierwszą stronę rezerwacji lotów
	
	reservationPage.radio_oneWay(driver).click();
	reservationPage.selectPassengersCount(driver, "2");
	reservationPage.selectPassengersCount(driver).selectByVisibleText("3");
	
	reservationPage.selectFromPort(driver, "Frankfurt");
	reservationPage.selectFromMonth(driver, "July");
	reservationPage.selectFromDay(driver, "18");
	
	reservationPage.selectFromPort(driver, "Paris");
	reservationPage.selectFromMonth(driver, "July");
	reservationPage.selectFromDay(driver, "28");
	
	
	
	}

}
