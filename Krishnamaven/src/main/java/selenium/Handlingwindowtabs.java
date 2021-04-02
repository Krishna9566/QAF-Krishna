package selenium;

import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.sun.tools.sjavac.Log;

public class Handlingwindowtabs {
	WebDriver driver;
	@BeforeTest
	public void getdriver()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
	}
	
	@Test
	public void windowtab() throws InterruptedException
	{	
	WebElement tabclick=driver.findElement(By.id("tabButton"));
	tabclick.click();
	Thread.sleep(2000);
	
	Set<String> windows=driver.getWindowHandles();
	for (String string : windows) {
		driver.switchTo().window(string);
		System.out.println(driver.getTitle());
	}
	WebElement tabtext=driver.findElement(By.id("sampleHeading"));
	System.out.println(tabtext.getText());
	}
	
	@AfterTest
	public void driverclose()
	{
		driver.quit();
	}
}
