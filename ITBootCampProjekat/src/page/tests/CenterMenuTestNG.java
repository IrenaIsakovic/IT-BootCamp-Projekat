package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.PetStoreMenuCenter;
import page.objects.PetStoreMenuLeft;
import page.objects.PetStoreMenuTop;

public class CenterMenuTestNG {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Irena\\Desktop\\zaHromija\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	// Center Menu
	public void fish() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver); // dohvatam glavnu stranu kataloga
		PetStoreMenuLeft.clickJStorePetPage(driver); // klikcem JStore na glavnoj strani kataloga
		// (to sam provalila da samo kad tuda udje na glavnu stranu kataloga ne pravi
		// one cudne url

		PetStoreMenuCenter.getFishPage(driver);// ovu metodu testiram
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.FISH_URL);
		sa.assertAll();

	}

	@Test
	// Top Menu
	public void dog() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuCenter.getDogPage(driver);// ovu metodu testiram
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.DOGS_URL);
		sa.assertAll();

	}

	@Test
	// Top Menu
	public void cat() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuCenter.getCatPage(driver);// ovu metodu testram
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.CATS_URL);
		sa.assertAll();

	}

	@Test
	// Top Menu
	public void reptiles() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuCenter.getReptilesPage(driver);// ovu metodu testiram
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.REPTILES_URL);
		sa.assertAll();

	}

	@Test
	// Top Menu
	public void birds() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenuLeft.getStorePetPage1(driver);
		PetStoreMenuLeft.clickJStorePetPage(driver);
		PetStoreMenuCenter.getBirdsPage(driver);// ovu metodu testiram
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenuLeft.BIRDS_URL);
		sa.assertAll();

	}
}