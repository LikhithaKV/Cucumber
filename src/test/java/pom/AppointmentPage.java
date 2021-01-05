package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class AppointmentPage extends Base_Page {

	public AppointmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
	private WebElement addappointment;
	
	public void clickAddAppointment() {
		clickableElement(2, addappointment);
		addappointment.click();
	}
}
