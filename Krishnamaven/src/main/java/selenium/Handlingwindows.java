package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.sjavac.Log;

public class Handlingwindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String parentwindow=driver.getWindowHandle();
		
		//to move to child window and close window
		WebElement openwindow=driver.findElement(By.id("home"));
		openwindow.click();
		Thread.sleep(2000);
		Set<String> childwindow=driver.getWindowHandles();
		for (String string : childwindow) {	
			System.out.println(string);
			driver.switchTo().window(string);
		}
			boolean chehckeditbutton=driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).isDisplayed();
			Thread.sleep(2000);
			if(chehckeditbutton==true) {
				assert(true);
			}
			driver.close();

		driver.switchTo().window(parentwindow);
		
		//get titles of new windows and close child windows not parent window
		
		WebElement gettiles=driver.findElement(By.xpath("(//*[@id=\"color\"])[1]"));
		gettiles.click();
		Set<String> childwindows=driver.getWindowHandles();
		for (String string : childwindows) {	
			//System.out.println(driver.getTitle());	
			driver.switchTo().window(string);	
			System.out.println(driver.getTitle());	
			if(!string.equals(parentwindow))
			{
				//driver.switchTo().window(string);
				driver.close();	
			}		
		}	
		driver.switchTo().window(parentwindow);
		
		//store windows element in list
		WebElement multiplewindows=driver.findElement(By.xpath("(//*[@id=\"color\"])[1]"));
		multiplewindows.click();
		Set<String> child=driver.getWindowHandles();
		List<String> Allwin= new ArrayList<String>(child);
		driver.switchTo().window(Allwin.get(1));
		System.out.println(driver.getTitle());
//		for (String object : Allwin) {
//			driver.switchTo().window(object);
//			Allwin.get(0);
//		}
		
		driver.quit();
		
	
		
	}
	}		
		
	


