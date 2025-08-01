package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelPage {
	
	WebDriver driver;
	
	public CancelPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver , this);
	}

	@FindBy(xpath = "//div[text()='Draft Project submitted successfully!']")
	private WebElement submissionMessage;
	
	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//span[text()='Save as draft']")
	private WebElement draftButton;
	
	@FindBy(xpath = "//span[text()='Continue editing']")
	private WebElement continueEditingButton;
	
	@FindBy(xpath = "//span[text()='Clear Data']")
	private WebElement clearDataButton;
	
	@FindBy(xpath = "//button[@class='text-gray-400 hover:text-gray-600 transition-colors']")
	private WebElement crossButton;
	
	public void clickOnSubmissionMessage() {
		try {
			submissionMessage.click();
			System.out.println("clicked on save as Draft");
		}catch (Exception e) {
			System.out.println("Not able to click on save as Draft");
		}
	}
	
	public void clickOnCancelButton() {
		try {
			cancelButton.click();
			System.out.println("Clicked on cancel Button");
		}catch (Exception e) {
			System.out.println("Not able to click on cancel Button");
		}
	}
	
	public void clickOnDraftButton() {
		try {
			draftButton.click();
			System.out.println("Clicked on Draft Button ");
		}catch (Exception e) {
			System.out.println("Not able to click on Draft Button");
		}
	}
	
	public void clickOnContinueEditingButton() {
		try {
			continueEditingButton.click();
			System.out.println("Clicked on Continue Editing Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Continue Editing Button");
		}
	}
	
	public void clickOnClearDataButton() {
		try {
			clearDataButton.click();
			System.out.println("Clicked on Clear Data Button");
		}catch (Exception e) {
			System.out.println("Not able to click on clear Data Button");
		}
	}
	
	public void clickOnCrossButton() {
		try {
			crossButton.click();
			System.out.println("Clicked on Cross Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Cross Button");
		}
	}
}
