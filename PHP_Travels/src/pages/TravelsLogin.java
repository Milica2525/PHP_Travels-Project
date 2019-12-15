package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelsLogin extends BasicPage {
	
	private By email = By.name("email");
	private By password = By.name("password");
	private By loginBtn = By.cssSelector("[type = 'submit']");
	private By Remember = By.cssSelector(".iCheck-helper");
	private By ForgotPass = By.id("link-forgot");
	
	public TravelsLogin(WebDriver driver) {
		super(driver);
	}

	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		this.driver.findElement(this.loginBtn).click();	
	}
	
	public void clickOnRemember() {
		this.driver.findElement(this.Remember).click();	
	}
	
	public void clickOnForgotPass() {
		this.driver.findElement(this.ForgotPass).click();	
	}
	
	
	public void signIn(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.clickOnRemember();
		this.clickOnLoginBtn();
	}
	
}
