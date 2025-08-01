package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommercialsPage {
	
	WebDriver driver;
	public CommercialsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='estimatedVolume']")
	private WebElement MonthsEstimateVolume;
	
	@FindBy(xpath = "//input[@name='estimatedValue']")
	private WebElement monthValue;
	
	@FindBy(xpath = "//input[@name='expectedPrice']")
	private WebElement expectedPrice;
	
	@FindBy(xpath = "//input[@name='expectedContribution']")
	private WebElement expectedContributton;
	
	@FindBy(xpath = "//input[@name='currentContribution']")
	private WebElement currentContributton;
	
	@FindBy(xpath = "//input[@value='Yes']")
	private WebElement yesRadioButton;
	
	@FindBy(xpath = "//input[@value='No']")
	private WebElement noRadioButton;
	
	@FindBy(xpath = "//textarea[@name='rationaleCalculation']")
	private WebElement rationalCollection;
	
	@FindBy(xpath = "//textarea[@name='marginRationale']")
	private WebElement whyToDo;
	
	@FindBy(xpath = "//input[@name='RMidealCost']")
	private WebElement rmIdealTextField;
	
	@FindBy(xpath = "//input[@name='RMnoGoCost']")
	private WebElement RMnoGoTextField;
	
	@FindBy(xpath = "//input[@name='PMidealCost']" )
	private WebElement pmIdealTextField;
	
	@FindBy(xpath = "//input[@name='PMnoGoCost']")
	private WebElement pmNoGoCostTextField;
	
	@FindBy(xpath = "//h4[text()='Commercials']")
	private WebElement commercialPageTitle;
	
	@FindBy(xpath = "//span[normalize-space()='Step 3 saved successfully!']")
	private WebElement step3SuccessfullMessage;
	
	
	public void clickOnMonthsEstimateVolume(String key) {
		try {
			MonthsEstimateVolume.sendKeys(key);
			System.out.println("Entered " +MonthsEstimateVolume.getText() +" in 12 months estimsted volume");
		}catch (Exception e) {
			System.out.println("Not able to enter value in MonthsEstimateVolume Text field");
		}
	}
	
	public void clickOnMonthValue(String key) {
		try {
			monthValue.sendKeys(key);
			System.out.println("Entered " +monthValue.getText() +" in 12 months estimsted value");
		}catch (Exception e) {
			System.out.println("Not able to enter value in monthValue Text field");
		}
	}
	
	public void clickOnExpectedPrice(String key) {
		try {
			expectedPrice.sendKeys(key);
			System.out.println("Entered " +expectedPrice.getText() +" in 12 months estimsted value");
		}catch (Exception e) {
			System.out.println("Not able to enter value in monthValue Text field");
		}
	}
	
	public void clickOnExpectedContributton(String key) {
		try {
			expectedContributton.sendKeys(key);
			System.out.println("Entered " +expectedContributton.getText() +" in expectedContributton");
		}catch (Exception e) {
			System.out.println("Not able to enter value in expectedContributton");
		}
	}
	
	public void sendKeysToCurrentContribution(String key) {
		try {
			currentContributton.sendKeys(key);
			System.out.println("Entered " +currentContributton.getText() +" in currentContributton");
		}catch (Exception e) {
			System.out.println("Not able to enter value in currentContribution");
		}
	}
	
	public void clickOnYesRadioButton() {
		try {
			yesRadioButton.click();;
			System.out.println("clicked on 'Yes' RadioButton");
		}catch (Exception e) {
			System.out.println("Not able to clicked on 'Yes' RadioButton");
		}
	}
	
	public void sendKeysToRationalCollection(String key) {
		try {
			rationalCollection.sendKeys(key);
			System.out.println("Entered " +rationalCollection.getText() +" in rationalCollection");
		}catch (Exception e) {
			System.out.println("Not able to enter value in rationalCollection");
		}
	}
	
	public void sendKeysToWhyToDo(String key) {
		try {
			whyToDo.sendKeys(key);
			System.out.println("Entered " +whyToDo.getText() +" in whyToDo");
		}catch (Exception e) {
			System.out.println("Not able to enter value in whyToDo");
		}
	}
	
	public void sendKeysToRmIdealTextField(String key) {
		try {
			rmIdealTextField.sendKeys(key);
			System.out.println("Entered " +rmIdealTextField.getText() +" in rmIdealTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in whyToDo");
		}
	}
	
	public void sendKeysToRMnoGoTextField(String key) {
		try {
			RMnoGoTextField.sendKeys(key);
			System.out.println("Entered " +RMnoGoTextField.getText() +" in RMnoGoTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in RMnoGoTextField");
		}
	}
	
	public void sendKeysTopmIdealTextField(String key) {
		try {
			pmIdealTextField.sendKeys(key);
			System.out.println("Entered " +pmIdealTextField.getText() +" in pmIdealTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in pmIdealTextField");
		}
	}
	
	public void sendKeysToPmNoGoCostTextField(String key) {
		try {
			pmNoGoCostTextField.sendKeys(key);
			System.out.println("Entered " +pmNoGoCostTextField.getText() +" in pmNoGoCostTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in pmNoGoCostTextField");
		}
	}
	
	public void verifyCommercialPageTitle() {
		try {
			commercialPageTitle.isDisplayed();
			System.out.println("Commercial Page Title is dispalyed");
		}catch (Exception e) {
			System.out.println("commercial Page Title is not displayed");
		}
	}
	
	public void verifyStep3SuccessfullMessage() {
		try {
			step3SuccessfullMessage.isDisplayed();
			System.out.println("Step-3 Successfull message is dispalyed");
		}catch (Exception e) {
			System.out.println("step-3 Successfull message is not displayed");
		}
	}
}
