package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class AddAppointmentPage extends Base_Page {

	public AddAppointmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
   @FindBy(xpath = "//input[@name='date_timestamp']" )
   private WebElement datebox;
   
   @FindBy(xpath = "//td[.=10]" )
   private WebElement date ;
   
   @FindBy(xpath ="//input[@name='time_timestamp']" )
   private WebElement timebox;
   
   @FindBy(xpath = "(//i[@class='icon-chevron-up'])[1]")
   private WebElement timehourupwardarrow;
   
   @FindBy(xpath = "(//i[@class='icon-chevron-up'])[2]")
   private WebElement timeminuteupwardarrow;
   
   @FindBy(xpath = "//span[.='Select Patient']")
   private WebElement selectpatient;

   @FindBy(className = "select2-input") //= "(//input[@class='select2-input'])[4]")
   private WebElement selectpatienttextbox;

   @FindBy(xpath = "//input[@class='btn btn-success']" )
   private WebElement submitbutton;
   
   public void clickDatebox() {
	   clickableElement(4, datebox);
	   datebox.click();
   }

   public void SelectDate() {
	   clickableElement(4, date);
	   date.click();
   }
   
   public void clickTimebox() {
	   clickableElement(4, timebox);
	   timebox.click();
   }
   
   public void selectHour() {
	   clickableElement(4, timehourupwardarrow);
	   timehourupwardarrow.click();
	   timehourupwardarrow.click();
	  }
   
   public void selectMinute() {
	   clickableElement(4, timeminuteupwardarrow);
	   timeminuteupwardarrow.click();
	   timeminuteupwardarrow.click();
	  }
   
   public void clickSelectPatient() {
	   clickableElement(4, selectpatient);
	   selectpatient.click();
	   
   }
	   
	   public void enterPatientName(String name) {
		   verifyElement(4, selectpatienttextbox);
		   selectpatienttextbox.sendKeys(name);
		   selectpatienttextbox.sendKeys(Keys.ENTER);
	   }
		   
		   public void clickSubmitButton() {
			   clickableElement(4, submitbutton);
			   submitbutton.click();
		   }   
		   
}
