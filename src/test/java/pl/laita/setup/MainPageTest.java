package pl.laita.setup;

import pl.laita.PageObjects.MainPage;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;




public class MainPageTest extends Init {
	
	public static WebDriver driver;
	
	//@Before
	public void run(){
		driver = getDriver();
		
	}
	//@Ignore
	//@Test
	public void test1_mainMenu(){
		MainPage main  = new MainPage();
		main.link_contact(driver).click();
		main.link_signOn(driver).click();
		main.link_support(driver).click();
		main.link_register(driver).click();
	}

}
