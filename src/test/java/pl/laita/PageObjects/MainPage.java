package pl.laita.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	
	static String singOnLinkText = "SIGN-ON";
	static String contactLinkTest = "CONTACT";
	static String supportLinkText = "SUPPORT";
	static String registerLinkText = "REGISTER";
	
	
	
	
	public WebElement link_signOn(WebDriver driver){
		return driver.findElement(By.linkText(singOnLinkText));
		
	}
	
	public WebElement link_contact(WebDriver driver){
		return driver.findElement(By.linkText(contactLinkTest));
		
	}

	public WebElement link_support(WebDriver driver){
		return driver.findElement(By.linkText(supportLinkText));
	}
		public WebElement link_register1(WebDriver driver){
			return driver.findElement(By.linkText(registerLinkText));
			
		}
		public WebElement link_register(WebDriver driver){
			return driver.findElement(By.linkText(registerLinkText));
		}

		public WebElement link_click(WebDriver driver, String arg1) {
			// TODO Auto-generated method stub
			return driver.findElement(By.linkText(arg1));
		}
		
		
		
	}

