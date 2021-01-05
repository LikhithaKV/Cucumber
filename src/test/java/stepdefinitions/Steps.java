package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Base_Page;
import generic.Screenshot;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.HmsLoginPage;


public class Steps {

	WebDriver driver;
	HmsLoginPage lp;
	
	@Before
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("http://122.166.192.191:9007");
		  driver.manage().window().maximize();
		  lp=new HmsLoginPage(driver);
	}
	
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	 System.out.println("User is on login page"); 
	}


	@When("user enters valid username {string} and password {string}")
	public void user_enters_valid_username_and_password(String un, String pwd) {
	lp.setUsername(un);
	lp.setPassword(pwd);
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
	    lp.clickLogin();
	}
	@Then("User should be able to login as patient successfully with title {string}")
	public void user_should_be_able_to_login_as_patient_successfully(String etitle) throws InterruptedException {
		
	    lp.verifyTitle(6, "Accountant");
	    String atitle = driver.getTitle();
	    Assert.assertEquals(etitle, atitle);
		   
	}
	
	@Given("select the payment type {string}")
	public void select_the_payment_type(String string) {
	System.out.println(string);	
	}

   @Then("order placed successfully")
	public void order_placed_successfully(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> val = dataTable.asMaps(String.class, String.class);
		  System.out.println(val.get(1).get("discount")); 
   }
   
   @After
   public void tearDown(Scenario sce) {
	   if(sce.isFailed()) {
		   String tcName = sce.getName();
		  new Screenshot().capture(driver, tcName);
	   }
	   driver.quit();
   }
   }
	
