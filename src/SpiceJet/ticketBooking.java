package SpiceJet;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObject.HomePage;
import resources.Base;

public class ticketBooking extends Base {
	
	
	@Test
	public void Booking() throws InterruptedException {
		
		driver = intializeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		HomePage hp = new HomePage(driver);
		hp.oneWayRadioBtm().click();
		hp.fromCity().click();
		hp.fromCity().sendKeys("del");
		hp.toCity().click();
		Thread.sleep(2000);
		hp.toCity().sendKeys("che");
		Thread.sleep(5000);
		
		hp.calender().click();
		hp.noOfPassenger().click();
		hp.addAdult().click();
		hp.addChild().click();
		hp.noOfPassenger().click();
		hp.searchFlight().click();
		
	}

}
