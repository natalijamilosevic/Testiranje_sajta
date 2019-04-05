package page.tests;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import page.objects.PostPage;
import page.objects.HomePage;
import utility.Constant;
import utility.ExcelUtils;

public class HomepageTest {

// Log out
	public static void logOut(WebDriver driver) {
		PostPage.clickLogOut(driver);
	}

// Brisanje (jednog) posta
	public static void deletePost(WebDriver driver, int i) {
		HomePage.clickMore(driver, i);
		HomePage.clickDelete(driver, i);
	}

// Brisanje vise postova
	public static void deletePosts(WebDriver driver, int p) {
		for (int i = 0, j = 0; j < p; j++) {
			deletePost(driver, i);
		}
	}

// Editovanje posta - unosenje podataka preko skenera
	public static void editPost(WebDriver driver, int i) {
		Scanner sc = new Scanner(System.in);

// Dugme More options 
		HomePage.clickMore(driver, i);

// Edit dugme
		HomePage.clickEdit(driver, i);

// Naziv
		System.out.println("Unesi naziv: ");
		String naziv = sc.nextLine();
		HomePage.clickEditNaziv(driver);
		HomePage.sendKeysEditNaziv(driver, naziv);

// Lokacija
		System.out.println("Unesi lokacija: ");
		String lokacija = sc.nextLine();
		HomePage.clickEditLokacija(driver);
		HomePage.sendKeysEditLokacija(driver, lokacija);

// Opis
		System.out.println("Unesi opis: ");
		String opis = sc.nextLine();
		HomePage.clickEditOpis(driver);
		HomePage.sendKeysEditOpis(driver, opis);

// Editovanje posta - potvrda
		HomePage.clickEditPostButton(driver);
		sc.close();
	}

// Editovanje posta koriscenje 1 reda u Excel-u
	public static void editPostExcel(WebDriver driver, int p, int i) throws IOException {
		String data;

// Postavljanje excel fajla
		ExcelUtils.setExcelFile(Constant.PATH + Constant.NAME, Constant.SHEET2);

// More options
		HomePage.clickMore(driver, i);

// Edit
		HomePage.clickEdit(driver, i);

// Naziv
		data = ExcelUtils.getCell(i, 1);
		HomePage.clickEditNaziv(driver);
		HomePage.sendKeysEditNaziv(driver, data);

// Lokacija
		data = ExcelUtils.getCell(i, 2);
		HomePage.clickEditLokacija(driver);
		HomePage.sendKeysEditLokacija(driver, data);

// Opis
		data = ExcelUtils.getCell(i, 0);
		HomePage.clickEditOpis(driver);
		HomePage.sendKeysEditOpis(driver, data);

// Editovanje posta - potvrda
		HomePage.clickEditPostButton(driver);
	}

}
