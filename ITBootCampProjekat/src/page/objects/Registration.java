package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static final String HOME_PAGE_URL = "https://petstore.octoperf.com/";
	public static final String REGSTER_PAGE_URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=/";

	// User Information
	private static final String TXTID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String TXTPASSWORD_XPATH = "//input[@name='password']";
	private static final String TXTCPASSWORD_XPATH = "//input[@name='repeatedPassword']";

	// Account Information
	private static final String TXTNAME_XPATH = "//input[@name='account.firstName']";
	private static final String TXTSNAME_XPATH = "//input[@name='account.lastName']";
	private static final String TXTMAIL_XPATH = "//input[@name='account.email']";
	private static final String TXTPHONE_XPATH = "//input[@name='account.phone']";
	private static final String TXTADDRESS1_XPATH = "//input[@name='account.address1']";
	private static final String TXTADDRESS2_XPATH = "//input[@name='account.address2']";
	private static final String TXTCITY_XPATH = "//input[@name='account.city']";
	private static final String TXTSTATE_XPATH = "//input[@name='account.state']";
	private static final String TXTPOSTAL_XPATH = "//input[@name='account.zip']";
	private static final String TXTCOUNTRY_XPATH = "//input[@name='account.country']";

	// Profile Information
	private static final String SELLANGUAGE_XPATH = "//select[@name='account.languagePreference']";
	private static final String SELECTFAVCAT_XPATH = "//select[@name='account.favouriteCategoryId']";
	private static final String ACCOUNTLIST_XPATH = "//input[@name='account.listOption']";
	private static final String ACCOUNTBANNER_XPATH = "//input[@name='account.bannerOption']";
	private static final String BTNSUBMIT_XPATH = "//input[@name='newAccount']";

	// UserInformation

	// ID
	public static WebElement getID(WebDriver driver) {
		return driver.findElement(By.xpath(TXTID_XPATH));
	}

	public static void clickID(WebDriver driver) {
		getID(driver).click();
	}

	public static void inputID(WebDriver driver, String data) {
		getID(driver).sendKeys(data);

	}
	public static void clearID(WebDriver driver) {
		getID(driver).clear();}

	// Password
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(TXTPASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}
	public static void clearPassword(WebDriver driver) {
		getPassword(driver).clear();
	}

	// ConfirmPassword
	public static WebElement getCPassword(WebDriver driver) {
		return driver.findElement(By.xpath(TXTCPASSWORD_XPATH));
	}

	public static void clickCPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputCPassword(WebDriver driver, String data) {
		getCPassword(driver).sendKeys(data);
	}
	public static void clearCPassword(WebDriver driver) {
		getPassword(driver).clear();
	}

	// Account Information

	// FirstName
	public static WebElement getName(WebDriver driver) {
		return driver.findElement(By.xpath(TXTNAME_XPATH));
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	public static void inputName(WebDriver driver, String data) {
		getName(driver).sendKeys(data);
	}

	public static void clearName(WebDriver driver) {
		getName(driver).clear();
	}

	// LastName
	public static WebElement getSName(WebDriver driver) {
		return driver.findElement(By.xpath(TXTSNAME_XPATH));
	}

	public static void clickSName(WebDriver driver) {
		getSName(driver).click();
	}

	public static void inputSName(WebDriver driver, String data) {
		getSName(driver).sendKeys(data);
	}

	public static void clearSName(WebDriver driver) {
		getSName(driver).clear();
	}

	// Email
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(TXTMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	public static void clearEmail(WebDriver driver) {
		getEmail(driver).clear();
	}

	// Phone
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(TXTPHONE_XPATH));
	}

	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	public static void inputPhone(WebDriver driver, String data) {
		getPhone(driver).sendKeys(data);
	}

	public static void clearPhone(WebDriver driver) {
		getPhone(driver).clear();
	}

	// Address1
	public static WebElement getAddress1(WebDriver driver) {
		return driver.findElement(By.xpath(TXTADDRESS1_XPATH));
	}

	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).click();
	}

	public static void inputAddress1(WebDriver driver, String data) {
		getAddress1(driver).sendKeys(data);
	}

	public static void clearAddress1(WebDriver driver) {
		getAddress1(driver).clear();
	}

	// Address2
	public static WebElement getAddress2(WebDriver driver) {
		return driver.findElement(By.xpath(TXTADDRESS2_XPATH));
	}

	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).click();
	}

	public static void inputAddress2(WebDriver driver, String data) {
		getAddress2(driver).sendKeys(data);
	}

	public static void clearAddress2(WebDriver driver) {
		getAddress2(driver).clear();
	}

	// City
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(TXTCITY_XPATH));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	public static void inputCity(WebDriver driver, String data) {
		getCity(driver).sendKeys(data);
	}

	public static void clearCity(WebDriver driver) {
		getCity(driver).clear();
	}

	// State
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(TXTSTATE_XPATH));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	public static void inputState(WebDriver driver, String data) {
		getState(driver).sendKeys(data);
	}

	public static void clearState(WebDriver driver) {
		getState(driver).clear();
	}

	// PostalCode
	public static WebElement getPostal(WebDriver driver) {
		return driver.findElement(By.xpath(TXTPOSTAL_XPATH));
	}

	public static void clickPostal(WebDriver driver) {
		getPostal(driver).click();
	}

	public static void inputPostal(WebDriver driver, String data) {
		getPostal(driver).sendKeys(data);
	}

	public static void clearPostal(WebDriver driver) {
		getPostal(driver).clear();
	}

	// Country
	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(TXTCOUNTRY_XPATH));
	}

	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).sendKeys(data);
	}

	public static void clearCountry(WebDriver driver) {
		getCountry(driver).clear();
	}

	// Profile Information
	// Language
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELLANGUAGE_XPATH)));
	}

	public static void inputLanguage(WebDriver driver, String data) {
		getLanguage(driver).selectByVisibleText(data);
	}

	// Favorite Category
	public static Select getCategory(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECTFAVCAT_XPATH)));
	}

	public static void inputCategory(WebDriver driver, String data) {
		getCategory(driver).selectByVisibleText(data);
	}

	// My LIst
	public static WebElement getMyList(WebDriver driver) {
		return driver.findElement(By.xpath(ACCOUNTLIST_XPATH));
	}

	public static void clicMyList(WebDriver driver) {
		getCountry(driver).click();
	}

	// MyBanner
	public static WebElement getMyBanner(WebDriver driver) {
		return driver.findElement(By.xpath(BTNSUBMIT_XPATH));
	}

	public static void clickMyBanner(WebDriver driver) {
		getMyBanner(driver).click();
	}

	/// Submit
	public static void getSubmitBtn(WebDriver driver) {
		driver.findElement(By.xpath(BTNSUBMIT_XPATH)).click();
		;
	}

}
