package GenericUtility;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import ObjectRepository.AddBriefPage;
import ObjectRepository.DashBoardPage;
import ObjectRepository.LoginPage;
import ObjectRepository.StageGatePage;



public class BaseClass {

	public static WebDriver driver;
	public Driverutility driverUtility;
	public FileUtility fileUtility;
	public LoginPage loginpage;
	public DashBoardPage dashboardPage;
	public StageGatePage stageGatePage ;
	public AddBriefPage addBriefPage;
	
	@BeforeClass
	public void Login() {
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://gtfl-npd-webapp.azurewebsites.net/");
		
		driverUtility=new Driverutility();
		fileUtility= new FileUtility();
		loginpage =new LoginPage(driver);
		dashboardPage = new DashBoardPage(driver);
		stageGatePage = new StageGatePage(driver);
		addBriefPage = new AddBriefPage(driver);
	}
	
}
