package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import main.Main;
import page.objects.ExcelUtils;

public class RegUpisMore {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Irena\\Desktop\\zaHromija\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Registration.REGSTER_PAGE_URL);

		ExcelUtils.setExcell("Data.xls");
		ExcelUtils.setWorkSheet(0);
		int i = 1;
		int j = 0;

		for (j = 0; j < 50; j++) {
			for (i = 1; i < 12; i++) {

			}

			String userID, password, firstName, lastName, email, phone, address1, address2, city, state, zip, country;
			userID = ExcelUtils.getDataAt(i, 0);
			password = ExcelUtils.getDataAt(i, 1);
			firstName = ExcelUtils.getDataAt(i, 2);
			lastName = ExcelUtils.getDataAt(i, 3);
			email = ExcelUtils.getDataAt(i, 4);
			phone = ExcelUtils.getDataAt(i, 5);
			address1 = ExcelUtils.getDataAt(i, 6);
			address2 = ExcelUtils.getDataAt(i, 7);
			city = ExcelUtils.getDataAt(i, 8);
			state = ExcelUtils.getDataAt(i, 9);
			zip = ExcelUtils.getDataAt(i, 10);
			country = ExcelUtils.getDataAt(i, 11);
			System.out.println(userID);

			Registration.inputID(driver, userID);
			Registration.inputPassword(driver, password);
			Registration.inputCPassword(driver, password);
			Registration.inputName(driver, firstName);
			Registration.inputSName(driver, lastName);
			Registration.inputEmail(driver, email);
			Registration.inputPhone(driver, phone);
			Registration.inputAddress1(driver, address1);
			Registration.inputAddress2(driver, address2);
			Registration.inputCity(driver, city);
			Registration.inputState(driver, state);
			Registration.inputPostal(driver, zip);
			Registration.inputCountry(driver, country);
			Registration.getSubmitBtn(driver);
			driver.get(Registration.REGSTER_PAGE_URL);

			Registration.clearID(driver);
			Registration.clearPassword(driver);
			Registration.clearCPassword(driver);		
			Registration.clearName(driver);
			Registration.clearSName(driver);
			Registration.clearEmail(driver);
			Registration.clearPhone(driver);
			Registration.clearAddress1(driver);
			Registration.clearAddress2(driver);
			Registration.clearCity(driver);
			Registration.clearState(driver);
			Registration.clearPostal(driver);
			Registration.clearCountry(driver);
			

		}
	}
}