package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollingfunction {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,500)","");
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,-500)","");
		Thread.sleep(2000);
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(2000);
		executor.executeScript("window.scrollTo(0,0)","");
		Thread.sleep(2000);
		
		
		WebElement linktext=driver.findElement(By.xpath("//*[text()='online tool']"));
		executor.executeScript("arguments[0].scrollIntoView(true);",linktext);
		Thread.sleep(2000);
		driver.quit();
	}

}
