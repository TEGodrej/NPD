package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormReviewPage {

	WebDriver driver;
	public FormReviewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Form Review']")
	private WebElement formPageTitle;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//span[text()='Back']")
	private WebElement backButton;
	
	@FindBy(xpath = "//div[10]//button[1]//span[1]//span[1]//*[name()=\"svg\"]//*[name()=\"path\" and contains(@d,\"M257.7 752\")]")
	private WebElement operatorEditIcon;
	
	@FindBy(xpath = "//span[normalize-space()='Please fix all errors before submitting the form.']")
	private WebElement TextFieldErrorMessage;
	
	public void verifyFormPageTitle() {
		try {
			formPageTitle.isDisplayed();
			System.out.println("Form-Page Title is displayed");
		}catch (Exception e) {
			System.out.println("Form-Page Title is not displayed");
		}
	}
	
	public void clickOnSubmitButton() {
		try {
			submitButton.click();
			System.out.println("clicked on Submit Button");
		}catch (Exception e) {
			System.out.println("Not able to click on submit button");
		}
	}
	
	public void clickOnBackButton() {
		try {
			backButton.click();
			System.out.println("clicked on back button");
		}catch (Exception e) {
			System.out.println("Not able to click on back button");
		}
	}
	
	public void clickOnOperatorEditIcon() {
		try {
			operatorEditIcon.click();
			System.out.println("Clicked on OperatorEdit Icon");
		}catch (Exception e) {
			System.out.println("Not able to click on OperatorEdit Icon");
		}
	}
	
	public void verifyTextFieldErrorMessage() {
		try {
			TextFieldErrorMessage.isDisplayed();
			System.out.println("TextField Error Message is displayed");
		}catch (Exception e) {
			System.out.println("TextFieldErrorMessage is not displayed");
		}
	}
	
}
