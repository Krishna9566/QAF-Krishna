package testNGexample;

import org.testng.annotations.Test;

public class testNGexample {

	@Test(priority=-1)
	public void firstOne()
	{
		System.out.println("First case");
	}
	@Test(priority=0)
	public void secondOne()
	{
		System.out.println("Second case");
	}
	@Test(priority=1)
	public void thirdOne()
	{
		System.out.println("Third case");
	}
	@Test
	public void saOne()
	{
		System.out.println("sa case");
	}
	/*est(groups= {"two"})
	public void fourthOne()
	{
		System.out.println("Fourth case");	
	}*/
}
