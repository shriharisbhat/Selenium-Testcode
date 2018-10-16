

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{

	WebDriver driver;
	By email = By.id("email");
	By pwd = By.id("pass");
	By login = By.id("send2");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeEmail(String data)
	{
		driver.findElement(email).sendKeys(data);
	}
	
	public void typePwd(String data)
	{
		driver.findElement(pwd).sendKeys(data);
	}
	
	public void clickOnLogin()
	{
	
		driver.findElement(login).click();
	}
	}
