package pl.laita.setup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {
	
	//static FirefoxDriver driver
	static WebDriver driver;
	
	public static WebDriver getDriver(){
		
		if(driver ==null){
			
			
			URL hubUr1 = null;
			
			try{
				hubUr1 = new URL("http://192.168.0.119:4444/wd/hub/");
			}catch (MalformedURLException e){
				
			}
			
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			
			//driver = new FirefoxDriver();
			driver = new RemoteWebDriver(hubUr1, cap);
			//driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}else{
			return driver;
			
		}
	}
	
	
	public static void close(){
		driver.close();
		driver.quit();
		driver = null;
	}
	
	@After
	public void cleanUp(){
		close();
	}
}
