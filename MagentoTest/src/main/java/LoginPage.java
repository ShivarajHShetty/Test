
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By email= By.xpath("//input[@id='email']");
	By pass= By.xpath("//input[@id='pass']");
	By login= By.xpath("//button[@id='send2']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void email(String data) {
		driver.findElement(email).sendKeys(data);
	}
	
	public void pwd(String data) {
		driver.findElement(pass).sendKeys(data);
	}
	
	public void login()
	{
		driver.findElement(login).click();
	}

}
