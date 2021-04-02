package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		
		String oldwindow=driver.getWindowHandle();
		System.out.println(oldwindow);
		
		WebElement homebuttonclick=driver.findElement(By.id("windowButton"));
		for(int i = 0; i < 3; i++)
		{
			homebuttonclick.click();
		Thread.sleep(3000);
		}
		
		String lastwindow="";
		Set<String> allwindows=driver.getWindowHandles();
		for (String a : allwindows) {
			System.out.println("Switching to window handle" +a);
			driver.switchTo().window(a);
			driver.get("http:\\www.google.com");
			lastwindow=a;
		}
				
		//driver.switchTo().window(oldwindow);
		
		driver.switchTo().window(lastwindow);
		driver.get("https://demoqa.com/browser-windows");
		
		driver.quit();
	}

}
