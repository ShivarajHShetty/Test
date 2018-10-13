


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	WebDriver driver;
	
	 By myacc=By.xpath("//a[text()='My Account']");
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOn() {
		driver.findElement(myacc).click();;
	}

}
