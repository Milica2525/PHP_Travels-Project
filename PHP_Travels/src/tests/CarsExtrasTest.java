package tests;



import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import pages.TravelsCars;
import pages.TravelsCarsExtras;
import pages.TravelsLogin;

public class CarsExtrasTest extends BasicTest{
	
private String baseURL = "https://www.phptravels.net/admin";
	
	@BeforeTest
	public void basicLogin() throws InterruptedException {
		
		driver.get(baseURL);
		Thread.sleep(2000);
		TravelsLogin tlg = new TravelsLogin(driver);
		tlg.signIn("admin@phptravels.com", "demoadmin");
	}
	
	
	
	@Test
	public void Extras() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin/cars/extras");
		Thread.sleep(1000);
		TravelsCars tcp = new TravelsCars(driver);
		tcp.ClickOnCars();
		Thread.sleep(1000);
		TravelsCarsExtras tep = new TravelsCarsExtras(driver);
		tep.Extras();
		Thread.sleep(2000);
		tep.Add();
		Thread.sleep(1000);
		tep.uploadImage("images\\slika.jpg");
		Thread.sleep(1000);
		tep.setName("Golf");
		Thread.sleep(1000);
		tep.setPrice("2000");
		Thread.sleep(1000);
		tep.Status();
		Thread.sleep(1000);
		tep.Save();
		Thread.sleep(1000);
		Assert.assertTrue(tep.carsExtrasAdded("Golf"));

	}
}
