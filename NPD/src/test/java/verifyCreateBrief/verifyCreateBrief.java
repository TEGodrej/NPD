package verifyCreateBrief;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class verifyCreateBrief extends BaseClass{
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNot() {
		String Message = "test1";
		String Message1= "test2";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnProjectChampionTextField();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
		addBriefPage.ClickOnkeyMarketsTextField(Message1);
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnChannelTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnCustomerRole();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnEPDButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnNewCustomer();
		WebElement customerDetails= driver.findElement(By.xpath("//h4[text()='Customer Details']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", customerDetails);
//		WebElement pc=driver.findElement(By.xpath("//div[@class='ant-select-selector']/descendant::input[@id='rc_select_4']"));
//		js.executeScript("arguments[0].click();", pc);
//		pc.click();
		addBriefPage.clickOnProductCategory1();
		addBriefPage.clickOnFrozenOption();
//		addBriefPage.clickOnProductCategory2();
//		driverUtility.implicitlyWait(4);
//		addBriefPage.clickOnNuggetsOption();
////		driverUtility.implicitlyWait(4);
////		addBriefPage.ClickOnvegTextField();
////		driverUtility.implicitlyWait(4);
////		addBriefPage.ClickOnmenuOption();
//		WebElement customerDetails= driver.findElement(By.xpath("//h4[text()='Customer Details']"));
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", customerDetails);
//		addBriefPage.clickOnB2bRadioButton();
//		addBriefPage.clickOnExistingB2B();
//		addBriefPage.clickOnNextButton();
		
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringProjectChampion() {
		String Message = "test1";
		String Message1= "test2";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
		addBriefPage.ClickOnkeyMarketsTextField(Message1);
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnChannelTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnCustomerRole();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnEPDButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnNewCustomer();
		addBriefPage.clickOnProductCategory1();
		addBriefPage.clickOnFrozenOption();
		addBriefPage.clickOnProductCategory2();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnNuggetsOption();
//		driverUtility.implicitlyWait(4);
//		addBriefPage.ClickOnvegTextField();
//		driverUtility.implicitlyWait(4);
//		addBriefPage.ClickOnmenuOption();
		WebElement customerDetails= driver.findElement(By.xpath("//h4[text()='Customer Details']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", customerDetails);
		addBriefPage.clickOnB2bRadioButton();
		addBriefPage.clickOnExistingB2B();
		addBriefPage.clickOnNextButton();
	}

	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutSelectingRnDLead() {
		String Message = "test1";
		String Message1= "test2";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnProjectChampionTextField();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
		addBriefPage.ClickOnkeyMarketsTextField(Message1);
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnChannelTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnCustomerRole();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnEPDButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnNewCustomer();
		addBriefPage.clickOnProductCategory1();
		addBriefPage.clickOnFrozenOption();
		addBriefPage.clickOnProductCategory2();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnNuggetsOption();
//		driverUtility.implicitlyWait(4);
//		addBriefPage.ClickOnvegTextField();
//		driverUtility.implicitlyWait(4);
//		addBriefPage.ClickOnmenuOption();
		WebElement customerDetails= driver.findElement(By.xpath("//h4[text()='Customer Details']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", customerDetails);
		addBriefPage.clickOnB2bRadioButton();
		addBriefPage.clickOnExistingB2B();
		addBriefPage.clickOnNextButton();
		
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringObjective() {
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringKeyMarket() {
		String Message = "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnProjectChampionTextField();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringChannel() {
		String Message = "test1";
		String Message1= "test2";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnProjectChampionTextField();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
		addBriefPage.ClickOnkeyMarketsTextField(Message1);
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringEPDNPD(){
		String Message = "test1";
		String Message1= "test2";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnProjectChampionTextField();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
		addBriefPage.ClickOnkeyMarketsTextField(Message1);
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnChannelTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnCustomerRole();
		driverUtility.implicitlyWait(4);
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringVegNonVeg (){
		String Message = "test1";
		String Message1= "test2";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnProjectChampionTextField();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
		addBriefPage.ClickOnkeyMarketsTextField(Message1);
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnChannelTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnCustomerRole();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnEPDButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnNewCustomer();
		addBriefPage.clickOnProductCategory1();
		addBriefPage.clickOnFrozenOption();
		addBriefPage.clickOnProductCategory2();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnNuggetsOption();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringProductCategory() {
		String Message = "test1";
		String Message1= "test2";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnProjectChampionTextField();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
		addBriefPage.ClickOnkeyMarketsTextField(Message1);
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnChannelTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnCustomerRole();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnEPDButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnNewCustomer();
	}
	
	@Test
	public void ToCheckCancelFeatures() {
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnCancelButton();
		addBriefPage.clickOnCrossSignButton();
	}
	
	@Test
	public void verifyUserAbleToSaveBriefAsSaveSsDraft() {
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnCancelButton();
		addBriefPage.clickOnSaveAsDraftButton();
		addBriefPage.verifySuccessPopMessage();
	}
	
	@Test
	public void verifyUserAbleToEditBriefAfterClickingOnContinueEditingButton() {
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnCancelButton();
		addBriefPage.clickOnContinueEditingButton();
		addBriefPage.verifyPageTitle();
	}
	
	@Test
	public void ToCheckIfThePageIsMovingToNextPageProductDetails() {
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
	}
	
	@Test
	public void ToCheckIfThePageIsMovingToPreviousPageProductDetails() {
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnPreviousButton();
		addBriefPage.verifyPageHeader();
	}
	
	@Test
	public void VerifyUserAbleToCreateProductDetailOrNot() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
		
		
	}
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringProductNameFlavoursSKUSizes() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
		addBrief_ProductDetailPage.clickOnPreviousButton();
	}
	
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringBenchmarksInternal() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringBenchmarksExternal() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringPointOfDifferentiationVsInternal() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringIfPointOfDifferentiationVsExternal() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
		
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringClaims() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringConceptConsumerInsightProductStory_USP_RTB() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringNewPackaging() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringPhysicalAttributeShapeSizeAppearance() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringSensorialAttribute_Flavour_Taste_Texture() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringExpectedShelfLife() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringMustHave() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringGoodToHave() {
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
	}
	
	@Test
	public void PreviousPageShouldBeDisplayAfterClickingOnThePreviousButton() {
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnPreviousButton();
		addBriefPage.verifyPageTitle();
	}
	
	@Test
	public void VerifyFurtherPageShouldBeDisplayAfterClickingOnTheNextButton() {
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyCommercialPageTitle();
	}
	
	@Test
	public void VerifyUserShouldBeAbleToFillAllRequiredDetailsInCommercialPage() {
		String testMessage="Test";
		String testData= "23";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyCommercialPageTitle();
		commercialsPage.clickOnMonthsEstimateVolume(testData);
		commercialsPage.clickOnMonthValue(testData);
		commercialsPage.clickOnExpectedPrice(testData);
		commercialsPage.clickOnExpectedContributton(testData);
		commercialsPage.sendKeysToCurrentContribution(testData);
		commercialsPage.clickOnYesRadioButton();
		commercialsPage.sendKeysToRationalCollection(testMessage);
		commercialsPage.sendKeysToWhyToDo(testMessage);
		commercialsPage.sendKeysToRmIdealTextField(testData);
		commercialsPage.sendKeysToRMnoGoTextField(testData);
		commercialsPage.sendKeysTopmIdealTextField(testData);
		commercialsPage.sendKeysToPmNoGoCostTextField(testData);
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyStep3SuccessfullMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOnMileStonePage() {
		String testMessage="Test";
//		String testData= "23";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyCommercialPageTitle();
		addBriefPage.clickOnNextButton();
		driverUtility.implicitlyWait(10);
		mileStonePage.ClickOnExpectedDeliveryDate();
		driverUtility.implicitlyWait(10);
		mileStonePage.clickOnNextMonthArrowButton();
		mileStonePage.clickOnDate();
		mileStonePage.clickOnProjectPriorityDropDown();
		mileStonePage.clickOnDropDownFirstOption();
		mileStonePage.sendKeysToReasonForPriorityTextField(testMessage);
		mileStonePage.sendkeysToIntermittentMilestonesTextField(testMessage);
		addBriefPage.clickOnNextButton();
		mileStonePage.verifyStep4SuccessfullMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOnMileStonePageWithPriorityOfProjectAsIntermediate_6_9_Months() {
		String testMessage="Test";
//		String testData= "23";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyCommercialPageTitle();
		addBriefPage.clickOnNextButton();
		driverUtility.implicitlyWait(10);
		mileStonePage.ClickOnExpectedDeliveryDate();
		driverUtility.implicitlyWait(10);
		mileStonePage.clickOnNextMonthArrowButton();
		mileStonePage.clickOnDate();
		mileStonePage.clickOnProjectPriorityDropDown();
		mileStonePage.clickOnDropDownSecondOption();
		mileStonePage.sendKeysToReasonForPriorityTextField(testMessage);
		mileStonePage.sendkeysToIntermittentMilestonesTextField(testMessage);
		addBriefPage.clickOnNextButton();
		mileStonePage.verifyStep4SuccessfullMessage();
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOnMileStonePageWithPriorityOfProjectAsStrategic_12_15_Months() {
		String testMessage="Test";
//		String testData= "23";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyCommercialPageTitle();
		addBriefPage.clickOnNextButton();
		driverUtility.implicitlyWait(10);
		mileStonePage.ClickOnExpectedDeliveryDate();
		driverUtility.implicitlyWait(10);
		mileStonePage.clickOnNextMonthArrowButton();
		mileStonePage.clickOnDate();
		mileStonePage.clickOnProjectPriorityDropDown();
		mileStonePage.clickOnDropDownThirdOption();
		mileStonePage.sendKeysToReasonForPriorityTextField(testMessage);
		mileStonePage.sendkeysToIntermittentMilestonesTextField(testMessage);
		addBriefPage.clickOnNextButton();
		mileStonePage.verifyStep4SuccessfullMessage();
	}
	
	@Test
	public void NextPageShouldDisplayAfterClickingOnTheNextButton() {
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyCommercialPageTitle();
		addBriefPage.clickOnNextButton();
		mileStonePage.verifyMileStonePAgeTitle();
		addBriefPage.clickOnNextButton();
		operationsPage.verifyoperationPageTitle();
		
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringReasonForPrioritization_TargetConsumer_SourceOfBusiness_Business_Rationale() {
		String testMessage="Test";
//		String testData= "23";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyCommercialPageTitle();
		addBriefPage.clickOnNextButton();
		driverUtility.implicitlyWait(10);
		mileStonePage.ClickOnExpectedDeliveryDate();
		driverUtility.implicitlyWait(10);
		mileStonePage.clickOnNextMonthArrowButton();
		mileStonePage.clickOnDate();
		mileStonePage.clickOnProjectPriorityDropDown();
		mileStonePage.clickOnDropDownFirstOption();
		mileStonePage.sendkeysToIntermittentMilestonesTextField(testMessage);
		addBriefPage.clickOnNextButton();
		mileStonePage.verifyStep4SuccessfullMessage();
		
	}
	
	@Test
	public void VerifyUserAbleToCreateBriefOrNotWithoutEnteringIntermittentMilestones() {
		String testMessage="Test";
//		String testData= "23";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyCommercialPageTitle();
		addBriefPage.clickOnNextButton();
		driverUtility.implicitlyWait(10);
		mileStonePage.ClickOnExpectedDeliveryDate();
		driverUtility.implicitlyWait(10);
		mileStonePage.clickOnNextMonthArrowButton();
		mileStonePage.clickOnDate();
		mileStonePage.clickOnProjectPriorityDropDown();
		mileStonePage.clickOnDropDownFirstOption();
		mileStonePage.sendKeysToReasonForPriorityTextField(testMessage);
		addBriefPage.clickOnNextButton();
		mileStonePage.verifyStep4SuccessfullMessage();
	}
	
	@Test
	public void VerifyReviewFunctionality() {
		String Message = "test1";
		String Message1= "test2";
		String testMessage="Test";
		String testData= "23";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnProjectChampionTextField();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
		addBriefPage.ClickOnkeyMarketsTextField(Message1);
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnChannelTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnCustomerRole();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnEPDButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnNewCustomer();
		addBriefPage.clickOnProductCategory1();
		addBriefPage.clickOnFrozenOption();
		addBriefPage.clickOnProductCategory2();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnNuggetsOption();
//		driverUtility.implicitlyWait(4);
//		addBriefPage.ClickOnvegTextField();
//		driverUtility.implicitlyWait(4);
//		addBriefPage.ClickOnmenuOption();
		WebElement customerDetails= driver.findElement(By.xpath("//h4[text()='Customer Details']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", customerDetails);
		addBriefPage.clickOnB2bRadioButton();
		addBriefPage.clickOnExistingB2B();
		addBriefPage.clickOnNextButton();
		String TestMessage= "test1";
		driverUtility.implicitlyWait(10);
//		loginpage.Login();
//		loginpage.ClickOnLoginButton();
//		dashboardPage.ClickOnstageGateButton();
//		driverUtility.implicitlyWait(4);
//		stageGatePage.clickOnStageOneButton();
//		stageGatePage.clickOncreateBriefButton();
//		addBriefPage.clickOnNextButton();
		addBriefPage.verifySecondPageTitle();
		addBrief_ProductDetailPage.sendkeyToProductNameTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalBenchMarkTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToInternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToExternalPointOfDifferenceTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToClaimsTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToConceptTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToYesRadioButton();
		WebElement goodtoHaveTitle=driver.findElement(By.xpath("//label[@title='Good to Have']"));
//		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", goodtoHaveTitle);
		addBrief_ProductDetailPage.sendkeyToPackagingTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToProductActionStandardTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToSensorialAttributeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToShelfLifeTextField(TestMessage);
		addBrief_ProductDetailPage.sendkeyToMustHaveTextfield(TestMessage);
		addBrief_ProductDetailPage.sendkeyToGoodToHaveTextField(TestMessage);
		addBrief_ProductDetailPage.ClickOnNextButton();
		addBrief_ProductDetailPage.verifySuccessMessage();
		commercialsPage.verifyCommercialPageTitle();
		commercialsPage.clickOnMonthsEstimateVolume(testData);
		commercialsPage.clickOnMonthValue(testData);
		commercialsPage.clickOnExpectedPrice(testData);
		commercialsPage.clickOnExpectedContributton(testData);
		commercialsPage.sendKeysToCurrentContribution(testData);
		commercialsPage.clickOnYesRadioButton();
		commercialsPage.sendKeysToRationalCollection(testMessage);
		commercialsPage.sendKeysToWhyToDo(testMessage);
		commercialsPage.sendKeysToRmIdealTextField(testData);
		commercialsPage.sendKeysToRMnoGoTextField(testData);
		commercialsPage.sendKeysTopmIdealTextField(testData);
		commercialsPage.sendKeysToPmNoGoCostTextField(testData);
		addBriefPage.clickOnNextButton();
		commercialsPage.verifyStep3SuccessfullMessage();
	}
	
	@Test
	public void CustomerDetailsInStage_1_BriefB2B_ExistingAfterSelectionOfCustomerBasisChannelSelectedCustomerTypeAndSalesOfficerNameShouldBeAutoPopulated() {
		String Message = "test1";
		String Message1= "test2";
		driverUtility.implicitlyWait(10);
		loginpage.Login();
		loginpage.ClickOnLoginButton();
		dashboardPage.ClickOnstageGateButton();
		driverUtility.implicitlyWait(4);
		stageGatePage.clickOnStageOneButton();
		stageGatePage.clickOncreateBriefButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnProjectChampionTextField();
		driverUtility.implicitlyWait(4);
		
		addBriefPage.ClickOnUserNameTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDLeadTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnRnDUserName();
		addBriefPage.ClickandSendKeyOnobjectiveTextField(Message);
		addBriefPage.ClickOnkeyMarketsTextField(Message1);
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnChannelTextField();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnCustomerRole();
		driverUtility.implicitlyWait(4);
		addBriefPage.ClickOnEPDButton();
		driverUtility.implicitlyWait(4);
		addBriefPage.clickOnExistingCustomer();
		addBriefPage.clickOnProductCategory1();
//		addBriefPage.clickOnFrozenOption();
//		addBriefPage.clickOnProductCategory2();
//		driverUtility.implicitlyWait(4);
//		addBriefPage.clickOnNuggetsOption();
//		driverUtility.implicitlyWait(4);
//		addBriefPage.ClickOnvegTextField();
////		driverUtility.implicitlyWait(4);
////		addBriefPage.ClickOnmenuOption();
//		WebElement customerDetails= driver.findElement(By.xpath("//h4[text()='Customer Details']"));
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", customerDetails);
//		addBriefPage.clickOnB2bRadioButton();
//		addBriefPage.clickOnExistingB2B();
//		addBriefPage.clickOnNextButton();
	}
}
