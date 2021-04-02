package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverdetails {
	public static WebDriver driver;
	public void driverdetail(String url)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	}
}
