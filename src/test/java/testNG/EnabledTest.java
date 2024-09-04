package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledTest 
{

	@Test(invocationCount=-2)
	public void demo1()
	{
		Reporter.log("demo1",true);
	}
	@Test
	public void demo2()
	{
		Reporter.log("demo1",true);
	}
	@Test(enabled=true)
	public void demo3()
	{
		Reporter.log("demo1",true);
	}
	@Test(enabled=false)
	public void demo4()
	{
		Reporter.log("demo1",true);
	}

}
