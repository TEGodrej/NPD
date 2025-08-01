package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperationsPage {
	
	WebDriver driver;
	public OperationsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[text()='Operations']")
	private WebElement operationPageTitle;
	
	@FindBy(xpath = "//textarea[@name='manufacturingRequirements']")
	private WebElement manufacturingRequirementsTextField;
	
	@FindBy(xpath = "//input[@value='Yes']")
	private WebElement yesRadioButton;
	
	@FindBy(xpath = "//input[@value='No']")
	private WebElement noRadioButton;
	
	@FindBy(xpath = "//textarea[@name='feasibility']")
	private WebElement feasibilityTextField;
	
	@FindBy(xpath = "//textarea[@name='budgetPlanning']")
	private WebElement budgetPlanningTextField;
	
	@FindBy(xpath = "//span[text()='Review']")
	private WebElement reviewButton;
	
	
	
	
	public void verifyoperationPageTitle() {
		try {
			operationPageTitle.isDisplayed();
			System.out.println("Operation Page Title is displayed");
		}catch (Exception e) {
			System.out.println("Operation Page Title is not displayed");
		}
	}
	
	public void sendkeysToManufacturingRequirementsTextField(String key) {
		try {
			manufacturingRequirementsTextField.sendKeys(key);
			System.out.println("Entered value in manufacturing Requirements TextField");
		}catch (Exception e) {
			System.out.println("Not able to entered value in manufacturing Requirements TextField");
		}
	}
	
	public void clickOnYesRadioButton() {
		try {
			yesRadioButton.click();
			System.out.println("Clicked on 'Yes' RadioButton");
		}catch (Exception e) {
			System.out.println("Not able to clicked on 'Yes' RadioButton");
		}
	}
	
	public void clickOnNoRadioButton() {
		try {
			noRadioButton.click();
			System.out.println("Clicked on 'No' RadioButton");
		}catch (Exception e) {
			System.out.println("Not able to clicked on 'No' RadioButton");
		}
	}
	
	public void sendkeysToFeasibilityTextField(String key) {
		try {
			feasibilityTextField.sendKeys(key);
			System.out.println("Entered value in feasibility TextField");
		}catch (Exception e) {
			System.out.println("Not able to entered value in feasibility TextField");
		}
	}
	
	public void sendkeysToBudgetPlanningTextField(String key) {
		try {
			budgetPlanningTextField.sendKeys(key);
			System.out.println("Entered value in Budget Planning TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in Budget Planning TextField");
		}
	}
	
}
