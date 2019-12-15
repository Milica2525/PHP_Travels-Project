package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsLogin;
import pages.TravelsTitle;

public class ExcelLoginTest extends BasicTest{
	private String baseUrl = "https://www.phptravels.net/admin";

	@Test
	public void LoginExcell() throws InterruptedException, IOException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		File file = new File("Username.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String Username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		TravelsLogin tlp = new TravelsLogin(driver);

		tlp.signIn(Username, password);
		Thread.sleep(2000);
		wb.close();

		TravelsTitle tp = new TravelsTitle(driver);
		Assert.assertTrue(tp.getTravelsTitle().contains("Dashboard"));
	}
}
