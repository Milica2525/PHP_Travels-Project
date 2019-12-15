package tests;




import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TravelsLogin;
import pages.TravelsTitle;
import pages.TravelsCars;

public class CarsTest extends BasicTest{
	
private String baseURL = "https://www.phptravels.net/admin";
	
	@BeforeTest
	public void basicLogin() throws InterruptedException{
		
		driver.get(baseURL);
		Thread.sleep(2000);
		TravelsLogin tlg = new TravelsLogin(driver);
		tlg.signIn("admin@phptravels.com", "demoadmin");
	}

	@Test(priority = 1)
	public void TravelsCars() throws InterruptedException {

		TravelsCars tcp = new TravelsCars(driver);
		tcp.ClickOnCars();
		tcp.ClickOnCars2();
		Thread.sleep(2000);

		TravelsTitle tp = new TravelsTitle(driver);
		Assert.assertTrue(tp.getTravelsTitle().contains("Cars Management"));
	}

	@Test(priority = 2)
	public void CarsName() throws InterruptedException {

		TravelsCars tcp = new TravelsCars(driver);
		tcp.isCars10();
		Assert.assertEquals(tcp.isCars10(), false);

	}

	@Test(priority = 3)
	public void CarsOrder() throws InterruptedException {

		TravelsCars tcp = new TravelsCars(driver);
		tcp.isOrdersMoreThen50();
		Assert.assertFalse(tcp.isOrdersMoreThen50());

	}
	@Test(priority = 4)
	public void AddCar() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin/cars");
		Thread.sleep(2000);
		TravelsCars tcp = new TravelsCars(driver);
		tcp.clickUpload();
		Thread.sleep(2000);
	    tcp.clickOnAdd();
		Thread.sleep(2000);
	    tcp.clickOnUpload();
		
	}		
}
