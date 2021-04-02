package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");	
		
		
		//to get no of frames in webpage
		
		List<WebElement> framesize=driver.findElements(By.tagName("iframe"));
		//List<WebElement> framesize=driver.findElements(By.xpath("//iframe"));
		System.out.println("Total frame size is "+framesize.size());
		
		int size;
		//click inside the frame
		
		WebDriver no=driver.switchTo().frame(0);
		size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("inside frame size "+size);
		Thread.sleep(1000);
		WebElement frameinsideclick=driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		frameinsideclick.click();
		Thread.sleep(1000);
		System.out.println("After clicking the inside frame get text "+frameinsideclick.getText());
		
		driver.switchTo().defaultContent();
		
		//inside nested frame click
		
		//WebElement framenested=driver.findElement(By.id("frame2"));
		WebDriver frames=driver.switchTo().frame(1);
	    size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("inside frame size "+size); 
	    WebElement sample=driver.findElement(By.xpath("//*[@id='frame2']"));
	    driver.switchTo().frame(sample);
	    //driver.switchTo().frame(0);
		//driver.switchTo().frame("frame2");	
		Thread.sleep(1000);
		WebElement nestedclickbutton=driver.findElement(By.id("Click1"));
		nestedclickbutton.click();
		Thread.sleep(1000);
		System.out.println("After clicking the nested frame get text "+nestedclickbutton.getText());
		
		driver.switchTo().defaultContent();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

		
//		driver.get("http://demo.guru99.com/test/guru99home/");
//		
//		int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
//		WebElement examplewebelemnt=driver.findElement(By.id("//*[@id='a077aa5e']"));
//		driver.switchTo().frame(examplewebelemnt);
//		WebElement Firstframe=driver.findElement(By.id("/html/body/a"));
//		String a=Firstframe.getAttribute("href");
//		System.out.println(a);
//		//driver.switchTo().frame("");
//		
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame("frame2");
//		WebElement secondframe=driver.findElement(By.id("sampleHeading"));
//		String b=secondframe.getText();
//		System.out.println(b);
//		
//		driver.quit();
