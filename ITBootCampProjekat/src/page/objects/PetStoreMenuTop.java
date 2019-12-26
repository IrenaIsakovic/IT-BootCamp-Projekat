package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenuTop {

	public static final String PET_STORE_URL = "https://petstore.octoperf.com/actions/Catalog.action";

	// Top Menu T
	private static final String BTNFISHT_XPATH = "//div[@id='QuickLinks']//a[1]//img[1]";
	private static final String BTNDOGST_XPATH = "//div[@id='Header']//a[2]//img[1]";
	private static final String BTNREPTILEST_XPATH = "//div[@id='Header']//a[3]//img[1]";
	private static final String BTNCATST_XPATH = "//div[@id='Header']//a[4]//img[1]";
	private static final String BTNBIRDST_XPATH = "//div[@id='Header']//a[5]//img[1]";

	// Sign in btn
	private static final String BTNSIGNIN_XPATH = "//a[contains(text(),'Sign In')]";


	// Top Menu
	// Fish
	public static void getFishPage(WebDriver driver) {
	 driver.findElement(By.xpath(BTNFISHT_XPATH)).click();
	}

	
	// Dog
	public static void getDogPage(WebDriver driver) {
	 driver.findElement(By.xpath(BTNDOGST_XPATH)).click();
	}


	// Cat
	public static void getCatPage(WebDriver driver) {
	 driver.findElement(By.xpath(BTNCATST_XPATH)).click();
	}

	// Reptiles
	public static void getReptilesPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNREPTILEST_XPATH)).click();
	}


	// Birds
	public static void getBirdsBtn(WebDriver driver) {
		driver.findElement(By.xpath(BTNBIRDST_XPATH)).click();
	}

}
