package Base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
private static ThreadLocal<WebDriver> driver= new ThreadLocal();

public WebDriver getDriver()
{
	
	return driver.get();
}

public WebDriver driverInitialization(String browser)
{
	WebDriver localDriver=null;
	
	switch(browser.toLowerCase())
	{
	case "chrome":
	localDriver= new ChromeDriver();
	break;
	case "edge":
		localDriver= new EdgeDriver();
		break;
	case "firefox":
		localDriver= new FirefoxDriver();
	break;
	default:
		throw new IllegalArgumentException("invalid driver");
	}
	localDriver.manage().window().maximize();
	localDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.set(localDriver);
	return localDriver;
	System.out.println("hello");
	

	
	
}


	
	

}
