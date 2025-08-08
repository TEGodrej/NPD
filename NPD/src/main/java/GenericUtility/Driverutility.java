package GenericUtility;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driverutility {
	
	public WebDriver driver;
	public Driverutility(WebDriver driver) {
		this.driver = driver;
		
	}

	public static WebDriverWait wait;
	public void WaitToClick(int time, WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	    element = wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void WaitTovisibility(WebElement element, int time) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void implicitlyWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);",element);
	}
	
	public void scrollToCenter(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);

	}
	
	public void forceScrollPage(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, arguments[0].getBoundingClientRect().top + window.scrollY);", element);

	}
	
	public void scrollToElement(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void threadWait(int time) {
		try {
			Thread.sleep(Duration.ofSeconds(time));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void SelectByVisibleText(WebElement elem , String text) {
		Select select= new Select(elem);
		select.deselectByVisibleText(text);
	}
	
	public void explicitWaitUntilClickable(int time, WebElement webelement) {
		WebDriverWait wait;
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
	}
	
	public void explicitWaitByLocator(int time , By locator) {
		WebDriverWait wait;
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void explicitWaitForVisibility(int time , WebElement element) {
		WebDriverWait wait;
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void ClickActionOnWebelement(WebElement element) {
		Actions action =new Actions(driver);
		action.moveToElement(element).click().perform();
	}
	
	public void scrollByAction(WebElement element) {
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void actionClick(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).click().perform();
	}
	
	public void contextClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element);
	}
	
	public void forceClik(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element );
	}
}
