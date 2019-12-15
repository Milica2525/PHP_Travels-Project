package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TravelsLogin;
import pages.TravelsMenu;

public class MenuTest extends BasicTest{
	
	private String baseURL = "https://www.phptravels.net/admin";
	
	@BeforeTest
	public void basicLogin() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		Thread.sleep(2000);
		TravelsLogin tlg = new TravelsLogin(driver);
		tlg.signIn("admin@phptravels.com", "demoadmin");
	}
	
	
	
	
	@Test(priority = 10)
	public void TrsMenu() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get(baseURL);
		Thread.sleep(3000);
		TravelsMenu tlm = new TravelsMenu(driver);
		tlm.clickOnUpdates().click();
		tlm.clickOnModules().click();
		tlm.clickOnTours().click();
		tlm.clickOnTours2().click();
		tlm.clickOnCars().click();
		Thread.sleep(1000);
		tlm.clickOnCars2().click();
		tlm.clickOnCoupons().click();
		tlm.clickOnNewsLetter().click();
		tlm.clickOnBookings().click();
		tlm.clickOnBookings().click();
		
		Thread.sleep(2000);
	}
}
