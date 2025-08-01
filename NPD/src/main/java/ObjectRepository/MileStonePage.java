package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;

public class MileStonePage {
	
	WebDriver driver;
	public MileStonePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[text()='Timelines & Milestones']")
	private WebElement mileStonePageTitle;
	
	@FindBy(xpath = "//button[@aria-label='Next month (PageDown)']")
	private WebElement NextMonthArrowButton;
	
//	String fullDate="2025-08-28";
//	String day = "28";
//	@FindBy(xpath = "//td[@title='" + fullDate + "']//div[@class='ant-picker-cell-inner'][normalize-space()='"+ day +"']")
//	private WebElement date;
	
	
	
	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement expectedDeliveryDate;
	
	@FindBy(xpath = "//span[@class='ant-select-selection-item']")
	private WebElement projectPriorityDropDown;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Immediate (3-6 months)']")
	private WebElement dropDownFirstOption;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Intermediate (6-9 months)']")
	private WebElement dropDownSecondOption;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Strategic (12-15 months)']")
	private WebElement dropDownThirdOption;
	
	@FindBy(xpath = "//textarea[@name='reasonforprioritization']")
	private WebElement reasonForPriorityTextField;
	
	@FindBy(xpath = "//textarea[@name='intermittentmilestones']")
	private WebElement intermittentMilestonesTextField;
	
	@FindBy(xpath = "//span[normalize-space()='Step 4 saved successfully!']")
	private WebElement Step4SuccessfullMessage;
	
	public void verifyMileStonePAgeTitle() {
		try {
			mileStonePageTitle.isDisplayed();
			System.out.println("You moved to mileStone Page ");
		}catch (Exception e) {
			System.out.println("MileStone page title is not displayed");
		}
	}
	
//	String fullDate="2025-08-28";
//	Date d = new Date();
//	SimpleDateFormat sim= new SimpleDateFormat("dd");
//	String day = sim.format(d);
//	
//	
//	 LocalDate today = LocalDate.now();
//     // Add 30 days
//     LocalDate futureDate = today.plusDays(30);
//     // Format as yyyy-MM-dd
//     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//     String fullDate = futureDate.format(formatter);
     
     
	
	public void clickOnDate() {
//		Date d = new Date();
//		SimpleDateFormat sim= new SimpleDateFormat("dd");
//		String day = sim.format(d);
//		
//		
//		 LocalDate today = LocalDate.now();
//	     // Add 30 days
//	     LocalDate futureDate = today.plusDays(30);
//	     // Format as yyyy-MM-dd
//	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//	     String fullDate = futureDate.format(formatter);
		WebElement date=driver.findElement(AppiumBy.xpath("//td[@title=\"2025-08-28\"]//div[@class=\"ant-picker-cell-inner\"][normalize-space()=\"28\"]"));
		date.click();
//		System.out.println(fullDate);
//		System.out.println(day);
		
	}
	
	public void clickOnNextMonthArrowButton() {
		try {
			NextMonthArrowButton.click();
			System.out.println("Clicked on next month arrow");
		}catch (Exception e) {
			System.out.println("Not able to click on next month arrow");
		}
	}
	
	public void ClickOnExpectedDeliveryDate() {
		try {
			expectedDeliveryDate.click();
			System.out.println("Clicked on expectedDeliveryDate");
		}catch (Exception e) {
			System.out.println("not able to click on expectedDeliveryDate");
		}
	}
	
	public void clickOnProjectPriorityDropDown() {
		try {
			projectPriorityDropDown.click();
			System.out.println("Cliked on projectPriorityDropDown");
		}catch (Exception e) {
			System.out.println("Not able to click on dropDownFirstOption");
		}
	}
	
	public void clickOnDropDownFirstOption() {
		try {
			dropDownFirstOption.click();
			System.out.println("Clicked on first option");
		}catch (Exception e) {
			System.out.println("Not abke to click on dropDownFirstOption");
		}
	}
	
	public void clickOnDropDownSecondOption() {
		try {
			dropDownSecondOption.click();
			System.out.println("Clicked on DropDown Second Option");
		}catch (Exception e) {
			System.out.println("Not able to click on DropDown Second Option");
		}
	}
	
	public void clickOnDropDownThirdOption() {
		try {
			dropDownThirdOption.click();
			System.out.println("Clicked on DropDown Third Option");
		}catch (Exception e) {
			System.out.println("Not able to click on Drop Down Third Option");
		}
	}
	
	public void sendKeysToReasonForPriorityTextField(String key) {
		try {
			reasonForPriorityTextField.sendKeys(key);
			System.out.println("Entered value in reason For Priority TextField");
		}catch (Exception e) {
			System.out.println("Not able to entered Reason For PriorityTextField");
		}
	}
	
	public void sendkeysToIntermittentMilestonesTextField(String key) {
		try {
			intermittentMilestonesTextField.sendKeys(key);
			System.out.println("Entered value in intermittent Milestones TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in intermittent Milestones TextField");
		}
	}
	
	public void verifyStep4SuccessfullMessage() {
		try {
			Step4SuccessfullMessage.isDisplayed();
			System.out.println("Step-4 Successfull Message is displayed");
		}catch (Exception e) {
			System.out.println("Step-4 Successfull Message is not displayed");
		}
	}
}
