package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;

public class DashBoardPage extends BaseClass{

	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Stage Gates']")
	private WebElement stageGateButton;
	
	public void ClickOnstageGateButton() {
		if(stageGateButton.isDisplayed()) {
			stageGateButton.click();
			System.out.println("Clicked on Stage Gate Button");
		}else {
			System.out.println("Not able to click on stageGateButton");
		}
	}
	
	
}
