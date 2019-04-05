package page.tests;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import page.objects.PostPage;
import page.objects.RegistrationPage;
import utility.Constant;
import utility.ExcelUtils;

public class RegistrationPageTest {

	public static void RegistrFirstName(WebDriver driver) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi ime");
		String str = sc.nextLine();
		RegistrationPage.clickFirstName(driver);
		RegistrationPage.sendKeysFirstName(driver, str);
		sc.close();
		}
		
		public static void RegistrLastName(WebDriver driver) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesi prezime");
			String str = sc.nextLine();
			RegistrationPage.clickLastName(driver);
			RegistrationPage.sendKeysLastName(driver, str);
			sc.close();
		}
		
		public static void RegistrUsername(WebDriver driver) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesi korisnicko ime");
			String str = sc.nextLine();
			RegistrationPage.clickUsername(driver);
			RegistrationPage.sendKeysUsername(driver, str);
			sc.close();
		}
		
		public static void RegistrPassword(WebDriver driver) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesi sifru");
			String str = sc.nextLine();
			RegistrationPage.clickPassword(driver);
			RegistrationPage.sendKeysPassword(driver, str);
			sc.close();
		}
		
		public static void RegistrEmail(WebDriver driver) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesi e-mail");
			String str = sc.nextLine();
			RegistrationPage.clickEmail(driver);
			RegistrationPage.sendKeysEmail(driver, str);
		
		
		RegistrationPage.clickRegister(driver);
		sc.close();
	}

	public static void RegisterNewUser(WebDriver driver, int i) throws IOException {
		String data;
		ExcelUtils.setExcelFile(Constant.PATH + Constant.NAME, Constant.SHEET1);

		// First name
		data = ExcelUtils.getCell(i, 0);
		RegistrationPage.clickFirstName(driver);
		RegistrationPage.sendKeysFirstName(driver, data);

		// Last name
		data = ExcelUtils.getCell(i, 1);
		RegistrationPage.clickLastName(driver);
		RegistrationPage.sendKeysLastName(driver, data);

		// Username
		data = ExcelUtils.getCell(i, 2);
		RegistrationPage.clickUsername(driver);
		RegistrationPage.sendKeysUsername(driver, data);

		// Email
		data = ExcelUtils.getCell(i, 3);
		RegistrationPage.clickEmail(driver);
		RegistrationPage.sendKeysEmail(driver, data);

		// Password
		data = ExcelUtils.getCell(i, 4);
		RegistrationPage.clickPassword(driver);
		RegistrationPage.sendKeysPassword(driver, data);

		// Register Button
		RegistrationPage.clickRegister(driver);

	}

	public static void MultipleReg(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.PATH + Constant.NAME, Constant.SHEET1);
		for (int i = 1; i < ExcelUtils.getWSheet().getLastRowNum() + 1; i++) {
			RegisterNewUser(driver, i);

		}
	}

	public static void LogInUserName(WebDriver driver) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi korisnicko ime");
		String str = sc.nextLine();
		RegistrationPage.clickUsername(driver);
		RegistrationPage.sendKeysUsername(driver, str);
		sc.close();
	}

	
	public static void LogInPassword(WebDriver driver) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi sifru");
		String str = sc.nextLine();
		RegistrationPage.clickPassword(driver);
		RegistrationPage.sendKeysPassword(driver, str);
		sc.close();
	}
	

	public static void LogIn(WebDriver driver, int i) throws IOException {
		String data;
		ExcelUtils.setExcelFile(Constant.PATH + Constant.NAME, Constant.SHEET1);

		data = ExcelUtils.getCell(i, 2);

		RegistrationPage.clickLoginUsername(driver);
		RegistrationPage.sendKeysLoginUsername(driver, data);

		data = ExcelUtils.getCell(i, 4);

		RegistrationPage.clickLoginPassword(driver);
		RegistrationPage.sendKeysLoginPassword(driver, data);
		RegistrationPage.clickLogInButton(driver);

	}

	public static void LogIn(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.PATH + Constant.NAME, Constant.SHEET1);
		for (int i = 1; i < ExcelUtils.getWSheet().getLastRowNum() + 1; i++) {
			LogIn(driver, i);

			if (driver.getCurrentUrl().equals(Constant.HOME_PAGE_URL)) {
				PostPage.clickLogOut(driver);
			} else

				RegistrationPage.navigateTo(driver);

		}
	}
}
