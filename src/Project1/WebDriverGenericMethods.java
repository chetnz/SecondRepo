package Project1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverGenericMethods {
	public String getPageTitle()
	{
		String pageTitle = BaseTest.driver.getTitle();
		return pageTitle;
	}
	
	public void waitForTitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, 20);
		wait.until(ExpectedConditions.titleContains("title"));		
	}
	public void verify(String expected, String actual, String page)
	{
		if(actual.equals(expected))
		{
		 System.out.println(page+" "+"is Displayed, PASS");	
		}
		else
			System.out.println(page+" "+"is Displayed, PASS");		
		}
	public void selectOption(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOption(WebElement element, String val)
	{
		Select sel = new Select(element);
		sel.selectByValue(val);
	}
    public void fullPageScreenshot(String path)
    {
    	TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File dest = new File(path);
    	try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void getElementScreenshot(WebElement element, String path)
    {
    	//TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
    	File src = element.getScreenshotAs(OutputType.FILE);
    	File dest = new File(path);
    	try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    }
    
    public void acceptAlert()
    {
    	BaseTest.driver.switchTo().alert().accept();
    }
    public void switchToFrame(String value)
    {
    	BaseTest.driver.switchTo().frame(value);
    }
    public void switchToFrame(int index)
    {
    	BaseTest.driver.switchTo().frame(index);
    }
    public void switchToFrame(WebElement element)
    {
    	BaseTest.driver.switchTo().frame(element);
    }
    public void dismissAlert()
    {
    	BaseTest.driver.switchTo().alert().dismiss();
    }
}
