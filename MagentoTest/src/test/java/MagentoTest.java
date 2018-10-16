

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class MagentoTest {

	@Test
	public void posCredentials() throws Exception
	
	{
		String url = "https://www.magento.com";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
		
		MainPage m = new MainPage(driver);
		m.clickOnMyacc();
		Thread.sleep(4000);
		
		LoginPage login = new LoginPage(driver);
		login.typeEmail("sucheendra.abc@gmail.com");
		login.typePwd("Welcome123");
		login.clickOnLogin();
		Thread.sleep(4000);
		
		LogoutPage l = new LogoutPage(driver);
		l.clickonLogout();
		
		driver.quit();
		
	}

}
