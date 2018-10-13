

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	WebDriver driver;
	By logout = By.xpath("//a[text()='Log Out']");

	public Logout(WebDriver driver) {
		this.driver = driver;
	}

	public void logout() {
		driver.findElement(logout).click();
	}

}
