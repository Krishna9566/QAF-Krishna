package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class Downloadingfile extends Driverdetails{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/download.html");
//		Downloadingfile down = new Downloadingfile();
//		down.driverdetail("http://www.leafground.com/pages/download.html");
		
		WebElement downloadbutton=driver.findElement(By.xpath("//*[contains(text(),'Excel')]"));
		downloadbutton.click();
		Thread.sleep(2000);
		
	File files=new File("C:\\Users\\Admin\\Downloads");
	File[] listoffiles=files.listFiles();
	for(File stringfile:listoffiles)
	{
		//if(stringfile.toString().contains("testleaf"))
		if(stringfile.getName().equals("testleaf.xlsx"))
		{
			System.out.println(stringfile);
			break;
		}
	}
	driver.quit();
		
	}


}
