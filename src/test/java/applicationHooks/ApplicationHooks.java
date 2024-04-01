package applicationHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.ConfigReader;

public class ApplicationHooks {
//	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	@Before(order =0)
	public void getProperty()
	{
		configReader=new ConfigReader();
		 prop=configReader.init();
		
	}
	@Before(order=1)
	public void launchBrowser()
	{
		String browser=prop.getProperty("browser");
		DriverFactory Df=new DriverFactory();
		driver=Df.initDriver(browser);
	}
	
	@After(order=1)
	public void screenShot(Scenario sce)
	{
		if(sce.isFailed())
		{
			byte[] scrnshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sce.attach(scrnshot, "image/png", "scrnshot");
		}
	}
	@After(order=0)
	public void tearDown()
	{
		driver.quit();
	}
	

}
