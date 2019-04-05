package page.tests;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.PostPage;

import utility.Constant;
import utility.ExcelUtils;

public class PostPageTest {

// Unosenje podataka preko skenera
	public static void makePost(WebDriver driver) {
		Scanner sc = new Scanner(System.in);

// Klik za novi post
		PostPage.clickMakePost(driver);

// Unosenje naziva posta
		System.out.println("Unesi naziv: ");
		String naziv = sc.nextLine();
		PostPage.clickNaziv(driver);
		PostPage.sendKeysNaziv(driver, naziv);

// Unosenje lokacije
		System.out.println("Unesi lokaciju: ");
		String lokacija = sc.nextLine();
		PostPage.clickLokacija(driver);
		PostPage.sendKeysLokacija(driver, lokacija);

// Unosenje opisa
		System.out.println("Unesi opis: ");
		String opis = sc.nextLine();
		PostPage.clickOpis(driver);
		PostPage.sendKeysOpis(driver, opis);

// Potvrda unosenja posta
		PostPage.clickPost(driver);
		sc.close();
	}

// Postovanje koriscenjem 1 reda u excel-u

	public static void makePostExcel(WebDriver driver, int i) throws IOException {
		String data;

		ExcelUtils.setExcelFile(Constant.PATH + Constant.NAME, Constant.SHEET2);
		PostPage.clickMakePost(driver);

		data = ExcelUtils.getCell(i, 1);

		PostPage.clickNaziv(driver);
		PostPage.sendKeysNaziv(driver, data);

		data = ExcelUtils.getCell(i, 2);

		PostPage.clickLokacija(driver);
		PostPage.sendKeysLokacija(driver, data);

		data = ExcelUtils.getCell(i, 0);

		PostPage.clickOpis(driver);
		PostPage.sendKeysOpis(driver, data);

		PostPage.clickPost(driver);
	}

// Postovanje vise postova koriscenjem podataka iz excel-a
	public static void makePosts(WebDriver driver) throws IOException {

// Postavljanje excel dokumenta
		ExcelUtils.setExcelFile(Constant.PATH + Constant.NAME, Constant.SHEET2);
		for (int i = 1; i < ExcelUtils.getWSheet().getLastRowNum() + 1; i++) {
			makePostExcel(driver, i);
		}
	}
}
