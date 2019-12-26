package page.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.ExcelUtils;
import page.objects.PetStoreMenuLeft;
import page.objects.Registration;
import page.objects.SignInAndLogOut;

public class RegistrationTest {

//test za registrovanje
	public static void signIn(int i) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Irena\\Desktop\\zaHromija\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(SignInAndLogOut.SIGN_IN_URL);

		ExcelUtils.setExcell("Data.xls");
		ExcelUtils.setWorkSheet(0);

		String userID, password;
		userID = ExcelUtils.getDataAt(i, 0);
		password = ExcelUtils.getDataAt(i, 1);

		SignInAndLogOut.inputID(driver, userID);
		SignInAndLogOut.clearPassword(driver);
		SignInAndLogOut.inputPassword(driver, password);
		SignInAndLogOut.getSubmitBtn(driver);
		
		

		if (SignInAndLogOut.getWelcomeBtn(driver).isDisplayed()) {
			System.out.println("Uspesno ste se ulogovali, sto znaci da ste uspesno registrovali osobu");
		} else {
			System.out.println("Niste se uspesno ulogovali");
		}
		/*// test za izlogivanje- ako se klikom na signout ode na stranicu koja ima
		// signin, znaci da je uspelo
		SignInAndLogOut.clickSignOutBtn(driver);
		if (PetStoreMenuLeft.getSignIn(driver).isDisplayed()) {
			System.out.println("Uspesno ste se izlogovali");
		} else {
			System.out.println("Niste se uspesno izlogovali");
		}*/
	}
}
