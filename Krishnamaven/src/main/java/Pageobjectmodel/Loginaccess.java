package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginaccess {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		
		PageFactory.initElements(driver, Loginmethod.class);
		
		
		Loginmethod.userName.sendKeys("admin");
		Loginmethod.password.sendKeys("Krishna@04");
		Loginmethod.login.click();
		
		Thread.sleep(2000);
		
//		Loginmethod.username.sendKeys("admin");
//		Loginmethod.password.sendKeys("Krishna@04");
//		Loginmethod.buttonclick.click();
		

//		Loginmethod.username(driver).sendKeys("admin");
//		Loginmethod.password(driver).sendKeys("Krishna@04");
//		Loginmethod.buttonclick(driver).click();
		
		driver.quit();
	}


}
