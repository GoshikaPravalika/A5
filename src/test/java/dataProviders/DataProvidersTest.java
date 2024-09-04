package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTest
{
	@Test(dataProvider="datal")
	public void bookTicketTest(String from, String to)
	{
		System.out.println("From : "+from+"\tTo : "+to);
	}
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0] ="hyd";
		obj[0][1]="chennai";
		
		obj[1][0]="hyd";
		obj[1][1]="comibatore";
		
		obj[2][0]="hyd";
		obj[2][1]="arunachalam";
		
		return obj;
		
	}

}
