package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;

public class LoginPage extends BaseClass{
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='User ID']/following-sibling::input\r\n"
			+ "")
	private WebElement userId;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;
	
	public void ClickOnUserId(String userid) {
		if(userId.isDisplayed()) {
			userId.sendKeys(userid);
		}else {
			System.out.println("Not able to sendkeys in user text field");
		}
	}
	
	public void ClickOnPassword(String password) {
		if(passwordTextfield.isDisplayed()) {
			passwordTextfield.sendKeys(password);
		}else {
			System.out.println("Not able to sendkeys in password textfield");
		}
	}
	
	public void ClickOnLoginButton() {
		if(loginButton.isDisplayed()) {
			loginButton.click();
		}else {
			System.out.println("Not able to click on Login Button");
		}
	}
	
	public void Login() {
		String userid = "abhay.parnerkar@godrejagrovet.com";
		String password = "1234";
		userId.sendKeys(userid);
		passwordTextfield.sendKeys(password);
	}
}
