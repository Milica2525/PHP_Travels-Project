package pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCars extends BasicPage{


	private By Cars1 = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By Cars2 = By.cssSelector("#Cars > li:nth-child(1) > a");
	private By cars = By.cssSelector(".xcrud-row");
	private List<WebElement> listCars = driver.findElements(this.cars);
	private By Orders = By.cssSelector(".form-control.input-sm");
	private By UploadPhoto = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[9]/a");
	private By AddPhoto = By.cssSelector("a.btn.btn-success");
	private By Photo = By.cssSelector("input.dz-hidden-input");

	public TravelsCars(WebDriver driver) {
		super(driver);

	}

	public WebElement getCars() {
		return this.driver.findElement(Cars1);
	}

	public WebElement getCars2() {
		return this.driver.findElement(Cars2);
	}

	public void ClickOnCars() {
		this.getCars().click();
	}

	public void ClickOnCars2() {
		this.getCars2().click();
	}

	public boolean isCars10() {
		boolean cars1 = false;
		WebElement cars = driver.findElement(this.cars);
		if (listCars.size() == 10) {
			cars1 = true;
		}
		return cars1;
	}

	public boolean isOrdersMoreThen50() {
		boolean orders = false;
		int sumOrder = 0;
		WebElement orderNumber = driver.findElement(this.Orders);
		List<WebElement> cars = driver.findElements(this.Orders);
		for (int i = 0; i < cars.size(); i++) {
			String str = cars.get(i).getAttribute("value");
			int number = Integer.valueOf(str);
			sumOrder += number;
		}
		if (sumOrder > 50) {
			orders = true;
		}
		return orders;
	}

	public void clickUpload() {
		this.driver.findElement(this.UploadPhoto).click();
	}

	public void clickOnAdd() {
		this.driver.findElement(this.AddPhoto).click();
	}

	public void clickOnUpload() {
		WebElement uploadPicture = driver.findElement(By.cssSelector("input.dz-hidden-input"));
		uploadPicture.sendKeys("C:\\Users\\Steva\\Desktop\\golf.jpg");
	}
	
}
