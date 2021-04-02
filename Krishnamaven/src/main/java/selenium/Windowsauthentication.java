package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowsauthentication {
	
	static public void usingrobotclass() throws AWTException {
		
		Robot robot = new Robot();
		
		String username = "admin";
		String password="admin";
		
		StringSelection stringselect = new StringSelection(username);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    
		StringSelection stringselectpass = new StringSelection(password);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselectpass, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://the-internet.herokuapp.com/basic_auth");

		Windowsauthentication.usingrobotclass();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
