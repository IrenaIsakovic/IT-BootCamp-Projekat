package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.objects.HomePage;
import page.objects.PetStoreMenuLeft;

public class HomePageTest {
	// test za ulazak na Home Page i za ULAZAK U RADNJU
	
	public static void homePageTest(WebDriver wd) {
		if (wd.getCurrentUrl().equals(HomePage.HOME_PAGE_URL)) {
			System.out.println("Uspesno ste usli na Home Page");
		} else {
			wd.navigate().to(HomePage.HOME_PAGE_URL);
			System.out.println("Niste uspesno testirali dohvatanje Home Page, ali ste na silu tamo.");
		}
	}

	public static void homePagePetStoreTest(WebDriver wd) {
		if (wd.getCurrentUrl().equals(PetStoreMenuLeft.PET_STORE_URL)) {
			System.out.println("Prosao je test za ULAZAK U RADNJU");
		} else {
			wd.navigate().to(PetStoreMenuLeft.PET_STORE_URL);
			System.out.println("Pao je test za ULAZAK U RADNJU, ali ste ipak tamo");
		}

	}
}
