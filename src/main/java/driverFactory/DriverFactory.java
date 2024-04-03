package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public static ThreadLocal<WebDriver> tDriver=new ThreadLocal<>();
	
	public WebDriver initDriver(String browser)
	{
		if(browser.equals("chrome"))
		{   
		//	WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			tDriver.set(driver);
		}
		else if(browser.equals("firefox"))
		{
			tDriver.set(new FirefoxDriver());
		}
		else
		{
			System.out.println("Browser not availiable "+browser);
		}
	return getDriver();
	}
	
	public static synchronized WebDriver getDriver()
	{
		return tDriver.get();
	}

}
