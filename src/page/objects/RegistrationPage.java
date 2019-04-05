package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Constant;

public class RegistrationPage {

	public static final String LOGIN_USERNAME = "//input[@placeholder='username']";
	public static final String LOGIN_PASSWORD = "//input[@placeholder='password']";
	public static final String LOGIN = "//input[@value='Log in']";
	public static final String FIRST_NAME = "//input[@name='firstname']";
	public static final String LAST_NAME = "//input[@name='lastname']";
	public static final String USERNAME = "//form[@action='processregister.php']//input[@name='username']";
	public static final String EMAIL = "//input[@name='email']";
	public static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	public static final String REGISTER = "//input[@id='blue_btn']";

	// Log in user name
	public static WebElement getLoginUsername(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(LOGIN_USERNAME));
		return webd;
	}

	public static void clickLoginUsername(WebDriver driver) {
		getLoginUsername(driver).click();
	}

	public static void sendKeysLoginUsername(WebDriver driver, String str) {
		getLoginUsername(driver).sendKeys(str);
	}

	// Log in password
	public static WebElement getLoginPassword(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(LOGIN_PASSWORD));
		return webd;
	}

	public static void clickLoginPassword(WebDriver driver) {
		getLoginPassword(driver).click();
	}

	public static void sendKeysLoginPassword(WebDriver driver, String str) {
		getLoginPassword(driver).sendKeys(str);
	}

	// Log in button
	public static WebElement getLogInButton(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(LOGIN));
		return webd;
	}

	public static void clickLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}


	// First name
	public static WebElement getFirstName(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(FIRST_NAME));
		return webd;
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void sendKeysFirstName(WebDriver driver, String str) {
		getFirstName(driver).sendKeys(str);
	}

	// Last name
	public static WebElement getLastName(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(LAST_NAME));
		return webd;
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void sendKeysLastName(WebDriver driver, String str) {
		getLastName(driver).sendKeys(str);
	}

	// Username
	public static WebElement getUsername(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(USERNAME));
		return webd;
	}

	public static void clickUsername(WebDriver driver) {
		getUsername(driver).click();
	}

	public static void sendKeysUsername(WebDriver driver, String str) {
		getUsername(driver).sendKeys(str);
	}

	// Email
	public static WebElement getEmail(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(EMAIL));
		return webd;
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void sendKeysEmail(WebDriver driver, String str) {
		getEmail(driver).sendKeys(str);
	}

	// Password
	public static WebElement getPassword(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(PASSWORD));
		return webd;
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void sendKeysPassword(WebDriver driver, String str) {
		getPassword(driver).sendKeys(str);
	}

	// Register button
	public static WebElement getRegister(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(REGISTER));
		return webd;
	}

	public static void clickRegister(WebDriver driver) {
		getRegister(driver).click();
	}

	// Open page
	public static void openPage(WebDriver driver) {
		driver.get(Constant.PAGE_URL);
	}

	// Navigate to Page
	public static void navigateTo(WebDriver driver) {
		driver.navigate().to(Constant.PAGE_URL);
	}

}
