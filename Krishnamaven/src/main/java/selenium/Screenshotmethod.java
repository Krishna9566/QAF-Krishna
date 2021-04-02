package selenium;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshotmethod {
	static WebDriver driver;
	
	public void takesss() throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);		
		File destination=new File("D://Krishna//Images//Sample.png");
		FileHandler.copy(sourcefile, destination);
		//FileUtils.copyFile(sourcefile, destination);
	}
	
	public void usingrobotclass() throws AWTException, IOException
	{
		Robot robot=new Robot();
	    Rectangle rectangle=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	    BufferedImage source=robot.createScreenCapture(rectangle);
	    File destination=new File("D://Krishna//Images//Samplerobot.png");
	    ImageIO.write(source, "png", destination);
	}
	
	public void usingashot() throws IOException
	{
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "jpg", new File("D://Krishna//Images//Sampleashot.png"));
	}
	
	public static void main(String[] args) throws IOException, AWTException{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");

		//screenshot method
		Screenshotmethod ss=new Screenshotmethod();
	    ss.takesss();
		
		ss.usingashot();
		
		WebElement alertbutton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertbutton.click();
		ss.usingrobotclass();
	
		driver.quit();
	}
}
