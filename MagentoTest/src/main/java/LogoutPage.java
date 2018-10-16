

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	WebDriver driver;
	
	By logout = By.linkText("Log Out");
	
	public LogoutPage(WebDriver driver)
	{
	
		this.driver=driver;
	}
	
	public void clickonLogout()
	{
		driver.findElement(logout).click();
	}
	
}
