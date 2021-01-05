package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class HmsLoginPage extends Base_Page {

	public HmsLoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(xpath ="//button[@class='btn btn-primary btn-block btn-login']")
	private WebElement login;
	
	public void setUsername(String uname) {
		verifyElement(2, un);
		un.sendKeys(uname);
	}
	
	public void setPassword(String pass) {
		verifyElement(2, pwd);
		pwd.sendKeys(pass);
	}
	
	public void clickLogin() {
		clickableElement(2, login);
		login.click();
	}

}
