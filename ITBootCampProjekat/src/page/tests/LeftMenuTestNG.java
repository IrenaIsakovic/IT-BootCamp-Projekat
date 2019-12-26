package page.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenuLeft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class LeftMenuTestNG {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Irena\\Desktop\\zaHromija\\chromedriver.exe");
		driver = new ChromeDriver();
	}
// Testiranje levog menija
	@Test
	// Left Menu
	public void fish() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuLeft.getFishPage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.FISH_URL);
		sa.assertAll();

	}

	@Test
	// Left Menu
	public void dog() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuLeft.getDogPage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.DOGS_URL);
		sa.assertAll();

	}

	@Test
	// Left Menu
	public void cat() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuLeft.getCatPage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.CATS_URL);
		sa.assertAll();

	}

	@Test
	// Left Menu
	public void reptiles() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuLeft.getReptilesPage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.REPTILES_URL);
		sa.assertAll();

	}

	@Test
	// Left Menu
	public void birds() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuLeft.getBirdsPage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.BIRDS_URL);
		sa.assertAll();

	}
	@Test
	// Testiranje da li dugme sign in vodi na odgovarajucu stranicu
	public void signIn() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuLeft.clickSignIn(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.SIGNIN_URL);
		sa.assertAll();

	}
}
