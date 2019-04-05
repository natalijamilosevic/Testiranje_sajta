package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostPage {

	public static final String LOGOUT = "//a[contains(text(),'Logout')]";
	public static final String MAKEPOST = "//a[contains(text(),'Make a post')]";
	public static final String NAZIV = "//input[@placeholder='Naziv']";
	public static final String LOKACIJA = "//input[@placeholder='Lokacija']";
	public static final String PREVOZNO_SREDSTVO = "//select[@name='transport']";
	public static final String OPIS = "//textarea[@placeholder='Opis']";
	public static final String POST = "//div[@class='popupPost']//input[@value='Post']";

// Log Out
	public static WebElement getLogOut(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(LOGOUT));
		return webd;
	}

	public static void clickLogOut(WebDriver driver) {
		getLogOut(driver).click();
	}

// Novi post
	public static WebElement getMakePost(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(MAKEPOST));
		return webd;
	}

	public static void clickMakePost(WebDriver driver) {
		getMakePost(driver).click();
	}

// Naziv
	public static WebElement getNaziv(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(NAZIV));
		return webd;
	}

	public static void clickNaziv(WebDriver driver) {
		getNaziv(driver).click();
	}

	public static void sendKeysNaziv(WebDriver driver, String str) {
		getNaziv(driver).sendKeys(str);
	}

// Lokacija
	public static WebElement getLokacija(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(LOKACIJA));
		return webd;
	}

	public static void clickLokacija(WebDriver driver) {
		getLokacija(driver).click();
	}

	public static void sendKeysLokacija(WebDriver driver, String str) {
		getLokacija(driver).sendKeys(str);
	}

// Prevozno sredstvo
	public static void ChoosePrevoznoSredstvo(WebDriver driver) {
		driver.findElement(By.xpath(PREVOZNO_SREDSTVO)).click();
	}

// Opis
	public static WebElement getOpis(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(OPIS));
		return webd;
	}

	public static void clickOpis(WebDriver driver) {
		getOpis(driver).click();
	}

	public static void sendKeysOpis(WebDriver driver, String str) {
		getOpis(driver).sendKeys(str);
	}

// (Uneti) Post
	public static WebElement getPost(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(POST));
		return webd;
	}

	public static void clickPost(WebDriver driver) {
		getPost(driver).click();
	}
}
