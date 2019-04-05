package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static final String URL = "http://localhost/izlet/dashboard.php#";
	private static final String MORE = "fa-ellipsis-v";
	private static final String EDIT = "fa-edit";
	private static final String DELETE = "fa-trash-alt";
	private static final String EDIT_NAZIV = "//input[@id='title']";
	private static final String EDIT_LOKACIJA = "//input[@id='location']";
	private static final String EDIT_OPIS = "//textarea[@id='description']";
	private static final String EDIT_POST = "//div[@class='popupEdit']//input[@value='Post']";

	// More button
	public static WebElement getMore(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(MORE));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickMore(WebDriver dr, int i) {
		getMore(dr, i).click();
	}

	// Delete a post
	public static WebElement getDelete(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(DELETE));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickDelete(WebDriver dr, int i) {
		getDelete(dr, i).click();
	}

	// Edit a post
	public static WebElement getEdit(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(EDIT));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickEdit(WebDriver dr, int i) {
		getEdit(dr, i).click();
	}

// Editovanje naziva u odredjenom postu
	public static WebElement getEditNaziv(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(EDIT_NAZIV));
		return webd;
	}

	public static void clickEditNaziv(WebDriver driver) {
		getEditNaziv(driver).click();
	}

	public static void sendKeysEditNaziv(WebDriver driver, String str) {
		getEditNaziv(driver).clear();
		getEditNaziv(driver).sendKeys(str);
	}

// Editovanje lokacije u postu
	public static WebElement getEditLokacija(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(EDIT_LOKACIJA));
		return webd;
	}

	public static void clickEditLokacija(WebDriver driver) {
		getEditLokacija(driver).click();
	}

	public static void sendKeysEditLokacija(WebDriver driver, String str) {
		getEditLokacija(driver).clear();
		getEditLokacija(driver).sendKeys(str);
	}

// Editovanje opisa u datom postu
	public static WebElement getEditOpis(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(EDIT_OPIS));
		return webd;
	}

	public static void clickEditOpis(WebDriver driver) {
		getEditOpis(driver).click();
	}

	public static void sendKeysEditOpis(WebDriver driver, String str) {
		getEditOpis(driver).clear();
		getEditOpis(driver).sendKeys(str);
	}

// Post dugme
	public static WebElement getEditPostButton(WebDriver driver) {
		WebElement webd = driver.findElement(By.xpath(EDIT_POST));
		return webd;
	}

	public static void clickEditPostButton(WebDriver driver) {
		getEditPostButton(driver).click();
	}

// Page - open
	public static void openPage(WebDriver driver) {
		driver.get(URL);
	}

// Page - navigate
	public static void navigateTo(WebDriver driver) {
		driver.navigate().to(URL);
	}
}
