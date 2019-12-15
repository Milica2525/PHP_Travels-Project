package pages;

import org.openqa.selenium.WebDriver;

public class TravelsTitle extends BasicPage{

	public TravelsTitle(WebDriver driver) {
		super(driver);
	}

	public String getTravelsTitle() {
		return this.driver.getTitle();
	}
}
