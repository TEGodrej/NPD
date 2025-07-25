package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddBrief_ProductDetailPage {

	
	WebDriver driver;
	public AddBrief_ProductDetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	
}
