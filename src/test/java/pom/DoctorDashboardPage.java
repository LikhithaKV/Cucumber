package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class DoctorDashboardPage extends Base_Page {

	public DoctorDashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[.='Appointment']")
	private WebElement appointment;
	
	@FindBy(xpath = "//span[.='Appointment List']")
	private WebElement appointmentList;
	
	public void clickAppointment() {
		clickableElement(2, appointment);
		appointment.click();
	}
		
		public void clickAppointmentList() {
			clickableElement(2, appointmentList);
			appointmentList.click();
	}
	
	
}
