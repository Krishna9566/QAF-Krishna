package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhanlde {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","D:\\Krishna\\new\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.leafground.com/pages/Dropdown.html");
    
    WebElement dropdownone=driver.findElement(By.id("dropdown1"));
    //dropdownone.click();
    //List<WebElement> dropdownvalue=driver.findElements(By.xpath("//*[@id=\"dropdown1\"]/option"));
    Select select = new Select(dropdownone);
    select.selectByIndex(2);
    
    WebElement dropdowntwo=driver.findElement(By.name("dropdown2"));
    Select selectone = new Select(dropdowntwo);
    selectone.selectByVisibleText("Selenium");
    
    WebElement dropdownthree=driver.findElement(By.id("dropdown3"));
    Select selecttwo = new Select(dropdownthree);
    selecttwo.selectByValue("1");
    
    List<WebElement> Listofoption=driver.findElements(By.xpath("//*[@class=\"dropdown\"]/option"));
    System.out.println("list size of dropdowns "+Listofoption.size());
    
  driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select")).sendKeys("UFT/QTP");
  
  Thread.sleep(2000);
  WebElement dropdownselect=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
  Select selecthree = new Select(dropdownselect);
  selecthree.selectByValue("1");
  selecthree.selectByValue("2");
  Thread.sleep(2000);
  
  driver.quit();
	}

}
