package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppSkillRallyRegisterTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		DemoAppSkillRallyRegisterPage register=new DemoAppSkillRallyRegisterPage(driver);
		register.setFirstName("Pravalika");
		Thread.sleep(2000);
		register.setLastName("G");
		Thread.sleep(2000);
		register.setEmail("ghgh345@gmail.com");
		Thread.sleep(2000);
		register.setPasword("yui@gt5");
		Thread.sleep(2000);
		register.setConfirmPassword("yui@gt5");
		
		register.clickAlreadyMembershipLink();
		//register.clickHomeLink();
		//register.clickRegisterBTN();
		Thread.sleep(2000);
		driver.quit();

	}

}
