package glavni;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.RegistrationPage;
import page.tests.HomepageTest;
import page.tests.PostPageTest;
import page.tests.RegistrationPageTest;

public class GlavniProgram {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("chrome://settings/");
		//driver.executeScript("chrome.settingsPrivate.setDefaultZoom(0.8);");
		try {
			RegistrationPage.openPage(driver);
			Thread.sleep(1000);
//			RegistrationPageTest.MultipleReg(driver);
//			RegistrationPageTest.LogIn(driver);
			RegistrationPageTest.LogIn(driver, 13);
			
			PostPageTest.makePosts(driver);
			HomepageTest.deletePosts(driver, 2);
			HomepageTest.editPost(driver, 1);
			

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
