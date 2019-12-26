package main;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;
import page.objects.IzmenaPodataka;
import page.objects.IzmenaReg;
import page.objects.PetStoreMenuLeft;
import page.objects.RegUpisOne;
import page.tests.HomePageTest;
import page.tests.RegistrationTest;

public class Main {

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		//Pokretanje testa za Home Page i ULAZAK U RADNJU
		 //System.setProperty("webdriver.chrome.driver",
		 //"C:\\Users\\Irena\\Desktop\\zaHromija\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		/*
		 * HomePage.getHomePage(driver); HomePageTest.homePageTest(driver); wait2();
		 * HomePage.clickEnterStore(driver); HomePageTest.homePagePetStoreTest(driver);
		 */
		//1.1021979E7
		
		
		//ovo je test da li smo uspesno registrovali korisnika. 
		//Ako jesmo, mozemo ga uspesno ulogovati.
		
		wait2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("upisite red za logovanje:"); //ovo je red iz tabele .xls
		int i = sc.nextInt();
		RegistrationTest.signIn(i);

	
		

	}
}
