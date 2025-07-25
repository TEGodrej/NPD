package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;

public class AddBriefPage extends BaseClass{

	WebDriver driver;
	public AddBriefPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]")
	private WebElement projectChampionTextField;
	
	@FindBy(xpath = "//div[contains(text(),'Abhay Parnerkar')]")
	private WebElement userNameTextField;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement RnDLeadTextField;
	
	@FindBy(xpath = "//div[text()='Lokesh Swarankar']")
	private WebElement RnDUserName;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Objective']")
	private WebElement objectiveTextField;
	
	@FindBy(xpath = "//textarea[@name='keyMarkets']")
	private WebElement keyMarketsTextField;
	
	@FindBy(xpath = "//div[@class=\"ant-select-selection-overflow\"]")
	private WebElement channelTextField;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='RETAIL']")
	private WebElement customerRole;
	
	@FindBy(xpath = "//div[@class=\"ant-select ant-select-outlined ant-select-in-form-item css-1v613y0 ant-select-single ant-select-show-arrow\"]//div[@class=\"ant-select-selector\"]")
	private WebElement EPDButton;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='New']")
	private WebElement NewCustomer;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement vegTextField;
	
	@FindBy(xpath = "//div[@id=\"rc_select_12_list_0\"]")
	private WebElement menuOption;
	
	@FindBy(xpath = "(//span[@class=\"ant-select-selection-item\"])[5]")
	private WebElement categoryTextField;
	
	@FindBy(xpath = "//input[@id='rc_select_6']")
	private WebElement productCategory1;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Frozen']")
	private WebElement FrozenOption;
	
	@FindBy(xpath = "//input[@id='rc_select_7']")
	private WebElement productCategory2;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Nuggets']")
	private WebElement nuggetsOption;
	
	@FindBy(xpath = "//input[@value='B2B']")
	private WebElement b2bRadioButton;
	

	@FindBy(xpath = "//input[@value='Existing']")
	private WebElement existingB2B;
	
	@FindBy(xpath = "//input[@value='New']")
	private WebElement newB2B;
	
	@FindBy(xpath = "//input[@id='rc_select_17']")
	private WebElement selectTheCustomer;
	
	@FindBy(xpath = "//span[normalize-space()='B2B']")
	private WebElement B2bOption;
	
	@FindBy(xpath = "//h4[text()='Customer Details']")
	private WebElement customerDetailsSection;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//div[text()='This field is required']")
	private WebElement errorMessage;
	
	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//span[text()='Save as draft']")
	private WebElement saveAsDraftButton;
	
	@FindBy(xpath = "//span[text()='Continue editing']")
	private WebElement continueEditingButton;
	
	@FindBy(xpath = "//span[text()='Clear Data']")
	private WebElement clearDataButton;
	
	@FindBy(xpath = "//button[@class=\"text-gray-400 hover:text-gray-600 transition-colors\"]//*[name()=\"svg\"]")
	private WebElement crossSignButton;
	
	
	public void ClickOnProjectChampionTextField() {
		if(projectChampionTextField.isDisplayed()) {
			projectChampionTextField.click();
		}else {
			System.out.println("Not able to click on project Champion TextField");
		}
	}
	
	public void ClickOnUserNameTextField() {
		try {
//			  By locator = By.xpath("//div[contains(text(),'Abhay Parnerkar')]");
//			driverUtility.explicitWaitByLocator(10, locator);
////			driverUtility.implicitlyWait(4);
//			driverUtility.SelectByVisibleText(projectChampionTextField, "Abhay Parnerkar");
//			driverUtility.ClickAction(userNameTextField);
			userNameTextField.click();
		}catch (Exception e) {
			System.out.println("Not able to click on userName Text Field");
		} 
	}
	
	public void ClickOnRnDLeadTextField() {
		try{
			RnDLeadTextField.click();
		}catch (Exception e) {
			System.out.println("Not able to click on RnDLead TextField");
		}
//		driverUtility.explicitWaitUntilClickable(10, RnDLeadTextField);
	}
	
	public void ClickOnRnDUserName() {
		try {
			RnDUserName.click();
		}catch (Exception e)  {
			System.out.println("Not able to click on RnDUserName");
		}
	}
	
	public void ClickandSendKeyOnobjectiveTextField(String key) {
		try {
			objectiveTextField.click();
			objectiveTextField.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to click on objective TextField");
		}
	}
	
	public void ClickOnkeyMarketsTextField(String key) {
		try {
			keyMarketsTextField.click();
			keyMarketsTextField.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to click on keyMarkets TextField");
		}
	}
	
	public void ClickOnChannelTextField() {
		try {
			channelTextField.click();
		}catch (Exception e) {
			System.out.println("Not able to click on channel TextField");
		}
	}
	
	public void ClickOnCustomerRole() {
		try {
			customerRole.click();
		}catch (Exception e)  {
			System.out.println("Not able to click on customerRole");
		}
	}
	
	public void ClickOnEPDButton() {
		try {
			EPDButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on EPDButton");
		}
	}
	
	public void ClickOnNewCustomer() {
		try {
			NewCustomer.click();
		}catch (Exception e) {
			System.out.println("Not able to click on NewCustomer");
		}
		
	}
	
	public void ClickOnvegTextField() {
		try {
			vegTextField.click();
		}catch (Exception e)  {
			System.out.println("Not able to click on vegTextField");
		}
	}
	
	public void ClickOnmenuOption() {
		try {
			menuOption.click();
		}catch (Exception e)  {
			System.out.println("Not able to click on menuOption");
		}
	}
	
	public void clickOnProductCategory1() {
		try {
//			driverUtility.explicitWaitUntilClickable(10, productCategory1);

			productCategory1.click();
		}catch (Exception e) {
			System.out.println("Not able to click on productCategory1");
		}
	}
	
	public void clickOnFrozenOption() {
		try {
//			driverUtility.explicitWaitUntilClickable(5, chilledOption);
			FrozenOption.click();
		}catch (Exception e) {
			System.out.println("Not able to click on Frozen Option");
		}
	}
	
	public void clickOnProductCategory2() {
		try {
			productCategory2.click();
		}catch (Exception e) {
			System.out.println("Not able to click on productCategory2");
		}
	}
	
	public void clickOnNuggetsOption() {
		try {
			nuggetsOption.click();
		}catch (Exception e) {
			System.out.println("Not able to click on Nuggets Option");
		}
	}
	
	public void clickOnB2bRadioButton() {
		try {
//			driverUtility.scrollIntoView(b2bRadioButton);
//			driverUtility.scrollToElement(b2bRadioButton);
//			driverUtility.scrollByAction(b2bRadioButton);
//			driverUtility.scrollToElement(b2bRadioButton);
//			driverUtility.forceScrollPage(B2bOption);
//			driverUtility.explicitWaitForVisibility(10, customerDetailsSection);
//			driverUtility.scrollToCenter(customerDetailsSection);
			b2bRadioButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on B2B radio button");
		}
	}
	
	public void clickOnExistingB2B() {
		try {
			existingB2B.click();
		}catch (Exception e) {
			System.out.println("Not able to click on existing B2B radio button");
		}
	}
	
	public void clickOnNewB2B() {
		try {
			newB2B.click();
		}catch (Exception e) {
			System.out.println("Not able to click on new B2B radio button");
		}
	}
	
	public void clickOnSelectTheCustomer() {
		try {
			selectTheCustomer.click();
		}catch (Exception e) {
			System.out.println("Not able to click on selectTheCustomer TextField");
		}
	}
	
	public void clickOnNextButton() {
		try {
			nextButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on next Button");
		}
	}
	
	public void clickOnCancelButton() {
		try {
			cancelButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on cancel Button");
		}
	}
	
	public void clickOnSaveAsDraftButton() {
		try {
			saveAsDraftButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on saveAsDraft Button");
		}
	}
	
	public void clickOnContinueEditingButton() {
		try {
			continueEditingButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on Continue Editing Button");
		}
	}
	
	public void clickOnClearDataButton() {
		try {
			clearDataButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on Clear Data Button");
		}
	}
	
	public void clickOnCrossSignButton() {
		try {
			crossSignButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on Cross Sign Button");
		}
	}
}
