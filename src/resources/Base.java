package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver intializeDriver() {
		//System.setProperty("webdriver.chrome.driver", "D:/Selenium/Udemy_selenium_course/driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		return driver;
		
	}
	

}
