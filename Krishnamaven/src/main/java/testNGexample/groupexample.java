package testNGexample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class groupexample {
	@Test(groups= {"one"})
	@Parameters("paramss")
	public void firstOne(String value)
	{
		System.out.println("First case" +value);
	}
	@Test(groups= {"one"})
	public void secondOne()
	{
		System.out.println("Second case");
	}
	@Test(groups= {"one"})
	public void thirdOne()
	{
		System.out.println("Third case");
	}
	@Test(groups= {"two"})
	public void fourthOne()
	{
		System.out.println("Fourth case");	
	}
}
