package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBrief_ProductDetailPage {

	
	WebDriver driver;
	public AddBrief_ProductDetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Product Name , flavours SKU sizes ']")
	private WebElement productNameTextField;
	
	@FindBy(xpath = "//input[@name='benchmarksInternal']")
	private WebElement internalBenchMarkTextField;
	
	@FindBy(xpath = "//input[@name='benchmarksExternal']")
	private WebElement externalBenchMarkTextField;
	
	@FindBy(xpath = "//input[@name='differentiationInternal']")
	private WebElement internalPointOfDifferenceTextField;
	
	@FindBy(xpath = "//input[@name='differentiationExternal']")
	private WebElement externalPointOfDifferenceTextField;
	
	@FindBy(xpath = "//input[@name='claims']")
	private WebElement claimsTextField;
	
	@FindBy(xpath = "//textarea[@name='concept']")
	private WebElement conceptTextField;
	
	@FindBy(xpath = "//input[@value='yes']")
	private WebElement yesRadioButton;
	
	@FindBy(xpath = "//input[@value='no']")
	private WebElement noRadioButton;
	
	@FindBy(xpath = "//input[@name='packaging']")
	private WebElement packagingTextField;
	
	@FindBy(xpath = "//textarea[@name='physicalAttribute']")
	private WebElement productActionStandardTextField;
	
	@FindBy(xpath = "//textarea[@name='sensorialAttribute']")
	private WebElement sensorialAttributeTextField;
	
	@FindBy(xpath = "//input[@name='shelfLife']")
	private WebElement shelfLifeTextField;
	
	@FindBy(xpath = "//textarea[@name='mustHave']")
	private WebElement mustHaveTextfield;
	
	@FindBy(xpath = "//textarea[@name='goodToHave']")
	private WebElement goodToHaveTextField;
	
	@FindBy(xpath = "//div[@class='ant-message-notice-content']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//div[text()='This field is required']")
	private WebElement errorMessage;
	
	@FindBy(xpath = "//span[text()='Previous']")
	private WebElement previousButton;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextButton;
	
	
	
	public void sendkeyToProductNameTextField(String key) {
		try {
			productNameTextField.sendKeys(key);
			System.out.println("Entered value in Product Name Text Field");
		}catch (Exception e) {
			System.out.println("Not able to enter value in Product Name Text Field");
		}
	}
	
	public void sendkeyToInternalBenchMarkTextField(String key) {
		try {
			internalBenchMarkTextField.sendKeys(key);
			System.out.println("Entered value in internal BenchMark TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in internal BenchMark TextField");
		}
	}
	
	public void sendkeyToExternalBenchMarkTextField(String key) {
		try {
			externalBenchMarkTextField.sendKeys(key);
			System.out.println("Entered value in external BenchMark TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in external BenchMark TextField");
		}
	}
	
	public void sendkeyToInternalPointOfDifferenceTextField(String key) {
		try {
			internalPointOfDifferenceTextField.sendKeys(key);
			System.out.println("Entered value in internal Point Of Difference TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in internal Point Of Difference TextField");
		}
	}
	
	public void sendkeyToExternalPointOfDifferenceTextField(String key) {
		try {
			externalPointOfDifferenceTextField.sendKeys(key);
			System.out.println("Entered value in externalPointOfDifferenceTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in externalPointOfDifferenceTextField");
		}
	}
	
	public void sendkeyToClaimsTextField(String key) {
		try {
			claimsTextField.sendKeys(key);
			System.out.println("Entered value in claimsTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in claimsTextField");
		}
	}
	
	public void sendkeyToConceptTextField(String key) {
		try {
			conceptTextField.sendKeys(key);
			System.out.println("Entered value in conceptTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in conceptTextField");
		}
	}
	
	public void sendkeyToYesRadioButton() {
		try {
			yesRadioButton.click();
			System.out.println("Clicked on 'Yes' RadioButton");
		}catch (Exception e) {
			System.out.println("Not able to click on 'Yes' RadioButton");
		}
	}
	
	public void sendkeyToNoRadioButton() {
		try {
			noRadioButton.click();
			System.out.println("Clicked on 'No' RadioButton");
		}catch (Exception e) {
			System.out.println("Not able to click on 'No' RadioButton");
		}
	}
	
	public void sendkeyToPackagingTextField(String key) {
		try {
			packagingTextField.sendKeys(key);
			System.out.println("Entered value in packagingTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in packagingTextField");
		}
	}
	
	public void sendkeyToProductActionStandardTextField(String key) {
		try {
			productActionStandardTextField.sendKeys(key);
			System.out.println("Entered value in productActionStandardTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in productActionStandardTextField");
		}
	}
	
	public void sendkeyToSensorialAttributeTextField(String key) {
		try {
			sensorialAttributeTextField.sendKeys(key);
			System.out.println("Entered value in sensorialAttributeTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in sensorialAttributeTextField");
		}
	}
	
	public void sendkeyToShelfLifeTextField(String key) {
		try {
			shelfLifeTextField.sendKeys(key);
			System.out.println("Entered value in shelfLifeTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in shelfLifeTextField");
		}
	}
	
	public void sendkeyToMustHaveTextfield(String key) {
		try {
			mustHaveTextfield.sendKeys(key);
			System.out.println("Entered value in mustHaveTextfield");
		}catch (Exception e) {
			System.out.println("Not able to enter value in mustHaveTextfield");
		}
	}
	
	public void sendkeyToGoodToHaveTextField(String key) {
		try {
			goodToHaveTextField.sendKeys(key);
			System.out.println("Entered value in goodToHaveTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in goodToHaveTextField");
		}
	}
	
	public void verifySuccessMessage() {
		try {
			successMessage.isDisplayed();
			System.out.println("Success Message is displayed");
		}catch (Exception e) {
			System.out.println("Success Message is not displayed");
		}
	}
	
	public void verifyErrorMessage() {
		try {
			errorMessage.isDisplayed();
			System.out.println("errorMessage is displayed");
		}catch (Exception e) {
			System.out.println("errorMessage is not displayed");
		}
	}
	
	public void clickOnPreviousButton() {
		try {
			previousButton.click();
			System.out.println("Clicked on PreviousButton");
		}catch (Exception e) {
			System.out.println("Not able to Click on PreviousButton");
		}
	}
	
	public void ClickOnNextButton() {
		try {
			nextButton.click();
			System.out.println("Clicked on nextButton");
		}catch (Exception e) {
			System.out.println("Not able to click on nextButton");
		}
	}
}
