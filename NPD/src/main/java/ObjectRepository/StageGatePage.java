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
	
	@FindBy(xpath = "//span[text()='Create brief']")
	private WebElement createBriefButton;
	
	
	public void clickOnStageOneButton() {
		if(stageOneButton.isDisplayed()) {
			stageOneButton.click();
		}else {
			System.out.println("Not able to click On stage 1 Button");
		}
	}
	
	public void clickOncreateBriefButton() {
		if(createBriefButton.isDisplayed()) {
			createBriefButton.click();
		}else {
			System.out.println("Not able to click On createBrief Button");
		}
	}
}
