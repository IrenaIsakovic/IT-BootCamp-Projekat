package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static final String HOME_PAGE_URL = "https://petstore.octoperf.com/";
	private static final String ENTER_THE_STORE = "//a[contains(text(),'Enter the Store')]";

	public static void getHomePage(WebDriver wd) {
		wd.get(HOME_PAGE_URL);
	}

	public static WebElement getEnterStore(WebDriver driver) {
		return driver.findElement(By.xpath(ENTER_THE_STORE));
	}

	public static void clickEnterStore(WebDriver driver) {
		getEnterStore(driver).click();

	}
}
