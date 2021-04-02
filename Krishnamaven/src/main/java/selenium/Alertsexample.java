package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertbutton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertbutton.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement alertbuttonone = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		alertbuttonone.click();
		Thread.sleep(2000);
		alert.dismiss();

		WebElement linebreak = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
		linebreak.click();
		Thread.sleep(2000);
		String line = alert.getText();
		System.out.println(line);
		String expected = "Hello\nHow are you doing today?";
		if (expected.contentEquals(line)) 
			System.out.println("expected");
		alert.accept();
		
		WebElement sweettext = driver.findElement(By.xpath("//button[@id='btn']"));
		sweettext.click();
		Thread.sleep(2000);
		//Alert sweetalert=driver.switchTo().alert();
	    //sweetalert.accept();
		// driver.findElement(By.xpath("//*[@class=\"swal-button
		// swal-button--confirm\"]")).click();
		driver.findElement(By.className("swal-button-container")).click();

		driver.quit();
	}


}
