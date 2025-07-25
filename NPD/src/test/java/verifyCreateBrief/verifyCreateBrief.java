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
}
