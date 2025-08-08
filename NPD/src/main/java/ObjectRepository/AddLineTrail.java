package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddLineTrail {

	@FindBy(xpath = "//input[@id='trialDate']")
	private WebElement dateTextField;
	
	@FindBy(id = "productionSite")
	private WebElement productionSiteTextField;
	
	@FindBy(id = "productWeight")
	private WebElement productWeightTextField;
	
	@FindBy(xpath = "//input[@value='Trial Successful – No further trials are needed']")
	private WebElement outComeFirstOption;
	
	@FindBy(xpath = "//input[@value='Trial Successful – But refinement needed']")
	private WebElement outComeSecondOption;
	
	@FindBy(xpath = "//input[@value='Trial Unsuccessful – Further trials required']")
	private WebElement outComeThirdOption;
	
	@FindBy(xpath = "//input[@value='Trial Unsuccessful – Product should be abandoned']")
	private WebElement outComeForthOption;
	
	@FindBy(id = "tpm")
	private WebElement OilTempTextField;
	
	@FindBy(id = "promix")
	private WebElement PromixMixinTimeTextField;
	
	@FindBy(id = "productTempAfterMixing")
	private WebElement  productTempAfterMixingTextField;
	
	@FindBy(id = "productTempAfterForming")
	private WebElement productTempAfterFormingTextField;
	
	@FindBy(id = "formerStrokes")
	private WebElement formerStrokesTextField;
	
	@FindBy(id = "iqfTemp")
	private WebElement iqfTempTextField;
	
	@FindBy(id = "batterViscosity")
	private WebElement batterViscosityTextfield;
	
	@FindBy(id = "remark")
	private WebElement remarkTextField;
	
	@FindBy(xpath = "//span[text()='Add a row']")
	private WebElement addRowButton;
	
	@FindBy(id = "productPackaging")
	private WebElement productPackagingTextField;
	
	@FindBy(id = "lineName")
	private WebElement lineNameTextField;
	
	@FindBy(id = "lineUsed")
	private WebElement lineUsedTextField;
	
	@FindBy(id = "packagingFormat")
	private WebElement packagingFormatTextField;
	
	@FindBy(id = "rawMaterialsObservation")
	private WebElement rawMaterialsObservationTextArea;
//	===========================================================================================================================
	@FindBy(id = "processingStepsObservation")
	private WebElement processingStepsObservationTextArea;
	
	@FindBy(id = "processingEquipmentObservation")
	private WebElement processingEquipmentObservationTextArea;
	
	@FindBy(id = "productivityObservation")
	private WebElement productivityObservationTextArea;
	
	@FindBy(id = "packingObservation")
	private WebElement packingObservationTextArea;
	
	@FindBy(id = "foodSafetyObservation")
	private WebElement foodSafetyObservationTextArea;
	
	@FindBy(id = "healthSafety")
	private WebElement healthSafetyTextArea;
	
	@FindBy(xpath = "//div[text()='Upload']")
	private WebElement UploadButton;
	
	@FindBy(id = "keyObservations")
	private WebElement keyObservationsTextArea;
	
	@FindBy(id = "responsiblePerson")
	private WebElement responsiblePersonDropDown;
	
	@FindBy(id = "timeline")
	private WebElement timelineDropDown;
	
	@FindBy(id = "approvals_production_name")
	private WebElement approvalsProductionNameDropDown;
	
	@FindBy(id = "approvals_fsqa_name")
	private WebElement approvals_fsqaNameDropDown;
	
	@FindBy(id = "approvals_npd_name")
	private WebElement approvals_npd_nameDropDown;
	
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveButton;
	
	
	public void clickOnDateTextField() {
		try {
			dateTextField.click();
			System.out.println("Clicked on Date ");
		}catch (Exception e) {
			System.out.println("Not able to click on ");
		}
	}
	
	public void SendKeysToProductionSiteTextField(String key) {
		try {
			productionSiteTextField.sendKeys(key);
			System.out.println("Entered value in Production Site TextField");
		}catch (Exception e) {
			System.out.println("Not able to entered value in Production Site TextField");
		}
	} 
	
	public void SendKeysToProductWeightTextField(String key) {
		try {
			productWeightTextField.sendKeys(key);
			System.out.println("Entered value in Product weight TextField");
		}catch (Exception e) {
			System.out.println("Not able to entered value in Product weight TextField");
		}
	}
	
	public void clickOnOutComeFirstOption() {
		try {
			outComeFirstOption.click();
			System.out.println("Clicked on outCome First Option");
		}catch (Exception e) {
			System.out.println("Not able to click on outCome First Option");
		}
	}
	
	public void clickOnOutComeSecondOption() {
		try {
			outComeSecondOption.click();
			System.out.println("Clicked on outCome Second Option");
		}catch (Exception e) {
			System.out.println("Not able to click on outCome Second Option");
		}
	}  
	
	public void clickOnoutComeThirdOption() {
		try {
			outComeThirdOption.click();
			System.out.println("Click on outCome Third Option");
		}catch (Exception e) {
			System.out.println("Not able to click on outCome Third Option");
		}
	}
	
	public void clickOnOutComeForthOption() {
		try {
			outComeForthOption.click();
			System.out.println("Clicked on outCome Forth Option");
		}catch (Exception e) {
			System.out.println("Not able to click on outCome Forth Option");
		}
	}
	
	public void SendkeyToOilTempTextField(String key) {
		try {
			OilTempTextField.sendKeys(key);
			System.out.println("Entered value in OilTemp TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in OilTemp TextField");
		}
	} 
	
	public void SendkeyToPromixMixinTimeTextField(String key) {
		try {
			PromixMixinTimeTextField.sendKeys(key);
			System.out.println("Entered value in PromixMixinTime TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in PromixMixinTime TextField");
		}
	} 
	
	public void SendkeyToProductTempAfterMixingTextField(String key) {
		try {
			productTempAfterMixingTextField.sendKeys(key);
			System.out.println("Entered value in Product Temp After Mixing TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in product Temp After Mixing TextField");
		}
	} 
	
	public void SendkeyToProductTempAfterFormingTextField(String key) {
		try {
			productTempAfterFormingTextField.sendKeys(key);
			System.out.println("Entered value in Product Temp After Forming TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in Product Temp After Forming TextField");
		}
	}  
	
	public void SendkeyToFormerStrokesTextField(String key) {
		try {
			formerStrokesTextField.sendKeys(key);
			System.out.println("Entered value in Former Strokes TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in Former Strokes TextField");
		}
	}  
	
	public void SendkeyToIqfTempTextField(String key) {
		try {
			iqfTempTextField.sendKeys(key);
			System.out.println("Entered value in IQF Temp TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in IQF Temp TextField");
		}
	}  
	
	public void SendkeyToBatterViscosityTextfiled(String key) {
		try {
			batterViscosityTextfield.sendKeys(key);
			System.out.println("Entered value in Batter Viscosity Textfield");
		}catch (Exception e) {
			System.out.println("Not able to enter value in Batter Viscosity Textfield");
		}
	} 
	
	public void SendkeyToRemarkTextField(String key) {
		try {
			remarkTextField.sendKeys(key);
			System.out.println("Entered value in Remark TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in Remark TextField");
		}
	}  
	
	public void clickOnAddRowButton() {
		try {
			addRowButton.click();
			System.out.println("Clicked on add Row Button");
		}catch (Exception e) {
			System.out.println("Not able to click on add Row Button");
		}
	}  
	
	public void SendkeyToProductPackagingTextField(String key) {
		try {
			productPackagingTextField.sendKeys(key);
			System.out.println("Entered value in Product Packaging TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in Product Packaging TextField");
		}
	}  
	
	public void SendkeyToLineNameTextField(String key) {
		try {
			lineNameTextField.sendKeys(key);
			System.out.println("Entered value in line Name TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in line Name TextField");
		}
	}  
	
	public void SendkeyToLineUsedTextField(String key) {
		try {
			lineUsedTextField.sendKeys(key);
			System.out.println("Entered value in line used TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in line used TextField");
		}
	}  
	
	public void SendkeyToPackagingFormatTextField(String key) {
		try {
			packagingFormatTextField.sendKeys(key);
			System.out.println("Entered value in Packaging Format TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in Packaging Format TextField");
		}
	}  
	
	public void SendkeyToRawMaterialsObservationTextArea(String key) {
		try {
			rawMaterialsObservationTextArea.sendKeys(key);
			System.out.println("Entered value in Raw Materials Observation TextArea");
		}catch (Exception e) {
			System.out.println("Not able to enter value in Raw Materials Observation TextArea");
		}
	} 
	
	
}
