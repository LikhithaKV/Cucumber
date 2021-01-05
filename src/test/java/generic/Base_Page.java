package generic;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Base_Page {
	public WebDriver driver;

	public Base_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyElement(int time,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		   System.out.println("Element visible");
	} catch (Exception e) {
		System.out.println("Element not visible");
		Assert.fail();
	}
}
	
	public void clickableElement(int time,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			System.out.println("element clickable");
		} catch (Exception e) {
			System.out.println("unable to click element");
			Assert.fail();
		}
	}
	
	public void verifyTitle(int time,String title) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.titleContains(title));
			System.out.println("title matching");
		} catch (Exception e) {
			System.out.println("title not displayed");
			Assert.fail();
		}
	}
	
	public void verifyTab(int time,int NumberOfWindows) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.numberOfWindowsToBe(NumberOfWindows));
			System.out.println("child tab is present");
			Set<String> windows = driver.getWindowHandles();
			for (String win : windows) {
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
			}
	        System.out.println("Switched to child tab");
			
		} catch (Exception e) {
			System.out.println("child tab is not present");
			Assert.fail();
		}
	}
		
		public void mouseHover(WebElement element) {
			Actions act=new Actions(driver);
			act.moveToElement(element).perform();
		}
		
		public void rightClick(WebElement element) {
			Actions act=new Actions(driver);
			act.contextClick(element).perform();
		}
		
	
}
