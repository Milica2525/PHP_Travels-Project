package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsMenu extends BasicPage {
	private By Dashboard = By.cssSelector("#social-sidebar-menu li:nth-child(1) a");
	private By Updates = By.cssSelector("#social-sidebar-menu li:nth-child(2) a");
	private By Modules = By.cssSelector("#social-sidebar-menu li:nth-child(3) a");
	private By Tours = By.cssSelector("#social-sidebar-menu > li:nth-child(9) > a");
	private By Tours2 = By.cssSelector("#Tours > li:nth-child(2) > a");
	private By Cars = By.cssSelector("#social-sidebar-menu li:nth-child(10) a");
	private By Cars2 = By.cssSelector("#Cars > li:nth-child(1) > a");
	private By Coupons = By.cssSelector("#social-sidebar-menu li:nth-child(15) a");
	private By NewsLetter = By.cssSelector("#social-sidebar-menu li:nth-child(16) a");
	private By Bookings = By.cssSelector ("#social-sidebar-menu li:nth-child(17) a");
			

	public TravelsMenu(WebDriver driver) {
		super(driver);
	}
	
	public WebElement clickOnDashboard1() {
		return this.driver.findElement(this.Dashboard);
	}
	public WebElement clickOnUpdates() {
		return this.driver.findElement(this.Updates);
	}
	
	public WebElement clickOnModules() {
		return this.driver.findElement(this.Modules);
	}
	public WebElement clickOnTours() {
		return this.driver.findElement(this.Tours);
	}
	public WebElement clickOnTours2() {
		return this.driver.findElement(this.Tours2);
	}
	public WebElement clickOnCars() {
		return this.driver.findElement(this.Cars);
	}
	public WebElement clickOnCars2() {
		return this.driver.findElement(this.Cars2);
	}
	
	public WebElement clickOnCoupons() {
		return this.driver.findElement(this.Coupons);
	} 
	public WebElement clickOnNewsLetter() {
		return this.driver.findElement(this.NewsLetter);
	}
	public WebElement clickOnBookings() {
		return this.driver.findElement(this.Bookings);
	}
}
