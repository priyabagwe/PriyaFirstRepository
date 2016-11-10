package com.page;
import com.base.BasePage;
import com.util.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
	
String user = "id_username";
String pwd = "id_pwd";
String submit="id_login";
String login = "id_loginbutton";
String logout = "id_logout";



public LoginPage (PageDriver driver)
{
	super (driver);
}

public void loginclick()
{
	driver.findElement(login).click();
}

public boolean performLogin(String userName,String passwd)
{
	
	driver.findElement(user).sendKeys(userName);
	driver.findElement(pwd).sendKeys(passwd);
	driver.findElement(submit).click();
	return driver.findElement(logout).isDisplayed();
	
	/*WebElement element=driver.findElement("xpath_signoutlink");
	Actions act = new Actions((WebDriver) driver);
	Action action = act.moveToElement(element).build();
	action.perform();
WebDriverWait wait = new WebDriverWait((WebDriver) driver, 5); 
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&lgout=1')]")));

	driver.findElement("xpath_signout").click();


	return driver.findElement("xpath_signout").isDisplayed();*/

}

}
