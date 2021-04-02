package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablesexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Krishna\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> noofrows = driver.findElements(By.xpath("//*[@id=\"table_id\"]//tr"));
		System.out.println("Number of rows "+noofrows.size());
		
		List<WebElement> noofcolumns = driver.findElements(By.xpath("//*[@id=\"table_id\"]//tr[1]//th"));
		System.out.println("Number of columns "+noofcolumns.size());
		
		
		//to get learn to interact with elements progress value
		for(int i=2;i<noofcolumns.size();i++)
		{
			String name=driver.findElement(By.xpath("//*[@id=\"table_id\"]//tr["+i+"]/td")).getText();
			if(name.equals("Learn to interact with Elements"))
			{
				String progressvalue=driver.findElement(By.xpath("//*[@id=\"table_id\"]//tr["+i+"]/td[2]")).getText();
				System.out.println("Learn to interact with Elements progress value "+progressvalue);
				break;
			}			
		}
		int max=0;
		int min=0;
		//to get max of progress value and click checkbox
		for(int i=2;i<noofcolumns.size();i++)
		{
			String user=driver.findElement(By.xpath("//*[@id=\"table_id\"]//tr["+i+"]/td[2]")).getText();
			int b=Integer.parseInt(user.replaceAll("%", ""));
			if(max<b)
			{
				max=b;
			}		
		}
		String percent=Integer.toString(max)+"%";
		System.out.println(percent);
		int count=1;
		List<WebElement> clickvalue=driver.findElements(By.xpath("//td[2]"));
		for (WebElement a : clickvalue) {
			count=count+1;
			String checkpercent=a.getText();
				if(checkpercent.equals(percent))
				{
					System.out.println(count);
					String finalxpath="//*[@id='table_id']//tr["+count+"]/td[2]/following::td[1]/input";
					WebElement checkboxclick=driver.findElement(By.xpath(finalxpath));
					checkboxclick.click();
					Thread.sleep(2000);
					break;
				}
		}		
driver.quit();
	}

}
