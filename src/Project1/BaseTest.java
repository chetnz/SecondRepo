package Project1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConts {
	
	public static WebDriver driver;
	
		
		@BeforeClass
		public void openBrowser() throws Throwable 
		{
			FileLib flib = new FileLib();
		String browserValue = flib.readProperty(PROP_PATH, "browser");
		if(browserValue.equals("chrome"))
		{
			System.setProperty(CHROME_VALUE, CHROME_PATH);
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_VALUE, GECKO_PATH);
			driver=new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		String appUrl = flib.readProperty(PROP_PATH, "url");
		driver.get(appUrl);
		
		 WebDriverGenericMethods wlib = new WebDriverGenericMethods();
		 wlib.verify(flib.readProperty(PROP_PATH, "loginTitle"), wlib.getPageTitle(), "Login Page");
		}
		
		
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}


	}
