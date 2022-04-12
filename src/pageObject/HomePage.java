package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver dvr;
	
	public HomePage(WebDriver driver) {
		dvr = driver;
	}
	
	// one Way Radio Button
	By oneWayBtn = By.xpath("//div[@data-testid='one-way-radio-button']/div[1]");
	
	// Round trip Radio Button
	By rndWayBtn = By.xpath("//div[@data-testid='round-trip-radio-button']/div[1]");
	
	//From City
	By frmCity  = By.xpath("//div[@data-testid='to-testID-origin']/div[1]/div[2]/input[1]");
	
	//To City
	By toCity  = By.xpath("//div[@data-testid='to-testID-destination']/div[1]/div[2]/input[1]");
	
	//Calendar
	By cal = By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']/div[2]");
	
	//number of Passenger
	By noPassenger  = By.xpath("//div[@data-testid='home-page-travellers']/div[2]");
	
	//add adult passenger
	By addAdult  = By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']");
	
	//add child passenger
	By addChild  = By.xpath("//div[@data-testid='Children-testID-plus-one-cta']");
	
	//search
	By searchFlight  = By.xpath("//div[@data-testid='home-page-flight-cta']");
	
	
	
	public WebElement oneWayRadioBtm() {
		return dvr.findElement(oneWayBtn);
	}
	
	public WebElement rndWayRadioBtm() {
		return dvr.findElement(rndWayBtn);
	}
	
	public WebElement fromCity() {
		return dvr.findElement(frmCity);
	}
	
	public WebElement toCity() {
		return dvr.findElement(toCity);
	}
	
	public WebElement noOfPassenger() {
		return dvr.findElement(noPassenger);
	}
	
	public WebElement addAdult() {
		return dvr.findElement(addAdult);
	}
	
	public WebElement calender() {
		return dvr.findElement(cal);
	}
	
	public WebElement addChild() {
		return dvr.findElement(addChild);
	}
	
	public WebElement searchFlight() {
		return dvr.findElement(searchFlight);
	}


}
