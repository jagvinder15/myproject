package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import basePackage.BaseClass;

public class PomLogin extends BaseClass{
	
@FindBy(css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input")	
WebElement Username;

@FindBy(id="txtPassword")
WebElement Password;
@FindBy(id="btnLogin") WebElement Loginbtn;


public PomLogin() {
	PageFactory.initElements(driver, this);
}
public void typerusername(String name) {
	Username.sendKeys(name);	
}
public void typespassword(String pass) {
	Password.sendKeys(pass);	
}
public void clickbtn() {
	Loginbtn.click();
}

public String verify() {
	return driver.getTitle();
	
}

@AfterMethod
public void close() {
	driver.close();
	
}

}
