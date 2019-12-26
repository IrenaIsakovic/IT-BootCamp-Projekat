package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInAndLogOut {
	
	public static final String SIGN_IN_URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	private static final String TXTID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	private static final String TXTPASSWORD_XPATH = "//input[@name='password']";
	private static final String BTNSIGNIN_XPATH = "//input[@name='signon']";
	private static final String BTNSIGNOUT_XPATH = "//a[contains(text(),'Sign Out')]";
	private static final String WELCOME_XPATH = "//a[contains(text(),'Sign Out')]";

//Metode za logovanje
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
	// Password
	public static WebElement getPassword(WebDriver driver) {
			return driver.findElement(By.xpath(TXTPASSWORD_XPATH));
		}
	public static void clickPassword(WebDriver driver) {
			getPassword(driver).click();
		}
	public static void clearPassword(WebDriver driver) {
		getPassword(driver).clear();}
	
	public static void inputPassword(WebDriver driver, String data) {
			getPassword(driver).sendKeys(data);
		}

	/// Submit
	public static void getSubmitBtn(WebDriver driver) {
		driver.findElement(By.xpath(BTNSIGNIN_XPATH)).click();}
	
		
		public static WebElement getWelcomeBtn(WebDriver driver) {
			return driver.findElement(By.xpath(WELCOME_XPATH));
	}
	
	//Metode za izlogivanje :)
	
	public static WebElement getSignOutBtn(WebDriver driver) {
		return driver.findElement(By.xpath(BTNSIGNOUT_XPATH));}
	
	public static void clickSignOutBtn(WebDriver driver) {
		getSignOutBtn(driver).click();
		
		
	

}}
