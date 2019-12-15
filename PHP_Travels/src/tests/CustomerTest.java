package tests;

import java.io.IOException;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import pages.TravelsCustomer;
import pages.TravelsLogin;

public class CustomerTest extends BasicTest {
	private String baseURL = "https://www.phptravels.net/admin";
	
	@BeforeTest
	public void basicLogin() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		Thread.sleep(2000);
		TravelsLogin tlg = new TravelsLogin(driver);
		tlg.signIn("admin@phptravels.com", "demoadmin");
	}
	
	@Test
	public void Customer() throws InterruptedException {

		TravelsCustomer tpc = new TravelsCustomer(driver);
		tpc.ClickOnAccounts();
		Thread.sleep(500);
		tpc.ClickOnCustomer();
		Thread.sleep(500);
		tpc.ClickEditCustomer();
		Thread.sleep(500);
		tpc.setFName("Milica");
		Thread.sleep(500);
		tpc.setLName("Stevanovic");
		Thread.sleep(500);
		tpc.setEmail("milicaStevanovic@gmail.com");
		Thread.sleep(500);
		tpc.setMobile("012345");
		Thread.sleep(500);
		tpc.setAddress1("UlicaiBroj");
		Thread.sleep(500);
		tpc.getCountry();
		Thread.sleep(500);
		tpc.Status();
		Thread.sleep(500);
		tpc.ClickOnEmailNews();
		Thread.sleep(500);
		tpc.ClickOnSubmit();
		Thread.sleep(2000);
		tpc.clickOnSearch();
		Thread.sleep(2000);
		tpc.setCeck("Milica");
		Thread.sleep(2000);
		tpc.ClickOnGo();
		Assert.assertFalse(tpc.getCustomer().getText().contains("Milica"));

	}
}
