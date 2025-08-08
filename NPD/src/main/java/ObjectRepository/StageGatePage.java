package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StageGatePage {
	
	WebDriver driver;
	public StageGatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}

	@FindBy(xpath = "//button[text()='Stage 1']")
	private WebElement stageOneButton;
	
	@FindBy(xpath = "//button[text()='Stage 2']")
	private WebElement stage2Button;
	
	@FindBy(xpath = "//button[text()='Stage 3']")
	private WebElement stage3Button;
	
	@FindBy(xpath = "//button[text()='Stage 4']")
	private WebElement stage4Button;
	
	@FindBy(xpath = "//span[text()='All']")
	private WebElement allDropDownButton;
	
	@FindBy(xpath = "//div[text()='Rejected']")
	private WebElement rejectedButton;
	
	@FindBy(xpath = "//span[text()='Info']")
	private WebElement infoButton;
	
	@FindBy(xpath = "//span[text()='Create brief']")
	private WebElement createBriefButton;
	
//	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/span[3]")
	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/span[3]//tbody/tr[1]/td[7]/div[1]/span[3]")
	private WebElement createLineTrail;
	
	
	public void clickOnStageOneButton() {
		try {
			stageOneButton.click();
			System.out.println("Clicked on stage-1 Button");
		}catch (Exception e) {
			System.out.println("Not able to click On stage-1 Button");
		}
	}
	
	public void clickOncreateBriefButton() {
		try {
			createBriefButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click On createBrief Button");
		}
	}
	
	public void clickOnStage2Button() {
		try {
		     stage2Button.click();
		     System.out.println("Clicked on stage-2 Button");
		}catch (Exception e) {
			System.out.println("Not able to click On stage-2 Button");
		} 
	}
	
	public void clickOnStage3Button() {
		try {
			stage3Button.click();
	        System.out.println("Clicked on stage-3 Button");
		}catch (Exception e) {
			System.out.println("Not able to click On stage-3 Button");
		} 
	}
	
	public void clickOnStage4Button() {
		try {
			stage4Button.click();
			System.out.println("Not able to click on stage-4 Button");
		}catch (Exception e) {
			System.out.println("Not able to click On stage-4 Button");
		}
	} 
	
	public void clickOnAllDropDownButton() {
		try {
			allDropDownButton.click();
			System.out.println("Not able to click on All DropDown Button");
		}catch (Exception e) {
			System.out.println("Not able to click On All DropDown Button");
		}
	} 
	
	public void clickOnRejectedButton() {
		try {
			rejectedButton.click();
			System.out.println("Not able to click on Rejected Button");
		}catch (Exception e) {
			System.out.println("Not able to click On Rejected Button");
		}
	} 
	
	public void clickOnInfoButton() {
		try {
			infoButton.click();
			System.out.println("Not able to click on Info Button");
		}catch (Exception e) {
			System.out.println("Not able to click On Info Button");
		}
	}
}
