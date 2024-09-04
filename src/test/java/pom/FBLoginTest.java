package pom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FBLoginTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FBLoginPage login=new FBLoginPage(driver);
		login.setEmail("fghjfgh@gmail.com");
		login.setPwd("fg@4ffg");
		login.clickLogin();
		Thread.sleep(9000);
		driver.quit();
		

	}

}
