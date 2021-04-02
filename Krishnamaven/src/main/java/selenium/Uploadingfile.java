package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadingfile {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement choosefile=driver.findElement(By.name("filename"));
				
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", choosefile);
		
		//choosefile.click();	
		Thread.sleep(5000);
		
		String file="C:\\Users\\Admin\\Downloads\\dropdown.java";
		//String finalstring=String.join("\\","C:","Users","Admin","Downloads","dropdown.java");
		StringSelection selector=new StringSelection(file.replace("\\", "\\"));
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selector, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
