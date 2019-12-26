package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenuLeft;

public class HomePageNG {
	
	//Test za ulazak u Home Page i za ULAZAK U RADNJU
	WebDriver driver;

	@BeforeClass
	public void bf() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Irena\\Desktop\\zaHromija\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void f() {

		SoftAssert sa = new SoftAssert();
		HomePage.getHomePage(driver);
		sa.assertEquals(driver.getCurrentUrl(), HomePage.HOME_PAGE_URL);

		HomePage.clickEnterStore(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.PET_STORE_URL);

		sa.assertAll();
	}
}
