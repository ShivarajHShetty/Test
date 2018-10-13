
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	@Test
	private void posCredentials() {


		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.magento.com");
		
		MainPage m = new MainPage(driver);
		m.clickOn();
		
		LoginPage login = new LoginPage(driver);
		login.email("Umashankar.h91@gmail.com");
		login.pwd("Ascetic123456");
		login.login();
		
		Logout logout = new Logout(driver);
		logout.logout();
		
		driver.quit();

	}
}
