package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenuLeft {

	public static final String PET_STORE_URL = "https://petstore.octoperf.com/actions/Catalog.action";
	public static final String FISH_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String DOGS_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String CATS_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String REPTILES_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String BIRDS_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String SIGNIN_URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";

	private static final String BTNJPETSTORE_XPATH = "//div[@id='LogoContent']//a//img";
	// Left Menu L
	private static final String BTNFISHL_XPATH = "//div[@id='Content']//a[1]//img[1]";
	private static final String BTNDOGSL_XPATH = "//div[@id='Content']//a[2]//img[1]";
	private static final String BTNCATSL_XPATH = "//div[@id='Content']//a[3]//img[1]";
	private static final String BTNREPTILESL_XPATH = "//div[@id='Content']//a[4]//img[1]";
	private static final String BTNBIRDSL_XPATH = "//div[@id='Content']//a[5]//img[1]";

	// Sign in btn
	private static final String BTNSIGNIN_XPATH = "//a[contains(text(),'Sign In')]";

	public static void getStorePetPage1(WebDriver wd) {
		wd.get(PET_STORE_URL);
	}

	public static WebElement getJStorePetPage(WebDriver driver) {
		return driver.findElement(By.xpath(BTNJPETSTORE_XPATH));
	}

	public static void clickJStorePetPage(WebDriver driver) {
		getJStorePetPage(driver).click();
	}

	// Left Menu
	// Fish
	public static void getFishPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNFISHL_XPATH)).click();
	}

	// Dog
	public static void getDogPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNDOGSL_XPATH)).click();
	}

	// Cat
	public static void getCatPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNCATSL_XPATH)).click();
	}

	// Reptiles
	public static void getReptilesPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNREPTILESL_XPATH)).click();
	}

	// Birds
	public static void getBirdsPage(WebDriver driver) {
		driver.findElement(By.xpath(BTNBIRDSL_XPATH)).click();

	}

	// Sig in
	public static WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(BTNSIGNIN_XPATH));
	}

	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();

	}
}
