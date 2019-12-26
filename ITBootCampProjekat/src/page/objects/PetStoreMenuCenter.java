package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenuCenter {

	public static final String PET_STORE_URL = "https://petstore.octoperf.com/actions/Catalog.action";

	// Center Menu C
	private static final String BTNBIRDSBIGC_XPATH = "//body//area[1]";
	private static final String BTNFISHC_XPATH = "//body//area[2]";
	private static final String BTNDOGSC_XPATH = "//body//area[3]";
	private static final String BTNREPTILESC_XPATH = "//body//area[4]";
	private static final String BTNCATSC_XPATH = "//body//area[5]";
	private static final String BTNBIRDSC_XPATH = "//body//area[6]";

	// Sign in btn
	private static final String BTNSIGNIN_XPATH = "//a[contains(text(),'Sign In')]";

	public static void getStorePetPage(WebDriver wd) {
		wd.get(PET_STORE_URL);
	}

	// Center Menu
	// Fish
	public static void getFishPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNFISHC_XPATH)).click();
	}

	// Dog
	public static void getDogPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNDOGSC_XPATH)).click();
	}

	// Cat
	public static void getCatPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNCATSC_XPATH)).click();
	}

	// Reptiles
	public static void getReptilesPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNREPTILESC_XPATH)).click();
	}

	// Birds
	public static void getBirdsPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNBIRDSC_XPATH)).click();
	}
	
	// Birds
		public static void getBirdsBigPage(WebDriver driver) {
			driver.findElement(By.xpath(BTNBIRDSBIGC_XPATH)).click();
		}


}
