package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import main.Main;

public class IzmenaReg {
	
	//izmena registrovanog jednog iz tabele
		public static void izmena(int i) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Irena\\Desktop\\zaHromija\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			

			ExcelUtils.setExcell("Data.xls");
			ExcelUtils.setWorkSheet(0);
			 i = 49;

			String password, firstName, lastName, email, phone, address1, address2, city, state, zip, country;
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
			System.out.println(address2);

			
			IzmenaPodataka.clearName(driver);
			IzmenaPodataka.inputName(driver, firstName);
			
			IzmenaPodataka.clearSName(driver);
			IzmenaPodataka.inputSName(driver, lastName);
			
			IzmenaPodataka.clearEmail(driver);
			IzmenaPodataka.inputEmail(driver, email);
			
			IzmenaPodataka.clearPhone(driver);
			IzmenaPodataka.inputPhone(driver, phone);
			
			IzmenaPodataka.clearAddress1(driver);
			IzmenaPodataka.inputAddress1(driver, address1);
			
			IzmenaPodataka.clearAddress2(driver);
			IzmenaPodataka.inputAddress2(driver, address2);
			
			IzmenaPodataka.clearCity(driver);
			IzmenaPodataka.inputCity(driver, city);
			
			IzmenaPodataka.clearState(driver);
			IzmenaPodataka.inputState(driver, state);
			
			IzmenaPodataka.clearPostal(driver);
			IzmenaPodataka.inputPostal(driver, zip);
			
			IzmenaPodataka.clearCountry(driver);
			IzmenaPodataka.inputCountry(driver, country);
			
			
			IzmenaPodataka.getSubmitBtn(driver);
			Main.wait2();
			IzmenaPodataka.getMyAccountBtn(driver);
			
		}
	}


